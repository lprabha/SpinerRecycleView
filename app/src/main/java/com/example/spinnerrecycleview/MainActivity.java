package com.example.spinnerrecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spinnerrecycleview.adapters.RecyclerViewAdapter;
import com.example.spinnerrecycleview.models.president;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    List<president> first_president;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        first_president = new ArrayList<>();

        first_president.add(new president("Jimmy Carter","This is descripasdfasdfasdfffasdfasdfasdfasdfasdfasdxczvzxcvzxvxcqwrqwetionof the  president",R.drawable.jimmy));
        first_president.add(new president("Ronald Wilson","This is descriptionof the  president",R.drawable.ronald));
        first_president.add(new president("George H.W. Bush","This is descriptionof the  president",R.drawable.george));
        first_president.add(new president("Gerald Ford","This is descriptionof the  president",R.drawable.gerald));
        first_president.add(new president("Richard Nixon","This is descriptionof the  president",R.drawable.richard));
        first_president.add(new president("Bill Clinton","This is descriptionof the  president",R.drawable.bill));

        RecyclerView myRecycleView =(RecyclerView) findViewById(R.id.recycleview_id);
        RecyclerViewAdapter myAdaptor = new RecyclerViewAdapter(this,first_president);
        myRecycleView.setLayoutManager(new GridLayoutManager(this,2));
        myRecycleView.setAdapter(myAdaptor);
    }
}
