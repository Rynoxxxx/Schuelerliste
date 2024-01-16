public class Schueler {
    String vorname, nachname;
    double zeit;

    Schueler(String pvorname, String pnachname, double pzeit) {
        vorname = pvorname;
        nachname = pnachname;
        zeit = pzeit;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public double getZeit() {
        return zeit;
    }
}
