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
public class PointColore extends Point {

    private String couleur;

    public PointColore(double x, double y, String couleur) {
        super(x, y);
        this.couleur = couleur;
    }

    public boolean estDeLaMemeCouleur(PointColore p) {
        return (this.couleur.equals(p.couleur));
    }

    public void afficher() {
        super.afficher();
        System.out.println("Couleur = " + this.couleur);
    }

}
