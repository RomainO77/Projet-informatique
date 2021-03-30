/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harry_potter;

import java.awt.Graphics2D;

/**
 *
 * @author rollin
 */
public class Jeu {
    
    private MAP_DRAGON carte;
     
    public Jeu() {        
        this.carte = new MAP_DRAGON();
    }

    public void miseAJour() {
        this.carte.miseAJour();
    }

    public void rendu(Graphics2D contexte) {
        this.carte.rendu(contexte);
    }
}
