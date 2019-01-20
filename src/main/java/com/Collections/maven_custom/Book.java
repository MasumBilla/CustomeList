package com.Collections.maven_custom;

public class Book {
	
	String authorName;
	String name;
	double price;
	
	
	public Book(String authorName, String name, double price) {
		super();
	   	this.authorName = authorName;
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [AuthorName=" + authorName + ", name=" + name + ", price=" + price + "]";
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		authorName = authorName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public boolean equals(Object obj)
	{
		Book other = (Book) obj;
		return this.getAuthorName().equals(other.getAuthorName())
		&& this.getName().equals(other.getName())
		&& Double.valueOf(this.getPrice()).equals(Double.valueOf(other.getPrice()));
	}
	
	
	

}
