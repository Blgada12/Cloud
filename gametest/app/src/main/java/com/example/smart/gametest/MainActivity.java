package com.example.smart.gametest;

import android.app.Activity;
import android.content.Context;
import android.os.Vibrator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] n1 = {0};
        long nStart=0;
        long nEnd=0;

        Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        View.OnClickListener lis1 = new View.OnClickListener(){
            public void onClick(View v)
            {
                n1[0] = 1;
            }
        };
        vib.vibrate(1000);
        nStart = System.currentTimeMillis();
        Button btnCl = (Button) findViewById(R.id.btnN);
        btnCl.setOnClickListener(lis1);
        for(;;) {
            nEnd = System.currentTimeMillis();
            if(2000>=nEnd-nStart && nEnd-nStart>=0 && n1[0] ==1){
            Toast.makeText(this, "Perfect!",Toast.LENGTH_SHORT);
                n1[0] = 0;
                break;
            }
        }
    }
}
/*
    public void onClick(View view) {
        Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        switch (view.getId()){
            case R.id.btnN:

                break;
            case R.id.btnS:
                long nStart;
                long nEnd = 0;
                vib.vibrate(1000);
                nStart = System.currentTimeMillis();
                for(;;) {
                    nEnd = System.currentTimeMillis();
                    if (nEnd - nStart >= 0 && nEnd - nStart <= 1) {
                        Toast.makeText(this, "perfect", Toast.LENGTH_SHORT).show();
                    }
                }
            case R.id.btnE:

                break;
        }
    }
}
*/