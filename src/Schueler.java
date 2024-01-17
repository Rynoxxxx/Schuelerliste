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

    /*
    if (sportliste.isEmpty()) {
    schueler = new Schueler(vornameFeld.getText(), nachnameFeld.getText(), Double.valueOf(zeitFeld.getText()));
                    vornameFeld.setText("");
                    nachnameFeld.setText("");
                    zeitFeld.setText("");
                    sportliste.append(schueler);
                    sportliste.toFirst();
                    while (sportliste.hasAccess()) {
        System.out.println(sportliste.getContent().getVorname() + " " + sportliste.getContent().getNachname() + " " + sportliste.getContent().getZeit());
        sportliste.next();
    }

    //System.out.println(schueler.getVorname()+" "+schueler.getNachname()+" "+schueler.getZeit());
} else

    {
        schueler = new Schueler(vornameFeld.getText(), nachnameFeld.getText(), Double.valueOf(zeitFeld.getText()));
        vornameFeld.setText("");
        nachnameFeld.setText("");
        zeitFeld.setText("");
        sportliste.toFirst();
        while (sportliste.hasAccess() && schueler.getZeit() > sportliste.getContent().getZeit()) {
            sportliste.next();
        }
        if (sportliste.hasAccess()) {
            sportliste.insert(schueler);
        } else {
            sportliste.append(schueler);
        }
        sportliste.toFirst();
        while (sportliste.hasAccess()) {
            System.out.println(sportliste.getContent().getVorname() + " " + sportliste.getContent().getNachname() + " " + sportliste.getContent().getZeit());
            sportliste.next();
        }
    }



//-----------------------------------------------------------


    sportliste.toFirst();
                while (sportliste.hasAccess()) {
        System.out.println(sportliste.getContent().getVorname() + ", " + sportliste.getContent().getNachname() + ", " + sportliste.getContent().getZeit());
        sportliste.next();
    }





*/









}
