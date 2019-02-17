package pl.sda.library.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewspaperBuilderTest {

    @Test
    public void shouldBuildNewspaperWhenDataIsDefined() {
        //given
        String title = "Programista";
        int number = 64;
        int pageCount = 100;

        //when
       Newspaper newspaper= new NewspaperBuilder()
                .title(title)
                .number(number)
                .pageCount(pageCount)
                .build();
        //then
        assertNotNull(newspaper);
        assertEquals(title, newspaper.getTitle());
        assertEquals(number, newspaper.getNumber());
        assertEquals(pageCount,newspaper.getPageCount());

    }

}