/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PointColore;

/**
 *
 * @author guillaume.laurent
 */
public class TestPointColore {

    public static void main(String[] args) {
        PointColore a = new PointColore(3, 7, "Bleu");
        PointColore b = new PointColore(10, 5, "Rouge");

        a.setAbscisse(0);
        System.out.println("Distance entre a et b = " + a.distance(b));
        
        System.out.println("a est-il de la meme couleur que b ? " + a.estDeLaMemeCouleur(b));

        a.afficher();
    }

}
