package com.example.yunheehyeon.a6week;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by yunheehyeon on 2017-03-16.
 */

public class StudentAdapter extends BaseAdapter {

    private ArrayList<Student> stdList;
    private Context context;
    private TextView name;
    private TextView num;
    private Button intro;


    public StudentAdapter(ArrayList<Student> stdList, Context context) {
        this.stdList = stdList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return stdList.size();
    }

    @Override
    public Object getItem(int position) {
        return stdList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context)
                .inflate(R.layout.std_item, parent, false);

        name = (TextView) convertView.findViewById(R.id.stdName);
        num = (TextView) convertView.findViewById(R.id.stdNum);
        intro = (Button) convertView.findViewById(R.id.btn_intro);

        name.setText(stdList.get(position).getName());
        num.setText(stdList.get(position).getStdnum());
        intro.setOnClickListener(new stdListener(position));

        return convertView;
    }

    public class stdListener implements View.OnClickListener{
        int position;
        String ListenerName;
        String ListenerNum;

        public stdListener(int position) {
            this.position = position;
            ListenerName = stdList.get(position).getName();
            ListenerNum = stdList.get(position).getStdnum();
        }

        @Override
        public void onClick(View v) {

            Toast.makeText(context, ListenerName+"/"+ ListenerNum, Toast.LENGTH_LONG).show();
        }
    }

}