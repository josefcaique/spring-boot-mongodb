package com.josef.workshopmongo.domain;

import com.josef.workshopmongo.resources.PostResource;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Document
public class Comment implements Serializable {

    private static final long serialVerisonUID = 1L;

    private String text;
    private Date date;

    private Post post;

    private User user;

    public Comment(){}

    public Comment(String text, Date date) {
        this.text = text;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(text, comment.text) && Objects.equals(date, comment.date) && Objects.equals(post, comment.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, date, post);
    }
}
