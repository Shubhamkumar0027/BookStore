package com.skindia.booksearch;

import javax.persistence.*;

@Entity
@Table(name="mybookinventory",schema = "jlcbooksdb")
public class BookInventory {
 @Id
 @Column(name="book_id")
 private Integer bookId;

 @Column(name="books_available")
 private int booksAvailable;
 //Constrcutors
 //Setetrs and Getters

 
public BookInventory(Integer bookId, int booksAvailable) {
	super();
	this.bookId = bookId;
	this.booksAvailable = booksAvailable;
}

public BookInventory() {
	super();
	// TODO Auto-generated constructor stub
}

public Integer getBookId() {
	return bookId;
}

public void setBookId(Integer bookId) {
	this.bookId = bookId;
}

public int getBooksAvailable() {
	return booksAvailable;
}

public void setBooksAvailable(int booksAvailable) {
	this.booksAvailable = booksAvailable;
}
 
 
}