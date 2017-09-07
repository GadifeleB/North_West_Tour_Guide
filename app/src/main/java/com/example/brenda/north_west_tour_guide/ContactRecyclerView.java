package com.example.brenda.north_west_tour_guide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Brenda on 2017/08/16.
 */

public class ContactRecyclerView  extends RecyclerView.Adapter<ContactRecyclerView.Viewholder>  {


    //declare Variables
    Context mContext;
    List<Contact> mContactList;


    //creating constructor
    public ContactRecyclerView(Context mcontext, List<Contact> mContactlist) {
        this.mContext = mcontext;
        this.mContactList = mContactlist;
    }

    @Override
    public ContactRecyclerView.Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact,parent,false);
        Viewholder viewholder = new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(final ContactRecyclerView.Viewholder holder, final int position) {

        final Contact contact = mContactList.get(position);

        holder.mNames.setText(contact.getName());
        holder.mSurname.setText(contact.getSurname());
        holder.mImage.setImageResource(Integer.parseInt(String.valueOf(contact.getImage())));
        holder.mcardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (position == 0) {
                    Intent i = new Intent(mContext, SecondActivity.class);
                    i.putExtra("name", contact);
                    mContext.startActivity(i);

                } else if (position == 1) {
                    Intent i = new Intent(mContext, Third_Activity.class);
                    i.putExtra("name", contact);
                    mContext.startActivity(i);

                } else if (position == 2) {
                    Intent i = new Intent(mContext,Fourth_Activity.class);
                    i.putExtra("name", contact);
                    mContext.startActivity(i);
                }
            }
        });
    }

    @Override
    //shows you the number of items you gonna c on screen (how big the array list is)
    public int getItemCount() {

        return mContactList.size() ;
    }

    public class Viewholder extends RecyclerView.ViewHolder {

        ImageView mImage;
        TextView mNames,mSurname;
        CardView mcardView;

        public Viewholder(View itemView) {
            super(itemView);

            mNames = (TextView) itemView.findViewById(R.id.Text_view_names);
            mSurname = (TextView) itemView.findViewById(R.id.Surname);
             mImage =(ImageView)itemView.findViewById(R.id.image_view_image);
            mcardView = (CardView)itemView.findViewById(R.id.cardview);
        }
    }

}
