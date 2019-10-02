package com.example.gajanan.recyclerviewex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // ArrayList for person names
    ArrayList<String> personNames = new ArrayList<String>(Arrays.asList("Shri Jawaharlal Nehru",
            "Shri Lal Bahadur Shastri",
            "Mrs. Indira Gandhi",
            "Shri Morarji Desai",
            "Shri Charan Singh",
            "Shri Rajiv Gandhi",
            "Shri Vishwanath Pratap Singh",
            "Shri Chandra Shekhar",
            "Shri P. V. Narasimha Rao",
            "Shri Atal Bihari Vajpayee",
            "Shri H. D. Deve Gowda",
            "Shri Inder Kumar Gujral",
            "Dr. Manmohan Singh",
            "Shri Narendra Modi"
    ));

    ArrayList<Integer> personImages = new ArrayList<Integer>(Arrays.asList(R.mipmap.nehru,
            R.mipmap.shashtri,
            R.mipmap.indira,
            R.mipmap.desai,
            R.mipmap.charan,
            R.mipmap.rajiv,
            R.mipmap.vpsingh,
            R.mipmap.shekhar,
            R.mipmap.rao,
            R.mipmap.vajpayee,
            R.mipmap.gowda,
            R.mipmap.gujral,
            R.mipmap.singh,
            R.mipmap.nmodi
    ));

    ArrayList<String>  tenure= new ArrayList<String>(Arrays.asList(
            "August 15, 1947 - May 27, 1964",
            "June 09, 1964 - January 11, 1966",
            "January 14, 1980 - October 31, 1984 and January 24, 1966 - March 24, 1977",
            "March 24, 1977 - July 28, 1979",
            "July 28, 1979 - January 14, 1980",
            "October 31, 1984 - December 2, 1989",
            "December 2, 1989 - Nov. 10, 1990",
            "November 10, 1990 - June 21, 1991",
            "June 21, 1991- May 16, 1996",
            "March 19, 1998 - May 22, 2004 and May 16, 1996 - June 1, 1996",
            "June 1, 1996 - April 21, 1997",
            "April 21, 1997 - March 19, 1998",
            "May 22, 2004 - 26th May 2014",
            "May 26, 2014 - Incumbent"
            ));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // set a LinearLayoutManager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());

        // set a LinearLayoutManager with horizontal orientation
       // LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);

        recyclerView.setLayoutManager(linearLayoutManager);
        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        //CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, personNames,personImages);
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, personNames,personImages,tenure);

        //recyclerView.addItemDecoration(new MyDividerItemDecoration(this, MyDividerItemDecoration.VERTICAL_LIST, 36));

        recyclerView.addItemDecoration(new MyDividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
    }
}
