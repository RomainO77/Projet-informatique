/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individu;

import java.util.ArrayList;

/**
 *
 * @author guillaume.laurent
 */
public class TestIndividu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Annuaire annuaire = new Annuaire();
        
        Individu toto = new Individu("Toto", "nini", 10);
        Individu dodo = new Etudiant("Dodo", "nana", 10, 12345, 1);
        
        annuaire.add(toto);
        annuaire.add(dodo);
        
        for (Individu ind : annuaire) {
            ind.afficher();
        }
        
    }
    
}
