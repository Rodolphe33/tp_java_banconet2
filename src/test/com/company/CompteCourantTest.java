package test.com.company;

import main.com.company.CompteCourant;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompteCourantTest {
    static CompteCourant compteCour1;
    static CompteCourant compteCour2;
    static CompteCourant compteCour3;

    @BeforeAll
    public static void initiale(){
        assertEquals(CompteCourant.nbComptesCourants, 0, 0);

        compteCour1 = new CompteCourant("123", "Batman", 1664, -1000);
        compteCour2 = new CompteCourant("456", "Robin", 33, -500);
        compteCour3 = new CompteCourant("789", "Joker", 2020, 0);

        assertEquals(1664, compteCour1.solde, 0.001);
        assertEquals(33, compteCour2.solde, 0.001);
        assertEquals(2020, compteCour3.solde, 0.001);
    }

    @Test
    public void testNombreCompteCourant() {
        // Given

        // When

        // Then
        assertEquals(CompteCourant.nbComptesCourants, 3, 0);
    }

    @Test
    public void testCrediter() {

        // Given
        compteCour1.solde = 1664;
        compteCour2.solde = 33;
        compteCour3.solde = 50;
        // When
        compteCour1.crediter(50);
        compteCour2.crediter(50);
        compteCour3.crediter(50);
        // Then
        assertEquals(1714, compteCour1.solde, 0.001);
        assertEquals(83, compteCour2.solde, 0.001);
        assertEquals(100, compteCour3.solde, 0.001);
    }

    @Test
    public void testCrediter_Decimal() {

        // Given
        compteCour1.solde = 1664;
        compteCour2.solde = 33;
        compteCour3.solde = 50;
        // When
        compteCour1.crediter(6.66);
        compteCour2.crediter(66.66);
        compteCour3.crediter(666.66);
        // Then
        assertEquals(1670.66, compteCour1.solde, 0.001);
        assertEquals(99.66, compteCour2.solde, 0.001);
        assertEquals(716.66, compteCour3.solde, 0.001);
    }

    /*@Test
    public void () {
        // Given

        // When

        // Then
        assertEquals();
    }*/

    /*@Test
    public void () {
        // Given

        // When

        // Then
        assertEquals();
    }*/
}