package Individu;

public class Individu {

    private String nom;
    protected String prenom;
    private int age;

    /**
     * Constructeur a partir de donnees elementaires
     */
    public Individu(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    /**
     * Constructeur par defaut
     */
    public Individu() {
        this("", "", 0);
    }

    /**
     * Accesseur de nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Mutateur de nom
     */
    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    /**
     * Accesseur de prenom
     */
    public String getPrenom() {
        return this.prenom;
    }

    /**
     * Mutateur de prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Accesseur d'age
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Mutateur d'age
     */
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    /**
     * Affichage complet dans la console
     */
    public void afficher() {
        System.out.println("----------------------------------------");
        System.out.println(" Prenom : " + this.prenom);
        System.out.println(" Nom : " + this.nom);
        System.out.println(" Age : " + this.age);
    }

    /**
     * Conversion en chaine pour un affichage compact
     */
    public String toString() {
        return this.nom + " " + this.prenom + " " + this.age + " ";
    }

    /**
     * Test d'egalite entre individus
     */
    public boolean equals(Object o) {
        Individu a = (Individu) o; // cast obligatoire : transforme la reference sur un Object en reference sur un individu
        return (this.nom.equals(a.nom) && this.prenom.equals(a.prenom) && this.age == a.age);
    }

}
