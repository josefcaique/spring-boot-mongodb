package com.josef.workshopmongo.dto;

import com.josef.workshopmongo.domain.User;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String text;
    private Date date;
    private AuthorDTO auth;

    public CommentDTO(){}

    public CommentDTO(String text, Date date, AuthorDTO auth) {
        this.text = text;
        this.date = date;
        this.auth = auth;
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

    public AuthorDTO getAuth() {
        return auth;
    }

    public void setAuth(AuthorDTO auth) {
        this.auth = auth;
    }


}
