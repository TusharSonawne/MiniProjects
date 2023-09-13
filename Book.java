package com.library;

import java.util.Scanner;

public class Book {

	private String title;
	private String author;
	private int price = 0;
	private int quantity = 0;
	
	Book(String title,String author,int price, int quantity){
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	public String getName() {
		return this.title;
	}
	
	public void removeData() {
		
		this.title =null;
		this.author =null;
		this.price =0;
		this.quantity =0;
	}
	
	public void display() {
		System.out.println("\nTitle    : "+this.title);
		System.out.println("Author   : "+this.author);
		System.out.println("Price    : "+this.price);
		System.out.println("Quantity : "+this.quantity);
	}	
}
