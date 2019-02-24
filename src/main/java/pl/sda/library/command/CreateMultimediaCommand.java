package pl.sda.library.command;

import pl.sda.library.model.*;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CreateMultimediaCommand implements Command{

    private final PrintStream printStream;
    private final Library<Multimedium>library;
    private final List<CreateMultimediaStrategy>strategies=Arrays.asList(
            new CreateAudioBookCommandStrategy(),
            new CreatePaperBookCommandStrategy(),
            new CreateMovieCommandStrategy(),
            new CreateNewspaperCommandStrategy());


    public CreateMultimediaCommand(Library<Multimedium> library,PrintStream printStream) {
        this.library = library;
        this.printStream = printStream;
    }

    @Override
    public void execute() {

        Scanner scanner= new Scanner(System.in);
        printStream.println("Typ: ");
       String type= scanner.nextLine();
        Optional<Multimedium>multimedium= strategies.stream()
               .filter(s-> s.isTypeCorrect(type))
               .findFirst()
               .map(s->s.createMultimedium(scanner,printStream));
       multimedium.ifPresent(m->library.addMultimedium(m));


       }

       }

