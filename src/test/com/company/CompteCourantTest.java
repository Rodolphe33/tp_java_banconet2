package test.com.company;

import main.com.company.CompteCourant;
import org.junit.jupiter.api.Test;

public class CompteCourantTest extends CompteCourant {


    @Test
    public void nombreCompteCourant() {
        // Given
        CompteCourant CompteCour1 = new CompteCourant(CompteCourant.nbComptesCourants);
        CompteCourant CompteCour2 = new CompteCourant(CompteCourant.nbComptesCourants);
        CompteCourant CompteCour3 = new CompteCourant(CompteCourant.nbComptesCourants);

        // When

        // Then
        assertEquals(nbComptesCourants + 3);
    }

    @Test
    public void newSolde() {
        // Given
        CompteCourant CompteCour1 = new CompteCourant(CompteCourant.solde);
        CompteCourant CompteCour2 = new CompteCourant(CompteCourant.solde);
        CompteCourant CompteCour3 = new CompteCourant(CompteCourant.solde);

        // When

        // Then
        assertEquals(CompteCour1.solde = 1664, CompteCour2.solde = 33,CompteCour3.solde = 2020);
    }

    /*@Test
    public void () {
        // Given
        CompteCourant CompteCour1 = new CompteCourant(nbComptesCourants);
        CompteCourant CompteCour2 = new CompteCourant(nbComptesCourants);
        CompteCourant CompteCour3 = new CompteCourant(nbComptesCourants);

        // When

        // Then
        assertEquals();
    }*/

    /*@Test
    public void () {
        // Given
        CompteCourant CompteCour1 = new CompteCourant(nbComptesCourants);
        CompteCourant CompteCour2 = new CompteCourant(nbComptesCourants);
        CompteCourant CompteCour3 = new CompteCourant(nbComptesCourants);

        // When

        // Then
        assertEquals();
    }*/

}