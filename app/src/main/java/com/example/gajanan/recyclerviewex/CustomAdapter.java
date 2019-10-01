package com.example.gajanan.recyclerviewex;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;





public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    ArrayList<String> personNames;
    ArrayList<Integer> personImages;
    ArrayList<String> tenure; //
    Context context;


    /*
    public CustomAdapter(Context context, ArrayList<String> personNames,ArrayList<Integer> personImages) {
        this.context = context;
        this.personNames = personNames;
        this.personImages=personImages;
    }
    */
    public CustomAdapter(Context context, ArrayList<String> personNames,ArrayList<Integer> personImages,ArrayList<String> tenure) {
        this.context = context;
        this.personNames = personNames;
        this.personImages=personImages;
        this.tenure=tenure;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }
    /*
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in items
        holder.name.setText(personNames.get(position));


        //holder.image.setImageResource(personImages.get(position));

        //we are using glide img lib to load img in circular fashion



        // requires updated SDK repository
        Glide.with(context)
                .load(contact.getImage())
                .apply(RequestOptions.circleCropTransform())
                .into(holder.thumbnail);



        Glide.with(context)
                .load(personImages.get(position)) // add your image url
                .transform(new CircleTransform(context)) // applying the image transformer
                .into(holder.image);


        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a toast with person name on item click
                Toast.makeText(context, personNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    */

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in items
        holder.name.setText(personNames.get(position));
        holder.tenure.setText(tenure.get(position));

        //holder.image.setImageResource(personImages.get(position));

        //we are using glide img lib to load img in circular fashion



        /*
        // requires updated SDK repository
        Glide.with(context)
                .load(contact.getImage())
                .apply(RequestOptions.circleCropTransform())
                .into(holder.thumbnail);
        */


        Glide.with(context)
                .load(personImages.get(position)) // add your image url
                .transform(new CircleTransform(context)) // applying the image transformer
                .into(holder.image);


        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a toast with person name on item click
                Toast.makeText(context, "You Clicked : "+personNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public int getItemCount() {
        return personNames.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        // initialize the item view's
        TextView name;
        TextView tenure;
        ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);

            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.name);
            image=(ImageView)itemView.findViewById(R.id.img);
            tenure = (TextView) itemView.findViewById(R.id.tenure);

        }
    }


}


