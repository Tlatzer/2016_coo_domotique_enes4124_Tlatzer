public class ChemineeAdapter implements Appareil{
  private Cheminee cheminee;

  public ChemineeAdapter(Cheminee c){
    this.cheminee = c;
  }

  public void allumer(){
    this.cheminee.changerIntensite(100);
  }

  public void eteindre(){
    this.cheminee.changerIntensite(0);
  }

  public String toString(){
    String a = "";
    if(this.isAllume()) a = "On";
    else a = "Off";
    return ("Cheminee Adaptee : " + a);
  }

  public boolean isAllume(){
    if(this.cheminee.getLumiere()==100) return true;
    else return false;
  }
}
