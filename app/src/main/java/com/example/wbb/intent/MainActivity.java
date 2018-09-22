package com.example.wbb.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button_1);
        final Switch switch1 = (Switch) findViewById(R.id.switch_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String data;
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                if(switch1.isChecked())
                    data = "1 is on";
                else
                    data = "1 is off";
                intent.putExtra("extra_data",data);
                startActivityForResult(intent,1);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        TextView textview = (TextView) findViewById(R.id.text_1);
        switch (requestCode){
            case 1:
                if(resultCode == RESULT_OK){
                    String returnedData = data.getStringExtra("data_return");
                    textview.setText(returnedData);
                }
                break;
            default:
        }
    }
}
