public class Piloot extends Personeel {
    boolean flightCheckUitgevoerd;

    public Piloot(String naam) {
        super(naam, "Piloot");
        this.flightCheckUitgevoerd = false;
    }

    public void voerFlightCheckUit() {
        this.flightCheckUitgevoerd = true;
        System.out.println("Flightcheck uitgevoerd door piloot: " + naam + ". En nu kan de vliegtuig opstijgen ");
    }

    public boolean isFlightCheckUitgevoerd() {
        return flightCheckUitgevoerd;
    }
}
