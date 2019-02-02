package pl.sda.library;

import pl.sda.library.model.Book;
import pl.sda.library.model.BookBuilder;
import pl.sda.library.model.Library;


public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new BookBuilder()
                .authorFirstName("Carol")
                .authorLastName("Lewis")
                .title("Lew, czarownica i stara szafa")
                .build());
        library.addBook(new BookBuilder()
                .authorFirstName("Lewis")
                .authorLastName("Carol")
                .title("Alicja w krainie Czarów")
                .build());
        library.addBook(new BookBuilder()
                .authorFirstName("J.K.")
                .authorLastName("Rowling")
                .title("Harry Potter i Kamień filozoficzny")
                .build());
        library.addBook(new BookBuilder()
                .authorFirstName("Miquel")
                .authorLastName("de Cervantes")
                .title("Don Kichot")
                .build());
        library.addBook(new BookBuilder()
                .authorFirstName("J.R.R")
                .authorLastName("Tolkien")
                .title("Władca Pierścieni")
                .build());
        library.addBook(new BookBuilder()
                .authorFirstName("J.R.R")
                .authorLastName("Tolkien")
                .title("Hobbit")
                .build());
        library.addBook(new BookBuilder()
                .authorFirstName("Xueqin")
                .authorLastName("Cao")
                .title("Sen czerwonego pawilonu")
                .build());

        for (Book book: library.getBooks()){
            System.out.println(book);
        }


    }
}
