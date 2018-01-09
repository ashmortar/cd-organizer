package models;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;


public class CDTest {
    public CD setUpNewCD() {
        return new CD("artist", "title", "year", "genre");
    }

    @Test
    public void CDInstantiatesCorrectly_true() throws Exception {
        CD testCD = new CD("artist", "title", "year", "genre");
        assertTrue(testCD instanceof CD);
    }

    @Test
    public void getArtist_returnsArtistCorrectly_true()throws Exception {
        CD testCD = setUpNewCD();
        String output = "artist";
        assertEquals(output, testCD.getArtist());
    }

    @Test
    public void getTitle_returnsTitleCorrectly_true() throws Exception {
        CD testCD = setUpNewCD();
        String output = "title";
        assertEquals(output, testCD.getTitle());
    }

    @Test
    public void getYear_returnsYearCorretly_true() throws Exception {
        CD testCD = setUpNewCD();
        String output = "year";
        assertEquals(output, testCD.getYear());
    }

    @Test
    public void getGenre_returnsGenreCorrectly_true() throws Exception {
        CD testCD = setUpNewCD();
        String output = "genre";
        assertEquals(output, testCD.getGenre());
    }

    @After
    public void tearDown() {
        CD.clearAllCDs();
    }

    @Test
    public void getAll_returnsAllCDObjects_true() throws Exception {
        CD testCD = setUpNewCD();
        CD otherCD = new CD("Artist", "title", "year", "genre");
        assertEquals(2, CD.getAll().size());
    }
}