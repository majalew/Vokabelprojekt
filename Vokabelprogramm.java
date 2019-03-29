import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 18.01.2019
  * @author 
  */

public class Vokabelprogramm extends JFrame {
  // Anfang Attribute
  private JPanel jPanel1 = new JPanel(null, true);

  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JPanel jPanel2 = new JPanel(null, true);
  private JPanel jPanel3 = new JPanel(null, true);
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  Lernset ls;
  int i=0;


  // Ende Attribute
  
  public Vokabelprogramm(String title) { 
    // Frame-Initialisierung
    super(title);
    
    ls = new Lernset();
    Vokabel v1 = new Vokabel("Apfel", "apple");
    ls.fuegeVokabelHinzu(v1);
    Vokabel v2 = new Vokabel("Hund", "dog");
    ls.fuegeVokabelHinzu(v2);
    Vokabel v3 = new Vokabel("Katze", "cat");
    ls.fuegeVokabelHinzu(v3);
    Vokabel v4 = new Vokabel("Haus", "haus");
    ls.fuegeVokabelHinzu(v4);
    Vokabel v5 = new Vokabel("Änderung", "amendment");
    ls.fuegeVokabelHinzu(v5);
    
    //System.out.println(ls.anzahlVokabeln());
    
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 356; 
    int frameHeight = 372;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jPanel1.setBounds(48, 40, 241, 9);
    jPanel1.setOpaque(true);
    jPanel1.setBackground(new Color(0xB8CFE5));
    cp.add(jPanel1);
    
    jLabel2.setBounds(80, 8, 222, 31);
    jLabel2.setText("Vokabelübung");
    jLabel2.setFont(new Font("Liberation Sans", Font.BOLD, 24));
    cp.add(jLabel2);
    jLabel1.setBounds(16, 72, 139, 33);
    jLabel1.setText("Fremdsprache:");
    cp.add(jLabel1);
    jLabel3.setBounds(232, 72, 107, 33);
    jLabel3.setText("Deutsch:");
    cp.add(jLabel3);
    jPanel2.setBounds(8, 96, 105, 9);
    jPanel2.setOpaque(true);
    jPanel2.setBackground(new Color(0xA3B8CC));
    cp.add(jPanel2);
    jPanel3.setBounds(232, 96, 89, 9);
    jPanel3.setOpaque(true);
    jPanel3.setBackground(new Color(0xA3B8CC));
    cp.add(jPanel3);
    jLabel4.setBounds(24, 128, 115, 49);
    jLabel4.setText(ls.getVokabelZuIndex(i).getfremd());
    cp.add(jLabel4);
    jLabel4.setVisible(false);
    jLabel5.setBounds(224, 120, 139, 57);
    jLabel5.setText(ls.getVokabelZuIndex(i).getdeut());
    cp.add(jLabel5);
    jLabel5.setVisible(false);
    jButton1.setBounds(8, 248, 129, 49);
    jButton1.setText("Wusste ich!");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.setVisible(false);
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        //jLabel4.setText(v.getfremd());
        //jLabel5.setText(v.getdeut());
        jButton4.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jLabel5.setVisible(false);
        if (i==ls.anzahlVokabeln()-1) {
          i=-1;
        } // end of if
        i=i+1;
        System.out.println(i);
        jLabel5.setText(ls.getVokabelZuIndex(i+0).getdeut());
        jLabel4.setText(ls.getVokabelZuIndex(i+0).getfremd());
        
      }
    });
    jButton1.setBackground(new Color(0x68A327));
    cp.add(jButton1);
    jButton2.setBounds(200, 248, 137, 49);
    jButton2.setText("Wusste ich nicht!");
    jButton2.setVisible(false);
    jButton2.setMargin(new Insets(2, 2, 2, 2));                                    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        //jLabel4.setText(v.getfremd());
        //jLabel5.setText(v.getdeutsch());
        jButton4.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jLabel5.setVisible(false);
        if (i==ls.anzahlVokabeln()-1) {
          i=-1;
        } // end of if
        i=i+1;
        System.out.println(i);
        jLabel5.setText(ls.getVokabelZuIndex(i+0).getdeut());
        jLabel4.setText(ls.getVokabelZuIndex(i+0).getfremd());
        
      }
    });
    jButton2.setBackground(new Color(0xD63430));
    cp.add(jButton2);
    jButton3.setBounds(104, 192, 137, 49);
    jButton3.setText("Start");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3.setVisible(false);
        jButton4.setVisible(true);
        jLabel4.setVisible(true);
        
      }
    });
    
    cp.add(jButton3);
    jButton4.setBounds(104, 216, 137, 49);
    jButton4.setText("Auflösen");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.setVisible(false);
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4.setVisible(false);
        jButton1.setVisible(true);
        jButton2.setVisible(true);
        jLabel5.setVisible(true);
      }
    });
    cp.add(jButton4);
    // Ende Komponenten
    
    setVisible(false);
    
    
  } // end of public Vokabelprogramm
  
  // Anfang Methoden
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton1_ActionPerformed
  
  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton2_ActionPerformed
  
  public void jButton3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton3_ActionPerformed
  
  public void jButton4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton4_ActionPerformed
  
  // Ende Methoden
  
  public static void main(String[] args) {
    new Vokabelprogramm("Vokabelprogramm");
  } // end of main
  
} // end of class Vokabelprogramm
