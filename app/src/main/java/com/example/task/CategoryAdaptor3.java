package com.example.task;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CategoryAdaptor3 extends RecyclerView.Adapter<CategoryAdaptor3.ViewHolder> {

    ArrayList<RecycleView3> array2;
    ArrayList<RecycleView3> array3;

    public CategoryAdaptor3(ArrayList<RecycleView3> categoryDomains) {
        this.array2 = categoryDomains;
        this.array3 = categoryDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder3,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textViewName.setText(array2.get(position).getTitle());
        holder.time.setText(array3.get(position).getText());
        String picUrl = "";
        switch (position) {
            case 0:{
                picUrl ="pdf_icon";
                holder.mainLayout3.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.recycleview2_1to6));
                break;
            }

            case 1:{
                picUrl ="video";
                holder.mainLayout3.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.recycleview2_2to6));
                break;
            }
            case 2: {
                picUrl ="zip";
                holder.mainLayout3.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.recycleview2to3));
                break;
            }
            case 3: {
                picUrl ="file";
                holder.mainLayout3.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.recycleview2_3to6));
                break;
            }
            case 4: {
                picUrl ="excel";
                holder.mainLayout3.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.recycleview2_4to6));
                break;
            }
            case 5: {
                picUrl ="word";
                holder.mainLayout3.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.recycleview2_2to6));
                break;
            }

        }
        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.categoryPic1);
    }
    @Override
    public int getItemCount() {
        return array2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName , time;
        ImageView categoryPic1;
        ConstraintLayout mainLayout3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName=itemView.findViewById(R.id.textViewName);
            time=itemView.findViewById(R.id.time2);
            categoryPic1=itemView.findViewById(R.id.categoryPic1);
            mainLayout3=itemView.findViewById(R.id.mainLayout3);
        }
    }
}