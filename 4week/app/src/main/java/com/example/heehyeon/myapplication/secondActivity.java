package com.example.heehyeon.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity implements View.OnClickListener{

    private Intent gIntent;
    private Intent sIntent;
    private String name;
    private String age;
    private Button btnImg;
    private FrameLayout imgFrame;   //이미지 받는 곳
    private ImageView imgView;  // 가져오는 이미지
    private LayoutInflater inflater;
    View itemView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        intiView();

        btnImg = (Button)findViewById(R.id.btn_img);
        btnImg.setOnClickListener(this);
    }
    public void intiView(){
        gIntent = getIntent();
        name = gIntent.getStringExtra("name");
        age = gIntent.getStringExtra("age");

        Toast.makeText(secondActivity.this,name+"/"+age+" 입니다",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onBackPressed() {
        sIntent = new Intent(secondActivity.this,MainActivity.class);
        sIntent.putExtra("send", "잘 받았습니다.");
        setResult(RESULT_OK,sIntent);
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_img:
                    imgFrame = (FrameLayout)findViewById(R.id.frame_img);
                    inflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                    itemView = inflater.inflate(R.layout.second_image, imgFrame , true);
                    //imgView = (ImageView) itemView.findViewById(R.id.view_img);



            }
    }
}
