package com.example.smart.newgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class sinkActivity  extends AppCompatActivity {

    private int sID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sink);
        final Intent intent = getIntent();
        final int num1 = intent.getIntExtra("select",0);

        final Toast noob = Toast.makeText(this,"미구현", Toast.LENGTH_LONG);
        final Intent intent1_1 = new Intent(this,song1_1Activity.class);

        final RadioGroup rg = (RadioGroup)findViewById(R.id.modselect);

        final RadioButton rb1 = (RadioButton)findViewById(R.id.storymod);
        final RadioButton rb2 = (RadioButton)findViewById(R.id.normalmod);
        final RadioButton rb3 = (RadioButton)findViewById(R.id.technicalmod);

        Button start = (Button)findViewById(R.id.musicstart);
        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (num1) {
                    case 1:
                        switch (rg.getCheckedRadioButtonId()){
                            case R.id.storymod:
                                startActivity(intent1_1);
                                finish();
                                break;
                            case R.id.normalmod:
                                noob.show();
                                break;
                            case R.id.technicalmod:
                                noob.show();
                                break;
                        }
                        break;
                    case 2:
                        switch (rg.getCheckedRadioButtonId()) {
                            case R.id.storymod:
                                noob.show();
                                break;
                            case R.id.normalmod:
                                noob.show();
                                break;
                            case R.id.technicalmod:
                                noob.show();
                                break;
                        }
                        break;
                }
            }
        });



        TextView songname = (TextView) findViewById(R.id.nameview);

        switch (num1){
            case 1:
                songname.setText("츄루리라 츄루리라 땃땃따");
                break;
            case 2:
                songname.setText("고물 테레비의 대 역습");
                break;
        }

        final TextView sinkv1 = (TextView)findViewById(R.id.sinkv);
        SeekBar sinkinput = (SeekBar) findViewById(R.id.sinkn);

        sinkinput.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sinkv1.setText(Integer.toString(progress-5));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
