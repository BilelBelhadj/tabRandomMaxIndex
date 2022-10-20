import java.util.*;

public class PlusGrandValeur {

    //declaration des attributs
    int[] vals = {};
    //initialisatio de taille de tableau
    final int TAILLE = 15;

    //constructeur pour remplir le tableau
    PlusGrandValeur(){

        //initialisation necessaire de tabbleau
        vals = new int[TAILLE];

        //remplissage de taleau avec des valeur aleatoire
        for(int i = 0; i < TAILLE; i++){
            Random rand = new Random();
            vals[i] = rand.nextInt(101);
        }
    }

    //methode d affichage de max et son index
    public void display(){

        for(int i = 0; i < TAILLE; i++){
            System.out.println(vals[i]);
        }
    }

    public void afficheMax(){

        int max = 0;
        for(int i = 0; i < TAILLE; i++){
            
            if(vals[i] > max){
                max = vals[i];
            }
        }
        System.out.println("La valeur maximal du tableau = " + max);
    }
}
