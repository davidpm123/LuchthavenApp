public class Personeel {
    String naam;
    String functie;

    public Personeel(String naam, String functie) {
        this.naam = naam;
        this.functie = functie;
    }

    public void printDetails() {
        System.out.println("Naam: " + naam);
        System.out.println("Functie: " + functie);
    }
}


