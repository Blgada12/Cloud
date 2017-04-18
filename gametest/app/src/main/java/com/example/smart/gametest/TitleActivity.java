package com.example.smart.gametest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TitleActivity extends Activity{
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        switch (view.getId()){
            case R.id.btnSt:
                startActivity(intent);
                break;
        }
    }
}
