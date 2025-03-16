package Eje_8_library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico", 1967));
        library.addBook(new Book("1984", "George Orwell", "Distopía", 1951));
        library.addBook(new Book("Dune", "Frank Herbert", "Ciencia ficción", 1965));
        library.addBook(new Book("Fundación", "Isaac Asimov", "Ciencia ficción", 1951));
        library.addBook(new Book("El señor de los anillos", "J.R.R. Tolkien", "Fantasía", 1951));
        library.addBook(new Book("Harry Potter y la piedra filosofal", "J.K. Rowling", "Fantasía", 1997));
        library.addBook(new Book("El código Da Vinci", "Dan Brown", "Misterio", 2003));
        library.addBook(new Book("Ángeles y demonios", "Dan Brown", "Misterio", 2000));
        library.addBook(new Book("Matar a un ruiseñor", "Harper Lee", "Drama", 1960));

        Book bookToDelete = new Book("Los pilares de la Tierra", "Ken Follett", "Histórica", 1989);
        library.addBook(bookToDelete);

        library.printBooks(library.getBooks());

        System.out.println("\nFind a book by author: Dan Brown");
        library.printBooks(library.searchByAuthor("Dan Brown"));

        System.out.println("\nDelete a book");
        library.deleteBook(bookToDelete);

        System.out.println("\nFind a book by title: 1984");
        library.printBooks(library.searchByTitle("1984"));

        System.out.println("\nFind a book by genre: Ciencia ficción");
        library.printBooks(library.searchByGenre("Ciencia ficción"));

        System.out.println("\nSorted books by publication year");
        library.printBooks(library.sortBook());
    }
}
