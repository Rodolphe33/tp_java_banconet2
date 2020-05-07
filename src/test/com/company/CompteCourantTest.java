package test.com.company;

import junit.*;
import main.com.company.CompteCourant;

public class CompteCourantTest {


    @Test
    public void nombreCompteCourant() {

        // Given
        CompteCourant CompteCour1 = new CompteCourant(nbComptesCourants);
        CompteCourant CompteCour2 = new CompteCourant(nbComptesCourants);
        CompteCourant CompteCour3 = new CompteCourant(nbComptesCourants);

        // When

        // Then
        assertEquals(nbComptesCourants + 3);
    }

}