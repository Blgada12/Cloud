package com.example.smart.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import static com.example.smart.test2.R.*;

public class Main3Activity extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main3);

        Button but1 = (Button) findViewById(id.button1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagemove = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(pagemove);
            }
        });

        Button but2 = (Button) findViewById(id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.goForward();
            }
        });

        Button but3 = (Button) findViewById(id.button3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.reload();
            }
        });

        Button but4 = (Button) findViewById(id.button4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                web.goBack();
            }
        });

        web = (WebView) this.findViewById(R.id.web1);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://google.co.kr");
    }
}
