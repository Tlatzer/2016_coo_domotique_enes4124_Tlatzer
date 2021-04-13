import static libtest.Lanceur.lancer;
import static libtest.OutilTest.assertEquals;
import libtest.*;


public class TelecommandeTest{

    public static void main(String[] args) {
        
    }

    public void test_ajoutLampeVide(){
        Lampe l = new Lampe("Theo 1");
        Telecommande t = new Telecommande();
        t.ajouterLampe(l);


		assertEquals("Lampe non ajouter", "Theo 1", l.getLampe()[0]);

    }

    public void test_ajoutLampeElement(){
        Lampe l = new Lampe()
    }


    public void test_ActiverExistLampe0(){
        
    }


    public void test_ActiverExistLampe1(){
        
    }


    public void test_ActiverInexistLampe(){
        
    }

}