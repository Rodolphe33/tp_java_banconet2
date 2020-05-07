package test.com.company;

import main.com.company.CompteCourant;
import org.junit.jupiter.api.Test;

public class CompteCourantTest extends CompteCourant {


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