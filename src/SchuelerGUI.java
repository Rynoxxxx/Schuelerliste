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
    private JButton besterButton;
    private JTextField besterFeld;
    private JButton einObjektLöschenButton;
    private JTextField löscheNachnameFeld;
    private JTextField löscheZeitFeld;
    private JTextField löscheVornameFeld;
    private JButton zeitVonButton;
    private JTextField zeitVonFeld;


    public SchuelerGUI() {
        sportliste = new List<Schueler>();
        hinzufügenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(vornameFeld.getText().matches("^[\\p{L}\\p{M}A-Za-z]+$") && nachnameFeld.getText().matches("^[\\p{L}\\p{M}A-Za-z]+$")) {
                    if (sportliste.isEmpty()) {
                        schueler = new Schueler(vornameFeld.getText(), nachnameFeld.getText(), Double.valueOf(zeitFeld.getText()));
                        vornameFeld.setText("");
                        nachnameFeld.setText("");
                        zeitFeld.setText("");
                        sportliste.append(schueler);
                        sportliste.toFirst();
                    /*
                    while (sportliste.hasAccess()) {
                        System.out.println(sportliste.getContent().getVorname() + " " + sportliste.getContent().getNachname() + " " + sportliste.getContent().getZeit());
                        sportliste.next();
                    }*/

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
                    /*
                    while (sportliste.hasAccess()) {
                        System.out.println(sportliste.getContent().getVorname() + " " + sportliste.getContent().getNachname() + " " + sportliste.getContent().getZeit());
                        sportliste.next();
                    }
                    */

                    }

                }
            }
        });
        sortierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sportliste.toFirst();
                System.out.println("----------");
                while (sportliste.hasAccess()) {

                    System.out.println(sportliste.getContent().getVorname() + ", " + sportliste.getContent().getNachname() + ", " + sportliste.getContent().getZeit());

                    sportliste.next();

                }
                System.out.println("----------");
            }

        });
        besterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    sportliste.toFirst();
                    besterFeld.setText(sportliste.getContent().getVorname() + ", " + sportliste.getContent().getNachname() + ", " + sportliste.getContent().getZeit());

            }
        });
        einObjektLöschenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            sportliste.toFirst();
             while(sportliste.hasAccess()){
                //(sportliste.getContent().getVorname()==löscheVornameFeld.getText())&&(sportliste.getContent().getNachname()==löscheNachnameFeld.getText())&&(sportliste.getContent().getZeit()==Double.valueOf(löscheZeitFeld.getText()))
                 String vornameL=löscheVornameFeld.getText();
                 String vorname=sportliste.getContent().getVorname();
                 String nachnameL=löscheNachnameFeld.getText();
                 String nachname=sportliste.getContent().getNachname();
                 Double zeitL=Double.valueOf(löscheZeitFeld.getText());
                 Double zeit=sportliste.getContent().getZeit();
                 int result=vornameL.compareTo(vorname);
                 int result1=nachnameL.compareTo(nachname);
                if(result==0){
                    sportliste.remove();
                    löscheVornameFeld.setText("");
                    löscheNachnameFeld.setText("");
                    löscheZeitFeld.setText("");
                    System.out.println("--------removed--------");
                    return;
                }
                else
                    sportliste.next();
            }
                System.out.println("Not Inside List");
            }
        });
        zeitVonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            sportliste.toFirst();
            while(sportliste.hasAccess()){
                String nachnameG=zeitVonFeld.getText();
                String nachname=sportliste.getContent().getNachname();
                int result=nachnameG.compareTo(nachname);
                //sportliste.getContent().getNachname()==zeitVonFeld.getText()
                if(result==0){
                zeitVonFeld.setText(String.valueOf(sportliste.getContent().getZeit()));
                }else sportliste.next();
            }
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
