package Polynome;

/**
 * implante le polynome P(z) = z*z-s*z+p
 */
public class PolynomeNormalise {

    private Complexe somme;
    private Complexe produit;

    /**
     * construit moi-meme avec comme P(z) = z^2 - ss*z + pp
     */
    public PolynomeNormalise(Complexe ss, Complexe pp) {
        this.somme = ss;
        this.produit = pp;
    }

    /**
     * construit moi-meme avec comme P(z) = z^2 - z + 1
     */
    public PolynomeNormalise() {
        this(new Complexe(1), new Complexe(1));
    }

    /**
     * affiche moi-meme a l'ecran
     */
    public void afficher() {
        System.out.print("Z*Z -Z*(");
        this.somme.afficher();
        System.out.print(") + (");
        this.produit.afficher();
        System.out.print(")");
    }

    public String toString() {
        return "Z*Z -Z*(" + this.somme.toString() + ") + (" + this.produit.toString() + ")";
    }

    /**
     * calcule et retourne la valeur de moi-meme en z
     */
    public Complexe valeur(Complexe z) {
        return z.fois(z).moins(this.somme.fois(z)).plus(this.produit);
    }

    /**
     * calcule les racines z1 et z2 de moi-meme
     */
    public Complexe[] racines() {
        Complexe[] res;
        Complexe quatre = new Complexe(4, 0), deux = new Complexe(2, 0);
        Complexe delta = this.somme.fois(this.somme).moins(quatre.fois(this.produit));
        Complexe racineDelta;
        double x = Math.sqrt((delta.module() + delta.getPartieReelle()) / 2);
        double y = Math.sqrt((delta.module() - delta.getPartieReelle()) / 2);
        if (delta.getPartieImaginaire() >= 0) {
            racineDelta = new Complexe(x, y);
        } else {
            racineDelta = new Complexe(x, -y);
        }
        res = new Complexe[2];
        res[0] = (this.somme.plus(racineDelta).divisePar(deux));
        res[1] = (this.somme.moins(racineDelta).divisePar(deux));
        return res;
    }

    /**
     * retourne VRAI si moi-meme == pol, FAUX sinon
     */
    public boolean equals(Object obj) {
        PolynomeNormalise autre = (PolynomeNormalise) obj;
        return this.somme.equals(autre.somme) && this.produit.equals(autre.produit);
    }

}
