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

        double solde1 = compteCour1.getSolde(1664);
        double solde2 = compteCour2.getSolde(33);
        double solde3 = compteCour3.getSolde(2020);

        assertEquals(1664, solde1, 0.001);
        assertEquals(33, solde2, 0.001);
        assertEquals(2020, solde3, 0.001);
    }

    @Test
    public void testNombreCompteCourant() {
        // Given

        // When

        // Then
        assertEquals(CompteCourant.nbComptesCourants, 3, 0);

        System.out.println("Nombre total de comptes courant: " + CompteCourant.nbComptesCourants);
    }

    // Test de crediter
    @Test
    public void testCrediter() {
        // Given
        double solde1 = compteCour1.getSolde(1664);
        double solde2 = compteCour2.getSolde(33);
        double solde3 = compteCour3.getSolde(50);
        // When
        compteCour1.crediter(50);
        compteCour2.crediter(50);
        compteCour3.crediter(50);
        // Then
        assertEquals(1714, (solde1 + 50), 0.001);
        assertEquals(83, (solde2 + 50), 0.001);
        assertEquals(100, (solde3 + 50), 0.001);

        // Affichage des soldes
        System.out.println("Créditer 50€");
        System.out.println("Compte 1 : Nouveau solde: " + (solde1 + 50) + "€, Acien solde: " + solde1 + "€");
        System.out.println("Compte 2 : Nouveau solde: " + (solde2 + 50)+ "€, Acien solde: " + solde2 + "€");
        System.out.println("Compte 3 : Nouveau solde: " + (solde3 + 50) + "€, Acien solde: " + solde3 + "€");
    }

    @Test
    public void testCrediter_Decimal() {
        // Given
        double solde1 = compteCour1.getSolde(1664);
        double solde2 = compteCour2.getSolde(33);
        double solde3 = compteCour3.getSolde(50);
        // When
        compteCour1.crediter(6.66);
        compteCour2.crediter(66.66);
        compteCour3.crediter(666.66);
        // Then
        assertEquals(1670.66, (solde1 + 6.66), 0.001);
        assertEquals(99.66, (solde2 + 66.66), 0.001);
        assertEquals(716.66, (solde3 + 666.66), 0.001);

        // Affichage des soldes
        System.out.println("Créditer une decimale (6.66,66.66,666.66)");
        System.out.println("Compte 1 : Nouveau solde: " + (solde1 + 6.66) + "€, Acien solde: " + solde1 + "€");
        System.out.println("Compte 2 : Nouveau solde: " + (solde2 + 66.66) + "€, Acien solde: " + solde2 + "€");
        System.out.println("Compte 3 : Nouveau solde: " + (solde3 + 666.66) + "€, Acien solde: " + solde3 + "€");
    }

    @Test
    public void testCrediter_Zero() {
        // Given
        double solde1 = compteCour1.getSolde(1664);
        double solde2 = compteCour2.getSolde(33);
        double solde3 = compteCour3.getSolde(0);
        // When
        compteCour1.crediter(0);
        compteCour2.crediter(0);
        compteCour3.crediter(0.66);
        // Then
        assertEquals(1664, (solde1 + 0), 0.001);
        assertEquals(33, (solde2 + 0), 0.001);
        assertEquals(0.66, (solde3 + 0.66), 0.001);

        // Affichage des soldes
        System.out.println("Créditer un zéro");
        System.out.println("Compte 1 : Solde : " + (solde1 + 0) + "€, Acien solde: " + solde1 + "€");
        System.out.println("Compte 2 : Solde : " + (solde2 + 0) + "€, Acien solde: " + solde2 + "€");
        System.out.println("Compte 3 : Solde : " + (solde3 + 0.66) + "€, Acien solde: " + solde3 + "€");
    }

    /*@Test
    public void testCrediter_Negatif() {
        // Given
        double solde1 = compteCour1.getSolde(1664);
        double solde2 = compteCour2.getSolde(33);
        double solde3 = compteCour3.getSolde(50);
        // When
        compteCour1.crediter(-60);
        compteCour2.crediter(-120);
        compteCour3.crediter(-500);
        // Then
        // @TODO
        assertEquals(1604, (solde1 - ), 0.001);
        assertEquals(-87, (solde2 - ), 0.001);
        assertEquals(-500, (solde3 - ), 0.001);

        // Affichage des soldes et numéros de compte
        System.out.println("Compte 1 : Solde : " + (solde1 - ) + "€, Acien solde: " + solde1 + "€");
        System.out.println("Compte 2 : Solde : " + (solde2 - ) + "€, Acien solde: " + solde2 + "€");
        System.out.println("Compte 3 : Solde : " + (solde3 - ) + "€, Acien solde: " + solde3 + "€");
    }*/

    // Test de debiter
    @Test
    public void testDebiter() {
        // Given
        double solde1 = compteCour1.getSolde(1664);
        double solde2 = compteCour2.getSolde(33);
        double solde3 = compteCour3.getSolde(50);
        // When
        compteCour1.debiter(-501);
        compteCour2.debiter(-51);
        compteCour3.debiter(-50.50);
        // Then
        assertEquals(1163, (solde1 - 501), 0.001);
        assertEquals(-18, (solde2 - 51), 0.001);
        assertEquals(-0.50, (solde3 - 50.50), 0.001);

        // Affichage des soldes
        System.out.println("Débiter (un nombre négatif)");
        System.out.println("Compte 1 : Solde : " + (solde1 - 501) + "€, Acien solde: " + solde1 + "€");
        System.out.println("Compte 2 : Solde : " + (solde2 - 51) + "€, Acien solde: " + solde2 + "€");
        System.out.println("Compte 3 : Solde : " + (solde3 - 50.50) + "€, Acien solde: " + solde3 + "€");
    }

    @Test
    public void testDebiter_Decimal() {
        // Given
        double solde1 = compteCour1.getSolde(1664);
        double solde2 = compteCour2.getSolde(33);
        double solde3 = compteCour3.getSolde(50);
        // When
        compteCour1.debiter(-6.66);
        compteCour2.debiter(-66.60);
        compteCour3.debiter(-666);
        // Then
        assertEquals(1657.34, (solde1 - 6.66), 0.001);
        assertEquals(-33.60, (solde2 - 66.60), 0.001);
        assertEquals(-616, (solde3 - 666), 0.001);

        // Affichage des soldes
        System.out.println("Débiter un décimale");
        System.out.println("Compte 1 : Solde : " + (solde1 - 6.66) + "€, Acien solde: " + solde1 + "€");
        System.out.println("Compte 2 : Solde : " + (solde2 - 66.60) + "€, Acien solde: " + solde2 + "€");
        System.out.println("Compte 3 : Solde : " + (solde3 - 666) + "€, Acien solde: " + solde3 + "€");
    }

    @Test
    public void testDebiter_Zero() {
        // Given
        double solde1 = compteCour1.getSolde(1664);
        double solde2 = compteCour2.getSolde(33);
        double solde3 = compteCour3.getSolde(0);
        // When
        compteCour1.debiter(0);
        compteCour2.debiter(0);
        compteCour3.debiter(-6.66);
        // Then
        assertEquals(1664, (solde1 - 0), 0.001);
        assertEquals(33, (solde2 - 0), 0.001);
        assertEquals(-6.66, (solde3 - 6.66), 0.001);

        // Affichage des soldes
        System.out.println("Débiter un zéro");
        System.out.println("Compte 1 : Solde : " + (solde1 - 0) + "€, Acien solde: " + solde1 + "€");
        System.out.println("Compte 2 : Solde : " + (solde2 - 0) + "€, Acien solde: " + solde2 + "€");
        System.out.println("Compte 3 : Solde : " + (solde3 - 6.66) + "€, Acien solde: " + solde3 + "€");
    }

    /*@Test
    public void testDebiter_Positif() {
        // Given
        double solde1 = compteCour1.getSolde(1664);
        double solde2 = compteCour2.getSolde(33);
        double solde3 = compteCour3.getSolde(50);
        // When
        compteCour1.debiter(60);
        compteCour2.debiter(120);
        compteCour3.debiter(500);
        // Then
        // @TODO
        assertEquals(1604, (solde1 + ), 0.001);
        assertEquals(-87, (solde2 + ), 0.001);
        assertEquals(-500, (solde3 - ), 0.001);

        // Affichage des soldes et numéros de compte
        System.out.println("Compte 1 : Solde : " + (solde1 - ) + "€, Acien solde: " + solde1 + "€");
        System.out.println("Compte 2 : Solde : " + (solde2 - ) + "€, Acien solde: " + solde2 + "€");
        System.out.println("Compte 3 : Solde : " + (solde3 - ) + "€, Acien solde: " + solde3 + "€");
    }
*//*

*/
    /*@Test
    public void () {
        // Given

        // When

        // Then
        assertEquals();
    }*/
}