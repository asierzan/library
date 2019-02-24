package pl.sda.library.command;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.sda.library.model.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CreateMultimediaCommandTest {

    public static final String TEST_AUDIO_BOOK_INPUT = "AudioBook\nW pustyni i w puszczy\nHenryk\nSienkiewicz\nMP3\n100\n";
    public static final String TEST_PAPER_BOOK_INPUT = "PaperBook\nW pustyni i w puszczy\nHenryk\nSienkiewicz\nHARD\n300\n";
    public static final String TEST_MOVIE_INPUT = "Movie\nCzłowiek z żelaza\nAndrzej\nWajda\n120\n";
    public static final String TEST_NEWSPAPER_INPUT = "Newspaper\nProgramista\n10\n100\n";
    private InputStream inputStream;

    @Before
    public void setUp() {
        inputStream = System.in;
        System.setIn(new ByteArrayInputStream(TEST_AUDIO_BOOK_INPUT.getBytes())); //CTRL+ALT+C
    }

    @After
    public void tearDown() {
        System.setIn(inputStream);
    }

    @Test
    public void shouldCreateAudioBookWhenAudioBookTypeWasTyped () {

        //given
        Library<Multimedium> library = new Library<>();
        PrintStream printStreamMock = mock (PrintStream.class);
        Command command = new CreateMultimediaCommand( library,printStreamMock);
        //when
        command.execute();
        //then
        AudioBook audioBook = new AudioBookBuilder()
                .title("W pustyni i w puszczy")
                .authorFirstName("Henryk")
                .authorLastName("Sienkiewicz")
                .format(Format.MP3)
                .duration(100)
                .build();
        Library<Multimedium> expectedLibrary = new Library<>();
        expectedLibrary.addMultimedium(audioBook);
        assertEquals(expectedLibrary,library);

        verify(printStreamMock,times(1)).println("Typ: ");
        verify(printStreamMock,times(1)).println("Tytuł: ");
        verify(printStreamMock,times(1)).println("Imię autora: ");
        verify(printStreamMock,times(1)).println("Nazwisko autora: ");
        verify(printStreamMock,times(1)).println("Format: ");
        verify(printStreamMock,times(1)).println("Czas trwania: ");  //1 sprawdza czy dokladnie raz pyta o dane
    }


    @Test public void shouldCreatePaperBookWhenPaperBookTypeWasTyped() {
        // given
        System.setIn(new ByteArrayInputStream(TEST_PAPER_BOOK_INPUT.getBytes()));
        Library<Multimedium> library = new Library<>();
        PrintStream printStreamMock = mock(PrintStream.class);
        Command command = new CreateMultimediaCommand(library,printStreamMock);
        // when
        command.execute();
        // then
        PaperBook paperBook = new PaperBookBuilder()//
                .title("W pustyni i w puszczy")//
                .authorFirstName("Henryk")//
                .authorLastName("Sienkiewicz")//
                .cover(Cover.HARD)//
                .pageCount(300)//
                .build();
        Library<Multimedium> expectedLibrary = new Library<>();
        expectedLibrary.addMultimedium(paperBook);
        assertEquals(expectedLibrary, library);
        verify(printStreamMock, times(1)).println("Typ: ");
        verify(printStreamMock, times(1)).println("Tytuł: ");
        verify(printStreamMock, times(1)).println("Imię autora: ");
        verify(printStreamMock, times(1)).println("Nazwisko autora: ");
        verify(printStreamMock, times(1)).println("Okładka: ");
        verify(printStreamMock, times(1)).println("Liczba stron: ");
    }
    @Test
    public void shouldCreateMovieWhenMovieTypeWasTyped(){
        //given
        System.setIn(new ByteArrayInputStream(TEST_MOVIE_INPUT.getBytes()));
        Library<Multimedium>library=new Library<>();
        PrintStream printStreamMock= mock(PrintStream.class);
        CreateMultimediaCommand command = new CreateMultimediaCommand( library,printStreamMock);
        //when
        command.execute();
        //then
        Movie movie = new MovieBuilder()
                .title("Człowiek z żelaza")
                .directorFirstName("Andrzej")
                .directorLastName("Wajda")
                .duration(120)
                .build();
        Library<Multimedium> expectedLibrary= new Library<>();
        expectedLibrary.addMultimedium(movie);
        assertEquals(expectedLibrary,library);
        verify(printStreamMock,times(1)).println("Typ: ");
        verify(printStreamMock,times(1)).println("Tytuł: ");
        verify(printStreamMock,times(1)).println("Imię reżysera: ");
        verify(printStreamMock,times(1)).println("Nazwisko reżysera: ");
        verify(printStreamMock,times(1)).println("Czas trwania: ");
    }

    @Test
    public void shouldCreateNewspaperWhenNewspapaerTypeWasTyped(){
        //given
        System.setIn(new ByteArrayInputStream(TEST_NEWSPAPER_INPUT.getBytes()));
        Library<Multimedium>library=new Library<>();
        PrintStream printStreamMock= mock(PrintStream.class);
        CreateMultimediaCommand command = new CreateMultimediaCommand( library,printStreamMock);
        //when
        command.execute();
        //then
        Newspaper newspaper = new NewspaperBuilder()
                .title("Programista")
                .number(10)
                .pageCount(100)
                .build();
        Library<Multimedium> expectedLibrary= new Library<>();
        expectedLibrary.addMultimedium(newspaper);
        assertEquals(expectedLibrary,library);
        verify(printStreamMock,times(1)).println("Typ: ");
        verify(printStreamMock,times(1)).println("Tytuł: ");
        verify(printStreamMock,times(1)).println("Numer: ");
        verify(printStreamMock,times(1)).println("Liczba stron: ");
    }
}