package com.example.spinnerrecycleview.models;


public class president {
    private String Title;
    private String Description;
    private int Thumbnail;

    public president(String title, String description,int thumbnail){
        this.Title = title;
        this.Description = description;
        this.Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public void setThumbnail(int thumbnail) {
        this.Thumbnail = thumbnail;
    }
}


