package services;

import model.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class BookService {
    private final HashMap <Long, Book> books = new HashMap<>();
    private long lastId = 0;

    public Book createBook(Book book) {
        book.setId(++lastId);
        books.put(lastId,book);
        return book;
    }

    public Book getBook(long id) {
        return books.get(id);
    }
}
