package Eje_8_library;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library(){
        this.books =new ArrayList<>();
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void deleteBook(Book book){
        books.remove(book);
    }

    public List<Book> searchByAuthor(String author){
        List<Book> foundBooks = new ArrayList<>();

        for(Book book : books){
            if(book != null && book.getAuthor().equalsIgnoreCase(author)){
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public List<Book> searchByTitle(String title){
        List<Book> foundBooks = new ArrayList<>();

        for(Book book : books){
            if(book != null && book.getTitle().equalsIgnoreCase(title)){
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public List<Book> searchByGenre(String genre){
        List<Book> foundBooks = new ArrayList<>();

        for(Book book : books){
            if(book != null && book.getGenre().equalsIgnoreCase(genre)){
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public List<Book> sortBook(){

        books.sort(Comparator.comparingInt(Book::getPublYear));
        return this.books;

    }

    public void printBooks(List<Book> books){
        books.forEach(System.out::println);
    }
}

