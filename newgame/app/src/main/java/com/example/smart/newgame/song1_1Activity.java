package com.example.smart.newgame;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class song1_1Activity extends AppCompatActivity {

    int notesuccuess,handle1,handle2,handle3,combocount,highcombo,suc;
    String song1,mod1;
    int song[] = {1000, 2000, 3000, 4000,5000,6000,7000,8000,9000,10000,11000,12000,13000,14000,15000,16000,17000,20000,23000};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_song1_1);
        song1 = "츄루리라 츄루리라 땃땃따";
        mod1 = "스토리 모드";
        handle2 = 0;
        combocount = 0;
        highcombo = 0;
        suc = 0;
        final Intent intent = new Intent(this,resultActivity.class);
        final Handler handler = new Handler();
        for (handle2 = 0; handle2 <= song.length - 3; handle2++) {
            if(handle2 == 2 || handle2 == 5 || handle2 == 6 || handle2 == 8 || handle2 == 11 || handle2 == 15) {
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        notesuccuess = 0;
                        note2();
                    }
                }, song[handle2]);
            }else{
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        notesuccuess = 0;
                        note1();
                    }
                }, song[handle2]);
            }
        }
        handler.postDelayed(new Runnable() {
            TextView fin1 = (TextView)findViewById(R.id.fin);
            TextView cbn = (TextView)findViewById(R.id.combon);


            @Override
            public void run() {
                cbn.setText("Finish!!!!");
                fin1.setText("Ready to see result");

            }
        }, song[song.length - 2]);
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                intent.putExtra("name", song1);
                intent.putExtra("mod", mod1);
                intent.putExtra("full", song.length - 2);
                intent.putExtra("succ", suc);
                intent.putExtra("percent",(double)suc/(double)(song.length-2)*(double)100);
                intent.putExtra("hcom", highcombo);
                startActivity(intent);
                finish();
            }
        }, song[song.length - 1]);
    }

    public void note1() {
        Handler handler = new Handler();
        final LinearLayout flashback = (LinearLayout) findViewById(R.id.flash);
        final int note1[] = {0, 800, 900};
        for (handle1 = 0; handle1 <= note1.length - 1; handle1++) {
            switch (handle1) {
                case 0:
                    handler.postDelayed(new Runnable() {
                        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                        @Override
                        public void run() {
                            vibrator.vibrate(800);
                            handle3 = 1;
                        }
                    }, note1[handle1]);
                    break;

                case 1:
                    handler.postDelayed(new Runnable() {
                        TextView cbn = (TextView)findViewById(R.id.combon);
                        TextView fin1 = (TextView)findViewById(R.id.fin);

                        @Override
                        public void run() {
                            handle3 = 0;
                            if(notesuccuess == 1) {
                                flashback.setBackgroundColor(Color.rgb(51, 51, 255));
                                combocount++;
                                suc++;
                                fin1.setText(String.format("%.2f",(double)suc/(double)(song.length-2)*(double)100)+"%");
                                if(combocount>highcombo) highcombo=combocount;
                                if(combocount>=3){
                                    cbn.setText(Integer.toString(combocount)+" combo!");
                                }
                            }else{
                                flashback.setBackgroundColor(Color.rgb(255, 51, 51));
                                combocount = 0;
                                cbn.setText("");
                                fin1.setText(String.format("%.2f",(double)suc/(double)(song.length-2)*(double)100)+"%");
                            }
                        }
                    }, note1[handle1]);
                    break;

                case 2:
                    handler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            flashback.setBackgroundColor(Color.rgb(51, 51, 51));
                        }
                    }, note1[handle1]);
                    break;
            }
        }
    }
    public void note2() {
        Handler handler = new Handler();
        final LinearLayout flashback = (LinearLayout) findViewById(R.id.flash);
        final int note1[] = {0,525,800,900};
        for (handle1 = 0; handle1 <= note1.length - 1; handle1++) {
            switch (handle1) {
                case 0:
                    handler.postDelayed(new Runnable() {
                        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                        @Override
                        public void run() {
                            vibrator.vibrate(275);
                            handle3 = 1;
                        }
                    }, note1[handle1]);
                    break;
                case 1:
                    handler.postDelayed(new Runnable() {
                        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                        @Override
                        public void run() {
                            vibrator.vibrate(275);
                        }
                    }, note1[handle1]);
                    break;
                case 2:
                    handler.postDelayed(new Runnable() {
                        TextView cbn = (TextView)findViewById(R.id.combon);
                        TextView fin1 = (TextView)findViewById(R.id.fin);

                        @Override
                        public void run() {
                            handle3 = 0;
                            if(notesuccuess == 2) {
                                flashback.setBackgroundColor(Color.rgb(51, 51, 255));
                                combocount++;
                                suc++;
                                fin1.setText(String.format("%.2f",(double)suc/(double)(song.length-2)*(double)100)+"%");
                                if(combocount>highcombo) highcombo=combocount;
                                if(combocount>=3){
                                    cbn.setText(Integer.toString(combocount)+" combo!");
                                }
                            }else{
                                flashback.setBackgroundColor(Color.rgb(255, 51, 51));
                                combocount = 0;
                                cbn.setText("");
                                fin1.setText(String.format("%.2f",(double)suc/(double)(song.length-2)*(double)100)+"%");
                            }
                        }
                    }, note1[handle1]);
                    break;

                case 3:
                    handler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            flashback.setBackgroundColor(Color.rgb(51, 51, 51));
                        }
                    }, note1[handle1]);
                    break;
            }
        }
    }

    public void onclick1(View view) {
        if(handle3 == 1){notesuccuess++;}
    }
}
