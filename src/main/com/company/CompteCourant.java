package main.com.company;

public class CompteCourant {
    public String numero;
    public String intitule;
    public double solde;
    public double montantDecouvertAutorise;
    public static int nbComptesCourants = 0;

    public static void main(String[] args) {
        System.out.println("min = " + Double.MIN_VALUE);
    }

    public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise){
        this.numero = numero;
        this.intitule = intitule;
        this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
        ++ nbComptesCourants;
    }

    /**
     *
     * @param montant doit être négatif
     */
    public void debiter(double montant){
        this.solde += montant;
    }

    /**
     *
     * @param montant doit être positif
     */
    public void crediter(double montant){
        this.solde += montant;
    }

}
