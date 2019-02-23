package pl.sda.library.command;

import pl.sda.library.model.Library;
import pl.sda.library.model.Multimedium;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.Stream;

public class FilterTypeCommand implements Command {

    private final Library<Multimedium> library;
    private final PrintStream printStream;

    public FilterTypeCommand(Library<Multimedium>library,PrintStream printStream) {
        this.library=library;
        this.printStream=printStream;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        printStream.println("Typ:");
       String type = scanner.nextLine();
//        for (Multimedium multimedium: library.getMedia()){
//            if (multimedium.getClass().getSimpleName().equals(type)) {
//                printStream.println(multimedium);

        library.getMedia()
            .stream()
            .filter(m->m.getType().equals(type))
            .forEach(printStream::println);
}
    }


