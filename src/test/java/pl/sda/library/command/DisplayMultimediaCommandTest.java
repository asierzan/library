package pl.sda.library.command;

import org.junit.Test;
import org.mockito.Mockito;
import pl.sda.library.model.*;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class DisplayMultimediaCommandTest {


    @Test
    public void shouldDisplayMultimediaWhenSomeMultimediaAreAvailable() {
        //given
        PaperBook book = new PaperBookBuilder()//
                .authorFirstName("Henryk")//
                .authorLastName("Sienkiewicz")//
                .title("W pustyni i w puszczy")//
                .cover(Cover.HARD)//
                .pageCount(100)//
                .build();
        Movie movie = new MovieBuilder()
                .title("W pustyni i w puszczy")
                .directorFirstName("Andrzej")
                .directorLastName("Wajda")
                .duration(100)
                .build();
        Library<Multimedium> library = new Library<>();
        library.addMultimedium(book);
        library.addMultimedium(movie);
        PrintStream printStreamMock = Mockito.mock(PrintStream.class);
        Command command = new DisplayMultimediaCommand(library,printStreamMock);
        //when
        command.execute();
        //then
        verify(printStreamMock, times(2)).println(Mockito.any(Book.class));
        verify(printStreamMock, times(2)).println(Mockito.any(Movie.class));

        //alt enter import statyczny na metodach

    }

}