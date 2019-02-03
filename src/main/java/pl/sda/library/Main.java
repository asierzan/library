package pl.sda.library;

import pl.sda.library.model.*;


public class Main {

    public static void main(String[] args) {
        Library<Book> library = new Library<>();
          library.addBook(new PaperBookBuilder()
                .authorFirstName("Carol")
                .authorLastName("Lewis")
                .title("Lew, czarownica i stara szafa")
                .build());
        library.addBook(new PaperBookBuilder()
                .authorFirstName("Lewis")
                .authorLastName("Carol")
                .title("Alicja w krainie Czarów")
                .build());
        library.addBook(new PaperBookBuilder()
                .authorFirstName("J.K.")
                .authorLastName("Rowling")
                .title("Harry Potter i Kamień filozoficzny")
                .build());
        library.addBook(new PaperBookBuilder()
                .authorFirstName("Miquel")
                .authorLastName("de Cervantes")
                .title("Don Kichot")
                .build());
        library.addBook(new PaperBookBuilder()
                .authorFirstName("J.R.R")
                .authorLastName("Tolkien")
                .title("Władca Pierścieni")
                .build());
        library.addBook(new PaperBookBuilder()
                .authorFirstName("J.R.R")
                .authorLastName("Tolkien")
                .title("Hobbit")
                .build());
        library.addBook(new PaperBookBuilder()
                .authorFirstName("Xueqin")
                .authorLastName("Cao")
                .title("Sen czerwonego pawilonu")
                .build());


        library.addBook(new AudioBookBuilder()
                .authorFirstName("Carol")
                .authorLastName("Lewis")
                .title("Lew, czarownica i stara szafa")
                .build());
        library.addBook(new AudioBookBuilder()
                .authorFirstName("Lewis")
                .authorLastName("Carol")
                .title("Alicja w krainie Czarów")
                .build());
        library.addBook(new AudioBookBuilder()
                .authorFirstName("J.K.")
                .authorLastName("Rowling")
                .title("Harry Potter i Kamień filozoficzny")
                .build());
        library.addBook(new AudioBookBuilder()
                .authorFirstName("Miquel")
                .authorLastName("de Cervantes")
                .title("Don Kichot")
                .build());
        library.addBook(new AudioBookBuilder()
                .authorFirstName("J.R.R")
                .authorLastName("Tolkien")
                .title("Władca Pierścieni")
                .build());
        library.addBook(new AudioBookBuilder()
                .authorFirstName("J.R.R")
                .authorLastName("Tolkien")
                .title("Hobbit")
                .build());
        library.addBook(new AudioBookBuilder()
                .authorFirstName("Xueqin")
                .authorLastName("Cao")
                .title("Sen czerwonego pawilonu")
                .build());
        for (Book book: library.getBooks()){
            System.out.println(book);
        }


    }
}
