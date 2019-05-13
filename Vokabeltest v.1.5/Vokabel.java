class Vokabel {
  private String deut;
  private String fremd;
  // Ende Attribute
  
  
  
  // Anfang Methoden
  public Vokabel(String deut, String fremd)
  {
    this.deut = deut;
    this.fremd = fremd;
  }
  
  public String getdeut() {
    return deut;
  }
  
  public void setdeut(String deut) {
    this.deut = deut;
  }
  
  public String getfremd() {
    return fremd;
  }
  

  
  // Ende Methoden
}