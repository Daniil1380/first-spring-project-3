package de.telran.firstspringproject3;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class BookController {

    private List<Book> books = new ArrayList<>();

    @GetMapping(value = "/book/add-random-book")
    public void addRandomBook() {
        Random random = new Random();
        int id = random.nextInt();
        Book book = new Book(id, "Чистый код");
        books.add(book);
    }

    @GetMapping(value = "/book/show")
    public List<Book> show() {
        return books;
    }

    @GetMapping(value = "/book/{id}")
    public Book getBook(@PathVariable(value = "id") Integer id) {
        return books.get(id);
    }

    @DeleteMapping(value = "/book/{id}")
    public void deleteBook(@PathVariable(value = "id") Integer id) {
        int number = id;
        books.remove(number);
    }

    @PutMapping(value = "/book/{id}")
    public void updateBook(@PathVariable(value = "id") Integer id, @RequestBody Book book) {
        books.set(id, book);
    }

    @PostMapping(value = "/book/add")
    public void addNewBook(@RequestBody Book book) {
        books.add(book);
    }





}
