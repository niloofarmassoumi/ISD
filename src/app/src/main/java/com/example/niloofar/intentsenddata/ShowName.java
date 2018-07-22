package com.example.niloofar.intentsenddata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_name);

        Intent j=getIntent();
        String name=j.getStringExtra("extn");
        TextView nameviewObj=findViewById(R.id.txv_name);
        nameviewObj.setText(name);
    }
}
