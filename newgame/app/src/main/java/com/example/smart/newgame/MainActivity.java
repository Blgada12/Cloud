package com.example.smart.newgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public int selectsong;
    ListView listView;
    SonglistAdapter songListadapter;
    ArrayList<song_items> song_itemsArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, premainActivity.class);
        startActivity(intent);

        listView = (ListView)findViewById(R.id.mainsongs);

        song_itemsArrayList = new ArrayList<song_items>();

        song_itemsArrayList.add(
                new song_items(R.drawable.chu,"츄루리라 츄루리라 땃땃따")
        );
        song_itemsArrayList.add(
                new song_items(R.drawable.gomul,"고물 테레비의 대 역습")
        );
        song_itemsArrayList.add(
                new song_items(R.drawable.x,"추가 예정")
        );



        songListadapter = new SonglistAdapter(MainActivity.this,song_itemsArrayList);
        listView.setAdapter(songListadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView snview = (TextView) findViewById(R.id.viewname);
                TextView sdview = (TextView) findViewById(R.id.viewetc);
                ImageView spview = (ImageView) findViewById(R.id.viewpicture);
                TextView easy = (TextView) findViewById(R.id.easystart);
                TextView normal = (TextView) findViewById(R.id.normalstart);
                TextView hard = (TextView) findViewById(R.id.hardstart);

                switch (position){
                    case 0:
                        snview.setText("샘플 곡 1");
                        sdview.setText("가수 - 유즈키 유카리\n작곡 - 쿠라케P");
                        spview.setImageResource(R.drawable.chu);
                        easy.setText("L.3");
                        normal.setText("L.6");
                        hard.setText("L.8");
                        selectsong = 1;
                        break;
                    case 1:
                        snview.setText("샘플 곡 2");
                        sdview.setText("가수 - 유즈키 유카리\n작곡 - 쿠라케P");
                        spview.setImageResource(R.drawable.gomul);
                        easy.setText("L.2");
                        normal.setText("L.7");
                        hard.setText("L.10");
                        selectsong = 2;
                        break;
                    default:
                        snview.setText("곡이름");
                        sdview.setText("내용");
                        spview.setImageResource(R.drawable.x);
                        easy.setText("L.E");
                        normal.setText("L.N");
                        hard.setText("L.H");
                        selectsong = 0;
                }
            }
        });
    }

    public void onclick(View view) {
        switch (selectsong){
            case 0 :
                break;
            default:
                Intent intent = new Intent(this,sinkActivity.class);
                intent.putExtra("select",selectsong);
                startActivity(intent);
        }
    }
}
