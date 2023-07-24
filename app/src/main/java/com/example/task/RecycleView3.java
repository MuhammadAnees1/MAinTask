package com.example.task;
public class RecycleView3 {
    private String title;
    private String text;
    private String pic;

    public RecycleView3(String title, String text , String pic) {
        this.title = title;
        this.text = text;
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


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}