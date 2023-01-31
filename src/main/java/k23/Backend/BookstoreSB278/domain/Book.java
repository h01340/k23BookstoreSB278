package k23.Backend.BookstoreSB278.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	//title, author, year, isbn, price
	private String title, author, isbn;
	private int publishingYear, ranking;
	private double price;

	@ManyToOne
	//JsonIgnore helps to prevent endless loop
	@JsonIgnore
	@JoinColumn(name="categoryid")
	private Category category;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

/**
 * 
			bookRepository.save(new Book("Kasvoton kuolema", "Hennig Mankell", 2002, 12, 1,
					categoryRepository.findByName("Dekkarit").get(0)));
 */

	public Book(String title, String author, int year, double price, int ranking,  Category category) {
		super();
		this.title = title;
		this.author = author;
		this.publishingYear = year;
		this.price = price;
		this.ranking = ranking;
		this.category = category;
	}

	
	
	public Book(String title, String author, String isbn, int year, int ranking, double price, Category category) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publishingYear = year;
		this.ranking = ranking;
		this.price = price;
		this.category = category;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", year=" + publishingYear
				+ ", ranking=" + ranking + ", price=" + price + "]";
	}
	
	
}
