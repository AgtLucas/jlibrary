package nsa.gov.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nsa.gov.model.Book;

public class BookDAO {
	
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<Book>();
		
		Book book1 = new Book();
		book1.setName("Iron Maiden 666");
		book1.setPublisher("EMI");
		book1.setSummary("Scream for me 2015");
		book1.setYear(2003);
		book1.setAuthors(Arrays.asList("Steve Harris, Bruce Dickinson"));
		books.add(book1);
		
		return books;
	}

}
