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
                } else {
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
            }
        });
       /* sortierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                sportliste.toFirst();
                while (sportliste.hasAccess()) {
                    System.out.println(sportliste.getContent().getVorname() + ", " + sportliste.getContent().getNachname() + ", " + sportliste.getContent().getZeit());
                    sportliste.next();
                }
            }
        });*/
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
