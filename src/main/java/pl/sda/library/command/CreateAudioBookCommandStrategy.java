package pl.sda.library.command;

import pl.sda.library.model.AudioBook;
import pl.sda.library.model.AudioBookBuilder;
import pl.sda.library.model.Format;
import pl.sda.library.model.Multimedium;

import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

public class CreateAudioBookCommandStrategy implements CreateMultimediaStrategy{
    public static final String AUDIO_BOOK = "AudioBook";

    @Override
    public Multimedium createMultimedium(Scanner scanner, PrintStream printStream) {
        printStream.println("Tytuł: ");
        String title = scanner.nextLine();
        printStream.println("Imię autora: ");
        String authorFirstName = scanner.nextLine();
        printStream.println("Nazwisko autora: ");
        String authorLastName = scanner.nextLine();
        printStream.println("Format: ");
        String format = scanner.nextLine();
        printStream.println("Czas trwania: ");
        int duration = scanner.nextInt();
        scanner.nextLine();
        return new AudioBookBuilder()
                .title(title)
                .authorFirstName(authorFirstName)
                .authorLastName(authorLastName)
                .format(Format.valueOf(format))
                .duration(duration)
                .build();
    }

    @Override
    public boolean isTypeCorrect(String type) {
        return Objects.equals(type,AUDIO_BOOK);
    }
}