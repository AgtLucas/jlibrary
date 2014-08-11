package nsa.gov.service;

import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import nsa.gov.dao.BookDAO;
import nsa.gov.model.Book;

@WebService
public class BooksList {
	
	public List<Book> listBooks() {
		BookDAO dao = new BookDAO();
		return dao.getBooks();
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8180/books", new BooksList());
		System.out.println("Go!");
	}

}
