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
    schueler = new Schueler(vornameFeld.getText(), nachnameFeld.getText(), Double.valueOf(zeitFeld.getText()));
                    vornameFeld.setText("");
                    nachnameFeld.setText("");
                    zeitFeld.setText("");
                    sportliste.append(schueler);
                    System.out.println(schueler.getVorname() + " " + schueler.getNachname() + " " + schueler.getZeit());





//-----------------------------------------------------------




if (!sportliste.isEmpty()) {
                    sportliste.toFirst();
                    double x = sportliste.getContent().getZeit();
                    sportliste.next();
                    while (sportliste.hasAccess()) {
                        if (sportliste.getContent().getZeit() < x) {

                            String nachname = sportliste.getContent().getNachname();
                            String vorname = sportliste.getContent().getVorname();
                            Double zeit = sportliste.getContent().getZeit();
                            sportliste.remove();
                            sportliste.toFirst();
                            schueler = new Schueler(vorname, nachname, zeit);
                            sportliste.insert(schueler);
                            sportliste.toFirst();
                            sportliste.next();
                            x = sportliste.getContent().getZeit();
                            sportliste.next();


                        } else {
                            x = sportliste.getContent().getZeit();
                            sportliste.next();
                        }

                    }

                    sportliste.toFirst();
                    System.out.println("////");
                    while (sportliste.hasAccess()) {
                        System.out.println(sportliste.getContent().getVorname() + " " + sportliste.getContent().getNachname() + " " + sportliste.getContent().getZeit());
                        sportliste.next();
                    }
                    System.out.println("////");
                }



*/









}
