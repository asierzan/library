package pl.sda.library.command;

import pl.sda.library.model.Multimedium;
import pl.sda.library.model.Newspaper;
import pl.sda.library.model.NewspaperBuilder;
import pl.sda.library.model.PaperBookBuilder;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

public class CreateNewspaperCommandStrategy implements CreateMultimediaStrategy {
    public static final String NEWSPAPER = "Newspaper";

    @Override
    public Multimedium createMultimedium(Scanner scanner, PrintStream printStream) {
        printStream.println("Tytuł: ");
        String title = scanner.nextLine();
        printStream.println("Numer: ");
        int number = scanner.nextInt();
        printStream.println("Liczba stron: ");
        int pageCount = scanner.nextInt();
        scanner.nextLine();
        return new NewspaperBuilder()
                .title(title)
                .number(number)
                .pageCount(pageCount)
                .build();
    }

    @Override
    public boolean isTypeCorrect(String type) {
        return Objects.equals(type, NEWSPAPER);
    }
}
