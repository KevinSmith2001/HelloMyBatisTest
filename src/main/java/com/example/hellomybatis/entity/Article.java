package com.example.hellomybatis.entity;

public class Article {
    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    private Integer aid;

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

    public String getTitlePic() {
        return titlePic;
    }

    public void setTitlePic(String titlePic) {
        this.titlePic = titlePic;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    private String title;
    private String content;
    private String titlePic;
    private String video;

    @Override
    public String toString() {
        return "Article{" +
                "aid=" + aid +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", titlePic='" + titlePic + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}
