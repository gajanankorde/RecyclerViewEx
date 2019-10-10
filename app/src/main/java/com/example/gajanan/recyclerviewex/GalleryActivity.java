package com.example.gajanan.recyclerviewex;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class GalleryActivity extends AppCompatActivity {


    ImageView imageView;
    TextView txtName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);// to enable up button

        imageView=(ImageView)findViewById(R.id.pic);
        txtName=(TextView)findViewById(R.id.image_description);


        Intent intent=getIntent();
        imageView.setImageResource(intent.getIntExtra("personImages",0));

        //String imageName = getIntent().getStringExtra("image_name");

        txtName.setText(intent.getStringExtra("personNames"));


    }

}
