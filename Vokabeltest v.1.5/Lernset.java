import java.util.ArrayList;
import java.util.List;

class Lernset {
  private String bezeichnung;
  ArrayList<Vokabel> vokabeln = new ArrayList<>();
  
  public void fuegeVokabelHinzu(Vokabel v)
  {
    vokabeln.add(v);
    System.out.println("Das Lernset enthält jetzt "+anzahlVokabeln());
  }
  
  public int anzahlVokabeln()
  {
    return vokabeln.size();
  }
  
  public Vokabel getVokabelZuIndex(int index)
  {
    return vokabeln.get(index);
  }
  
  public static void main(String[] args) {
    //Lernset ls = new Lernset;
  }
}