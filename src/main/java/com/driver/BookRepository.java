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
        for(Book b:bookList){
            if(b.getId()==id)return b;
        }
        return null;
//        return bookList.get(id-1);
    }

    public List<Book> findAll(){
        return bookList;
    }

    public void deleteBookById(int id){
        for(int i=0;i<bookList.size();i++){
            if(bookList.get(i).getId()==id)bookList.remove(i);
        }
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
