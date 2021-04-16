import java.util.*;


/**
 * Classe Telecommande chargée de commander plusieurs lampes à distance
 */
public class Telecommande {

    /**
     * liste des lampes controlées par la télécommande
     */
    private ArrayList<Lampe> lampes;



    /**
     * constructeur vide qui construit une télécommande ne controlant initialement aucune lampe
     */
    public Telecommande(){

        this.lampes = new ArrayList<Lampe>();

    }

    /**
     * ajoute un lien dans la télécommande permettant de commander cette lampe
     * @param Lampe une lampe
     */
    public void ajouterLampe(Lampe pLampe){

        this.lampes.add(pLampe);

    }

    /**
     * effectue l'opération correspondante sur la lampe de la télécommande à l'indice indiceLampe
     * @param indiceLampe 
     */
    public void activerLampe(int indiceLampe){

        for(int i = 0; i < this.lampes.size(); i++){

            if(this.lampes.get(i).isAllume() == true){

                System.out.println("La lampe est déjà activée");

            }else{this.lampes.get(i).allumer();}

        }
        

    }


    public void desactiverLampe(int indiceLampe){

        for(int i = 0; i < this.lampes.size(); i++){

            if(this.lampes.get(i).isAllume() == false){

                System.out.println("La lampe est déjà désactivée");

            }else{this.lampes.get(i).eteindre();}

        }

    }

    public void activerTout(){

        for(int i = 0; i < this.lampes.size(); i++){

            this.lampes.get(i).allumer();

        }

    }

    public String toString(){

        return "La télécommande possède:" + this.lampes.size() + "lampes";

    }






}
