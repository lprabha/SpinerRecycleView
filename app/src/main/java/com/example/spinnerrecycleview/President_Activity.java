package com.example.spinnerrecycleview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class President_Activity extends AppCompatActivity {

    private TextView tvtitle, tvdescription;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president_);

        tvtitle =(TextView) findViewById( R.id.president_name);
        tvdescription = (TextView) findViewById( R.id.president_desc );
        img = (ImageView) findViewById( R.id.president_image );

        //Receive data
        Intent intent =getIntent();
        String pre_name = intent.getExtras().getString( "Title" );
        String pre_description = intent.getExtras().getString( "Description" );
        int pre_image = intent.getExtras().getInt("Thumbnail");

        //setting values

        tvtitle.setText(pre_name);
        tvdescription.setText(pre_description);
        img.setImageResource(pre_image);

    }
}
