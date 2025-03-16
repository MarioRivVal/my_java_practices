package Eje_8_library;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private int publYear;
    private String genre;

    public Book(String title, String author, String genre, int publYear){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publYear =publYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getPublYear() {
        return this.publYear;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return "Book: {" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publYear=" + publYear +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publYear == book.publYear && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publYear, genre);
    }
}
