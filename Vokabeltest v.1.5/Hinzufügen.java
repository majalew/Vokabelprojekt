import java.awt.*;
import java.awt.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 29.03.2019
  * @author 
  */

public class Hinzufügen extends Frame {
  // Anfang Attribute
  private Button bestaetigen = new Button();
  private TextField Fremdsprache = new TextField();
  private TextField Muttersprache = new TextField();
  Lernset ls;
  private Button zurueck = new Button();
  private Label lMuttersprache = new Label();
  private Label lFremdsprache = new Label();
  // Ende Attribute
  
  public Hinzufügen(String title, Lernset ls) { 
    // Frame-Initialisierung
    super(title);
    this.ls = ls;
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 300; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Panel cp = new Panel(null);
    add(cp);
    // Anfang Komponenten
    
    bestaetigen.setBounds(104, 144, 75, 25);
    bestaetigen.setLabel("bestaetigen");
    bestaetigen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bestaetigen_ActionPerformed(evt);
      }
    });
    bestaetigen.setBackground(new Color(0xFFC800));
    cp.add(bestaetigen);
    Fremdsprache.setBounds(64, 104, 150, 20);
    cp.add(Fremdsprache);
    Muttersprache.setBounds(64, 48, 150, 20);
    cp.add(Muttersprache);
    zurueck.setBounds(160, 200, 75, 25);
    zurueck.setLabel("zurueck");
    zurueck.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        zurueck_ActionPerformed(evt);
      }
    });
    zurueck.setBackground(new Color(0xC0C0C0));
    cp.add(zurueck);
    lMuttersprache.setBounds(64, 24, 89, 17);
    lMuttersprache.setText("Muttersprache");
    lMuttersprache.setBackground(new Color(0xC0C0C0));
    cp.add(lMuttersprache);
    lFremdsprache.setBounds(64, 80, 89, 19);
    lFremdsprache.setText("Fremdsprache");
    lFremdsprache.setBackground(new Color(0xC0C0C0));
    cp.add(lFremdsprache);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Hinzufügen
  
  // Anfang Methoden
  public void bestaetigen_ActionPerformed(ActionEvent evt) {
    String m = Muttersprache.getText();
    String f = Fremdsprache.getText();
    Vokabel v = new Vokabel(m,f);
    ls.fuegeVokabelHinzu(v);
    Vokabel v2 = ls.getVokabelZuIndex(ls.anzahlVokabeln()-1);
    System.out.println(v2.getdeut()+"/"+v2.getfremd());
  } // end of bestaetigen_ActionPerformed
  
  public void zurueck_ActionPerformed(ActionEvent evt) {
    //new Vokabelprogramm("Vokabelprogramm");
    //Vokabelprogramm.setVisisble(true);
    this.setVisible(false);
  } // end of zurueck_ActionPerformed
  
  // Ende Methoden
  
  public static void main(String[] args) {
    System.out.println("Fenster gestartet");
    //new Hinzufügen("Hinzufügen");
  } // end of main
  
} // end of class Hinzufügen
