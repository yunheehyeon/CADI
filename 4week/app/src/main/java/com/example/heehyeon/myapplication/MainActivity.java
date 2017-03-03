package com.example.heehyeon.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnEnroll;
    private EditText editName;
    private EditText editAge;
    private Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiView();
    }

    public void intiView(){
        btnEnroll = (Button)findViewById(R.id.btn_enroll);
        editName = (EditText)findViewById(R.id.edName);
        editAge = (EditText)findViewById(R.id.edAge);

        btnEnroll.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_enroll:
                intent = new Intent(MainActivity.this, secondActivity.class);
                intent.putExtra("name", editName.getText().toString());
                intent.putExtra("age", editAge.getText().toString());
                startActivityForResult(intent, 1001);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1001:
                if(resultCode == RESULT_OK){
                    Toast.makeText(MainActivity.this,data.getStringExtra("send"),Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
