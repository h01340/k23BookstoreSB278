package k23.Backend.BookstoreSB278.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
	
	List<Book> findByAuthor(String authorName);

}
