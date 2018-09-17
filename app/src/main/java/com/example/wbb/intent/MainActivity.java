package com.example.wbb.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

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
                String data1 = "on";
                String data2 = "off";
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                if(switch1.isChecked())
                    intent.putExtra("extra_data",data1);
                else
                    intent.putExtra("extra_data",data2);
                startActivity(intent);
            }
        });
    }
}
