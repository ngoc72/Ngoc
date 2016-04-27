/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.conferencewizard.db;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Emmett
 */
@Entity
public class ConfPaper implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long confPaperId;
    @ManyToMany
    private List<Person> authors;
    private String keywords;
    private String subject;
    private String description;
    private String title;
    private String paper;

    public ConfPaper(Long confPaperId, List<Person> authors, String keywords, String subject, String description, String title, String paper) {
        this.confPaperId = confPaperId;
        this.authors = authors;
        this.keywords = keywords;
        this.subject = subject;
        this.description = description;
        this.title = title;
        this.paper = paper;
    }

    public ConfPaper() {
    }

    public Long getConfPaperId() {
        return confPaperId;
    }

    public void setConfPaperId(Long confPaperId) {
        this.confPaperId = confPaperId;
    }

    public List<Person> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Person> authors) {
        this.authors = authors;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }
    
}
