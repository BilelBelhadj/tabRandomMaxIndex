import java.util.*;

public class PlusGrandValeur {

    //initialisatio de taille de tableau
    final int TAILLE = 15;

    //declaration des attributs
    int[] vals = {};


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


    //methode d affichage d index et max de tableau
    public void afficheMaxIndex(){

        int max = 0;
        int index = -1; //initialisatio de variable d idex a -1 e cas d erreur le programme affiche -1 on connait qu il y a quelque chose qui marche pas

        for(int i = 0; i < TAILLE; i++){
            
            //determiner le max
            if(vals[i] > max){
                max = vals[i];
                index = i + 1;
            }
        }
        //affichage des resultats
        System.out.println("La plus grad nombre du tableau = " + max);
        System.out.println("Il est a l inndex : " + index);
    }
}
