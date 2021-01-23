package net.smallacademy.firenote.model;

import java.util.Date;

public class Note {
    private String title;
    private String content;
    String dtModified;
    String dtCreated;





    public Note(){}
    public Note(String title,String content,String dtCreated,String dtModified){
        this.title = title;
        this.content = content;
        this.dtCreated=dtCreated;
        this.dtModified=dtModified;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getDtModified() {
        return dtModified;
    }

    public String getDtCreated() {
        return dtCreated;
    }

}
