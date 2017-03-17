package com.example.yunheehyeon.a6week;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView stdView;
    private ArrayList<Student> stdList;
    private StudentAdapter stdAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stdView = (ListView) findViewById(R.id.mainList);

        stdList = new ArrayList<>();

        stdList.add(new Student("aaa", "123123"));
        stdList.add(new Student("bbb", "234234"));
        stdList.add(new Student("ccc", "345345"));
        stdList.add(new Student("ddd", "456456"));
        stdList.add(new Student("eee", "567567"));
        stdList.add(new Student("fff", "678678"));
        stdList.add(new Student("ggg", "789789"));
        stdList.add(new Student("hhh", "890890"));
        stdList.add(new Student("iii", "123123"));
        stdList.add(new Student("ggg", "234234"));
        stdList.add(new Student("kkk", "345345"));
        stdList.add(new Student("lll", "456456"));
        stdList.add(new Student("mmm", "567567"));
        stdList.add(new Student("nnn", "678678"));

        stdAdapter = new StudentAdapter(stdList, MainActivity.this);

        stdView.setAdapter(stdAdapter);

    }
}
