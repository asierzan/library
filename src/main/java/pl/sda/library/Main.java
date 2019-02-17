package pl.sda.library;

import pl.sda.library.model.*;


public class Main {

    public static void main(String[] args) {
        Library<Multimedium> library = new Library<>();
          library.addMultimedium(new PaperBookBuilder()
                .authorFirstName("Carol")
                .authorLastName("Lewis")
                .title("Lew, czarownica i stara szafa")
                .build());
        library.addMultimedium(new PaperBookBuilder()
                .authorFirstName("Lewis")
                .authorLastName("Carol")
                .title("Alicja w krainie Czarów")
                .build());
        library.addMultimedium(new PaperBookBuilder()
                .authorFirstName("J.K.")
                .authorLastName("Rowling")
                .title("Harry Potter i Kamień filozoficzny")
                .build());
        library.addMultimedium(new PaperBookBuilder()
                .authorFirstName("Miquel")
                .authorLastName("de Cervantes")
                .title("Don Kichot")
                .build());
        library.addMultimedium(new PaperBookBuilder()
                .authorFirstName("J.R.R")
                .authorLastName("Tolkien")
                .title("Władca Pierścieni")
                .build());
        library.addMultimedium(new PaperBookBuilder()
                .authorFirstName("J.R.R")
                .authorLastName("Tolkien")
                .title("Hobbit")
                .build());
        library.addMultimedium(new PaperBookBuilder()
                .authorFirstName("Xueqin")
                .authorLastName("Cao")
                .title("Sen czerwonego pawilonu")
                .build());


        library.addMultimedium(new AudioBookBuilder()
                .authorFirstName("Carol")
                .authorLastName("Lewis")
                .title("Lew, czarownica i stara szafa")
                .build());
        library.addMultimedium(new AudioBookBuilder()
                .authorFirstName("Lewis")
                .authorLastName("Carol")
                .title("Alicja w krainie Czarów")
                .build());
        library.addMultimedium(new AudioBookBuilder()
                .authorFirstName("J.K.")
                .authorLastName("Rowling")
                .title("Harry Potter i Kamień filozoficzny")
                .build());
        library.addMultimedium(new AudioBookBuilder()
                .authorFirstName("Miquel")
                .authorLastName("de Cervantes")
                .title("Don Kichot")
                .build());
        library.addMultimedium(new AudioBookBuilder()
                .authorFirstName("J.R.R")
                .authorLastName("Tolkien")
                .title("Władca Pierścieni")
                .build());
        library.addMultimedium(new AudioBookBuilder()
                .authorFirstName("J.R.R")
                .authorLastName("Tolkien")
                .title("Hobbit")
                .build());
        library.addMultimedium(new AudioBookBuilder()
                .authorFirstName("Xueqin")
                .authorLastName("Cao")
                .title("Sen czerwonego pawilonu")
                .build());
        library.addMultimedium(new NewspaperBuilder()
                .title("Motor")
                .number(6)
                .pageCount(32)
                .build());
        library.addMultimedium(new NewspaperBuilder()
                .title("Polityka")
                .number(87)
                .pageCount(50)
                .build());
        library.addMultimedium(new NewspaperBuilder()
                .title("Co za tydzień")
                .number(3)
                .pageCount(54)
                .build());
        library.addMultimedium(new MovieBuilder()
                .title("Skazani na Shawshank")
                .directorFirstName("Frank")
                .directorLastName("Darabont")
                .duration(120)
                .build());
        library.addMultimedium(new MovieBuilder()
                .title("Nietykalni")
                .directorFirstName("Olivier")
                .directorLastName("Nakache")
                .duration(110)
                .build());
        library.addMultimedium(new MovieBuilder()
                .title("Zielona Mila")
                .directorFirstName("Frank")
                .directorLastName("Darabont")
                .duration(180)
                .build());

        for (Multimedium multimedium: library.getMedia()){
            System.out.println(multimedium);
        }


    }
}
