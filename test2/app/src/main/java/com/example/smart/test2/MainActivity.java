package com.example.smart.test2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but1 = (Button) findViewById(R.id.button1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "버튼눌림", Toast.LENGTH_LONG).show();
            }
        });

        Button but2 = (Button) findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent internet = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.co.jp"));
                startActivity(internet);
            }
        });

        Button but3 = (Button) findViewById(R.id.button3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagemove = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(pagemove);
            }
        });

        Button but4 = (Button) findViewById(R.id.button4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagemove = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(pagemove);
            }
        });

        Button but5 = (Button) findViewById(R.id.button5);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagemove = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(pagemove);
            }
        });
    }
}
