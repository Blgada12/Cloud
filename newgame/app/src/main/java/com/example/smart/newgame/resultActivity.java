package com.example.smart.newgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        String name1 = intent.getStringExtra("name");
        String mod1 = intent.getStringExtra("mod");
        int full = intent.getIntExtra("full",0);
        int suc = intent.getIntExtra("succ",0);
        int hcombo = intent.getIntExtra("hcom",0);
        Double srate = intent.getDoubleExtra("percent",0);

        TextView name = (TextView)findViewById(R.id.rname);
        TextView mod = (TextView)findViewById(R.id.rmod);
        TextView rate = (TextView)findViewById(R.id.rrate);
        TextView percent = (TextView)findViewById(R.id.rpercent);
        TextView highc = (TextView)findViewById(R.id.highcom);

        name.setText(name1);
        mod.setText(mod1);
        rate.setText("성공률 : "+Integer.toString(suc)+"/"+Integer.toString(full));
        percent.setText(String.format("%.2f",srate)+"%");
        highc.setText("최다 콤보 : "+ Integer.toString(hcombo));
    }

    public void onclick2(View view) {
        finish();
    }
}