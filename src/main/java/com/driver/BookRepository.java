package com.driver;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    List<Book> bookList=new ArrayList<>();
    public BookRepository(){
        
    }

    public Book save(Book book){
        bookList.add(book);
        return book;
    }

    public Book findBookById(int id){
        return bookList.get(id-1);
    }

    public List<Book> findAll(){
        return bookList;
    }

    public void deleteBookById(int id){
        bookList.remove(id-1);
    }

    public void deleteAll(){
        bookList.clear();
    }

    public List<Book> findBooksByAuthor(String author){
        List<Book> authorBookList=new ArrayList<>();
        for(Book b:bookList){
            if(b.getAuthor().equals(author)) authorBookList.add(b);
        }
        return authorBookList;
    }

    public List<Book> findBooksByGenre(String genre){
        List<Book> genreBookList=new ArrayList<>();
        for(Book b:bookList){
            if(b.getGenre().equals(genre)) genreBookList.add(b);
        }
        return genreBookList;
    }
}
