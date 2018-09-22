package com.example.wbb.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button2 = (Button) findViewById(R.id.button_2);
        final Switch switch2 = (Switch) findViewById(R.id.switch_2);
        TextView textview = (TextView) findViewById(R.id.text_2);
        final Intent intent = getIntent();
        String data = intent.getStringExtra("extra_data");
        textview.setText(data);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String data;
                if(switch2.isChecked())
                    data="2 is on";
                else
                    data="2 is off";
                intent.putExtra("data_return",data);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed(){
        Switch switch2 = (Switch) findViewById(R.id.switch_2);
        Intent intent = new Intent();
        String data;
        if(switch2.isChecked())
            data="2 is on";
        else
            data="2 is off";
        intent.putExtra("data_return",data);
        setResult(RESULT_OK,intent);
        finish();
    }
}
