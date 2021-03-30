/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individu;

/**
 *
 * @author guillaume.laurent
 */
public class Etudiant extends Individu {

    private int numero;
    private String email;
    private int nombreInscription;

    public Etudiant(String nom, String prenom, int age, int numero, int nbIns) {
        super(nom, prenom, age);
        this.numero = numero;
        this.nombreInscription = nbIns;
        this.email = this.getNom() + "." + this.prenom + "@ens2m.org";
    }
    
    public void afficher() {
        super.afficher();
        System.out.println("Numero : " + this.numero);
        System.out.println("Email : " + this.email);
        System.out.println("Nombre d'inscription : " + this.nombreInscription);
    }

    public int getNumero() {
        return numero;
    }
    

}
