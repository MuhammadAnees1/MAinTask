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

public class CategoryAdaptor2 extends RecyclerView.Adapter<CategoryAdaptor2.ViewHolder> {

    ArrayList<RecycleView2> array2;
    ArrayList<RecycleView2> array3;

    public CategoryAdaptor2(ArrayList<RecycleView2> categoryDomains) {
        this.array2 = categoryDomains;
        this.array3 = categoryDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder2,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.text1.setText(array2.get(position).getTitle());
        holder.timeTxt.setText(array3.get(position).getText());
        String picUrl = "";
        switch (position) {
            case 0:{
                picUrl ="video1";
                holder.mainLayout2.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.view_background2));
                break;
            }

            case 1:{
                picUrl ="pdf_icon";
                holder.mainLayout2.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.view_background2));
                break;
            }
            case 2: {
                picUrl ="zip";
                holder.mainLayout2.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.view_background2));
                break;
            }
            case 3: {
                picUrl ="file";
                holder.mainLayout2.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.view_background2));
                break;
            }
            case 4: {
                picUrl ="excel";
                holder.mainLayout2.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.view_background2));
                break;
            }
            case 5: {
                picUrl ="word";
                holder.mainLayout2.setBackground(ContextCompat.getDrawable(holder.itemView.getContext(),R.drawable.view_background2));
                break;
            }

        }
        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(picUrl,"drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .into(holder.picCard);
    }
    @Override
    public int getItemCount() {
        return array2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView text1 , timeTxt;
        ImageView picCard;
        ConstraintLayout mainLayout2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text1=itemView.findViewById(R.id.text1);
            timeTxt=itemView.findViewById(R.id.timeTxt);
            picCard=itemView.findViewById(R.id.picCard);
            mainLayout2=itemView.findViewById(R.id.mainLayout2);
        }
    }
}