/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bean;

public class SearchBean {
    
    private String name,author,publisher,subject,link;
    public SearchBean() {}
    
    public SearchBean(String name, String author, String publisher,String subject) {
		super();
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.subject = subject;
	}
        public SearchBean(String name,String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
        public SearchBean(String subject) {
		super();
		this.subject = subject;
	}
        
        
        public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
        public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
