import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchuelerGUI {
    List<Schueler> sportliste;
    Schueler schueler;
    private JPanel Panel;
    private JTextArea textArea1;
    private JTextField vornameFeld;
    private JTextField nachnameFeld;
    private JTextField zeitFeld;
    private JButton hinzufügenButton;
    private JButton sortierenButton;


    public SchuelerGUI() {
        sportliste = new List<Schueler>();
        hinzufügenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    schueler = new Schueler(vornameFeld.getText(), nachnameFeld.getText(), Double.valueOf(zeitFeld.getText()));
                    vornameFeld.setText("");
                    nachnameFeld.setText("");
                    zeitFeld.setText("");
                    sportliste.append(schueler);
                System.out.println(schueler.getVorname() + " " + schueler.getNachname() + " " + schueler.getZeit());


            }
        });
        sortierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
                        x=sportliste.getContent().getZeit();
                        sportliste.next();


                    }else{
                        x=sportliste.getContent().getZeit();
                        sportliste.next();
                    }

                }

                sportliste.toFirst();
                System.out.println("////");
                while (sportliste.hasAccess()){
                    System.out.println(sportliste.getContent().getVorname() + " " + sportliste.getContent().getNachname() + " " + sportliste.getContent().getZeit());
                    sportliste.next();
                }
                System.out.println("////");
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("SchuelerGUI");
        frame.setContentPane(new SchuelerGUI().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
