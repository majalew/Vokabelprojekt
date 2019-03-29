import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 29.03.2019
  * @author 
  */

public class Startseite extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private Label label1 = new Label();
  private Panel panel1 = new Panel(null);
  private Button button1 = new Button();
  private Button button2 = new Button();
  private Button button3 = new Button();
  private Button button4 = new Button();
  // Ende Attribute
  
  public Startseite(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(96, 8, 147, 14);
    jLabel1.setText("Vokabelprogramm");
    jLabel1.setFont(new Font("Dialog", Font.BOLD, 12));
    cp.add(jLabel1);
    label1.setBounds(104, 24, 91, 22);
    label1.setText("Ajumasu");
    label1.setFont(new Font("@Arial Unicode MS", Font.BOLD, 20));
    cp.add(label1);
    panel1.setBounds(88, 48, 121, 9);
    panel1.setBackground(new Color(0xA3B8CC));
    panel1.setFont(new Font("Dialog", Font.PLAIN, 12));
    cp.add(panel1);
    button1.setBounds(24, 96, 241, 41);
    button1.setLabel("Unsere Vokabeln");
    button1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button1_ActionPerformed(evt);
      }
    });
    button1.setFont(new Font("Dialog", Font.PLAIN, 12));
    cp.add(button1);
    button2.setBounds(24, 160, 241, 41);
    button2.setLabel("Abfragen");
    button2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button2_ActionPerformed(evt);
      }
    });
    button2.setFont(new Font("Dialog", Font.PLAIN, 12));
    cp.add(button2);
    button3.setBounds(240, 224, 25, 33);
    button3.setLabel("X");
    button3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button3_ActionPerformed(evt);
      }
    });
    button3.setFont(new Font("Dialog", Font.PLAIN, 12));
    cp.add(button3);
    button4.setBounds(24, 224, 89, 33);
    button4.setLabel("Einstellungen");
    button4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button4_ActionPerformed(evt);
      }
    });
    button4.setFont(new Font("Dialog", Font.PLAIN, 12));
    cp.add(button4);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Startseite
  
  // Anfang Methoden
  public void button1_ActionPerformed(ActionEvent evt) {
    setVisible(false);
    
  } // end of button1_ActionPerformed
  
  public void button2_ActionPerformed(ActionEvent evt) {
    setVisible(false);
    //Vokabelprogramm.setVisible(true);
  } // end of button2_ActionPerformed
  
  public void button3_ActionPerformed(ActionEvent evt) {
    setVisible(false);
  } // end of button3_ActionPerformed
  
  public void button4_ActionPerformed(ActionEvent evt) {
    setVisible(false);
  } // end of button4_ActionPerformed
  
  // Ende Methoden
  
  public static void main(String[] args) {
    new Startseite("Startseite");
  } // end of main
  
} // end of class Startseite
