package com.example.spinnerrecycleview.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spinnerrecycleview.President_Activity;
import com.example.spinnerrecycleview.R;
import com.example.spinnerrecycleview.models.president;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.presidentViewHolder> {

    private Context mContext;
    private List<president> mData;

    public RecyclerViewAdapter(Context mContext, List<president> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Nullable
    @Override
    public presidentViewHolder onCreateViewHolder(@Nullable ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate( R.layout.cardview_item, parent,false);
        return new presidentViewHolder( view );
    }


    @Override
    public void onBindViewHolder(@Nullable presidentViewHolder holder, final int position) {
        holder.p_title.setText(mData.get(position).getTitle());
        holder.img_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,President_Activity.class);

                //prabha the data to the president activity
                intent.putExtra("President Name",mData.get(position).getTitle());
                intent.putExtra("Describtion",mData.get(position).getDescription());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());

                //start the activity
                mContext.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class presidentViewHolder extends RecyclerView.ViewHolder{

        TextView p_title;
        ImageView img_thumbnail;
        CardView cardView;

        public presidentViewHolder(View itemView){
            super(itemView);


            p_title = (TextView) itemView.findViewById(R.id.cardview_name_id);
            img_thumbnail = (ImageView)itemView.findViewById(R.id.cardview_image_id);
            cardView =(CardView) itemView.findViewById(R.id.cardview_id);

        }

    }

}


