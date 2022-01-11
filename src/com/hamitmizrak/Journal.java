package com.hamitmizrak;

public class Journal {
    private int id;
    private String journalName;
    private String articleTitle;
    private String author;
    private int year;
    private String journalAbstract;
    private String keywords;
    private String doi;

    public Journal() {
    }

    public Journal(int id, String journalName, String articleTitle, String author, int year, String journalAbstract, String keywords, String doi) {
        this.id = id;
        this.journalName = journalName;
        this.articleTitle = articleTitle;
        this.author = author;
        this.year = year;
        this.journalAbstract = journalAbstract;
        this.keywords = keywords;
        this.doi = doi;
    }

    @Override
    public String toString() {
        return id +
                "{" + journalName +
                "{" + articleTitle +
                "{" + author +
                "{" + year +
                "{" + journalAbstract +
                "{" + keywords +
                "{" + doi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getJournalAbstract() {
        return journalAbstract;
    }

    public void setJournalAbstract(String journalAbstract) {
        this.journalAbstract = journalAbstract;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }
}
