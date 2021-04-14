import static libtest.Lanceur.lancer;
import static libtest.OutilTest.assertEquals;
import libtest.*;


public class TelecommandeTest{

    public static void main(String[] args) {

    }

    /**
      * Test qui ajoute une lampe a une telecommande vide
      */
    public void test_ajoutLampeVide(){
        Lampe l = new Lampe("Theo 1");
        Telecommande t = new Telecommande();
        t.ajouterLampe(l);
        assertEquals("Lampe non ajoutee", "Theo 1", l.getLampes()[0]);
    }


    /**
      * Test qui ajoute une lampe a une telecommande avec un element
      */
    public void test_ajoutLampeElement(){
        Lampe l1 = new Lampe("Lampe1");
        Lampe l2 = new Lampe("Lampe2");
        Telecommande t = new Telecommande();
        t.ajouterLampe(l1);
        t.ajouterLampe(l2);
        assertEquals("Lampe 1 non ajoutee", "Lampe1", l.getLampes()[0]);
        assertEquals("Lampe 2 non ajoutee", "Lampe2", l.getLampes()[1]);
    }


    /**
      * Test qui active une lampe existante en position 0
      */
    public void test_ActiverExistLampe0(){
      Lampe l = new Lampe("Lampe1");
      Telecommande t = new Telecommande();
      t.ajouterLampe(l1);
      t.activerLampe(0);
      assertEquals("Lampe non activee", true, l.getLampes()[0].isAllume());
    }


    /**
      * Test qui active une lampe existante en position 1
      */
    public void test_ActiverExistLampe1(){
      Lampe l1 = new Lampe("Lampe1");
      Lampe l2 = new Lampe("Lampe2");
      Telecommande t = new Telecommande();
      t.ajouterLampe(l1);
      t.ajouterLampe(l2);
      t.activerLampe(1);
      assertEquals("Lampe 2 non activee", true, l.getLampes()[1].isAllume());
    }


    /**
      * Test qui active une lampe inexistante
      */
    public void test_ActiverInexistLampe(){
      Telecommande t = new Telecommande();
      t.activerLampe(0);
      assertEquals("Lampe activee", false, l.getLampes()[0].isAllume());
    }

}
