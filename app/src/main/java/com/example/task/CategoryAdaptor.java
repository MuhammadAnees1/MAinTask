package com.example.task;

import android.content.Context;
import android.content.Intent;
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

public class CategoryAdaptor extends RecyclerView.Adapter<CategoryAdaptor.ViewHolder> {

    ArrayList<RecycleView1> categoryDomains;

    public CategoryAdaptor(ArrayList<RecycleView1> categoryDomains) {
        this.categoryDomains = categoryDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.categoryName.setText(categoryDomains.get(position).getTitle());



        String picUrl = "";
        switch (position) {
            case 0:{
                picUrl ="signal_icon";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.view_background));
                break;
            }

            case 1:{
                picUrl ="database";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.recycleview2to3));
                break;
            }
            case 2: {
                picUrl ="financial";
                holder.mainLayout.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.recycleview3to3));
                break;
            }

        }
        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.categoryPic);

        RecycleView1 category = categoryDomains.get(position);
        holder.categoryName.setText(category.getPic());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = holder.itemView.getContext();
                Intent intent = new Intent(context, Cryptocurrency.class);
                context.startActivity(intent);
            }
        });

    }
    @Override
    public int getItemCount() {
        return categoryDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView categoryName , time;
        ImageView categoryPic;
        ConstraintLayout mainLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryName=itemView.findViewById(R.id.categoryName);
            time=itemView.findViewById(R.id.time);
            categoryPic=itemView.findViewById(R.id.categoryPic);
            mainLayout=itemView.findViewById(R.id.mainLayout);
        }
    }
}