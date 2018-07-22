package com.example.niloofar.intentsenddata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendnameObj(View view){

        EditText nameObj=findViewById(R.id.txt_name);
        String name=nameObj.getText().toString();
        Intent i=new Intent(this,ShowName.class);
        i.putExtra("extn",name);

        startActivity(i);


    }




}
