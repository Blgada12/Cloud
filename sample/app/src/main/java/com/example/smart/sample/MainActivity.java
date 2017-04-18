package com.example.smart.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity
{

    private Toast loginToa,registerToa;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginToa = Toast.makeText(this, "미구현입니다!", Toast.LENGTH_SHORT);
        loginToa.setGravity(Gravity.TOP,0,30);
        registerToa = Toast.makeText(this, "회원가입 비활성화", Toast.LENGTH_LONG);
        registerToa.setGravity(Gravity.BOTTOM,0,30);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btm_login:
                registerToa.cancel();
                loginToa.show();
                break;
            case R.id.btm_register:
                loginToa.cancel();
                registerToa.show();
                break;
        }
    }
}
