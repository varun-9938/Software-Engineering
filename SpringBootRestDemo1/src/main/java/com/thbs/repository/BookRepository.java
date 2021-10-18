package com.thbs.repository;
import com.thbs.model.Book;
import java.util.*;
public class BookRepository {
	List<Book> blist;
	public BookRepository() {
		blist = new ArrayList<Book>();
		Book b1 = new Book();
		b1.setBookid(100);
		b1.setBookname("HTML");
		b1.setBookprice(300);
		
		Book b2 = new Book();
		b2.setBookid(101);
		b2.setBookname("CSS");
		b2.setBookprice(250);
		
		Book b3 = new Book();
		b3.setBookid(102);
		b3.setBookname("JAVA");
		b3.setBookprice(500);
		
		blist.add(b1);
		blist.add(b2);
		blist.add(b3);
		
		
	}
	public List<Book> getAllBooks(){
		return blist;
	}
	
	public Book getABook(int bookId) {
		for(Book b:blist) {
			if(b.getBookid()==bookId)
				return b;
		}
		return null;
	}

}
