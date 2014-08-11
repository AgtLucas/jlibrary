package nsa.gov.model;

import java.util.List;

public class Book {
	
	private String name;
	private String publisher;
	private String summary;
	private int year;
	private List<String> authors;
	
	public Book() {
		super();
	}
	
	public Book(String name, String publisher, String summary, int year, List<String> authors) {
		super();
		this.name = name;
		this.publisher = publisher;
		this.summary = summary;
		this.year = year;
		this.authors = authors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	

}
