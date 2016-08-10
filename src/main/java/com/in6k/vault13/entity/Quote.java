package com.in6k.vault13.entity;

/**
 * Created by Artem Klots on 8/9/16.
 */
public class Quote {
    private String author;
    private String phrase;

    public Quote(String author, String phrase) {
        this.author = author;
        this.phrase = phrase;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "author='" + author + '\'' +
                ", phrase='" + phrase + '\'' +
                '}';
    }
}
