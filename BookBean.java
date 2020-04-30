
package com.example.bean;
public class BookBean {
private String callno,name,author,publisher,subject,link;
public BookBean() {
	super();
	// TODO Auto-generated constructor stub
}
public BookBean( String name, String author, String publisher, String subject, String link) {
	super();
	this.callno = callno;
	this.name = name;
	this.author = author;
	this.publisher = publisher;
	this.subject = subject;
        this.link = link;
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
public String getLink() {
	return link;
}
public void setLink(String link) {
	this.link = link;
}

}
