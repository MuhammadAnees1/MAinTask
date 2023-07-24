package com.example.task;

import com.bumptech.glide.Glide;

public class RecycleView1 {
    public Glide itemView;
    private String title;
    private String pic;

    public RecycleView1(String title, String pic) {
        this.title = title;
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}