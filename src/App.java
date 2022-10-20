/*
Nom du projet : programme qui permet de remplir unn tableau avec des vaaleur aleeatoire et afficher le max et l index
Auteur        : Bilel Belhadj
Date          : 20/10/2022
Version		  : 0.0.1

*/

public class App {
    public static void main(String[] args) throws Exception {
        
        PlusGrandValeur tab1 = new PlusGrandValeur();   //initialiser et remplir l objet avec le constructeur
        tab1.display();                                 //afficher le tableau
        tab1.afficheMaxIndex();                         //methode d affichage de max et idex
    }
}
