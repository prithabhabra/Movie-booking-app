package com.example.mybooking;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class secondact extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.s);
        TextView t1;
        Uri i=getIntent().getData();
        String m=i.toString();
        t1=(TextView)findViewById(R.id.td);
        t1.setText("TIME "+m);


    }
}
