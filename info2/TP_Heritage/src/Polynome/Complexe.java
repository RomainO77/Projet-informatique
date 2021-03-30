package Polynome;

public class Complexe {

    private double partieReelle;
    private double partieImaginaire;

    public Complexe(double partieReelle, double partieImaginaire) {
        this.partieReelle = partieReelle;
        this.partieImaginaire = partieImaginaire;
    }

    public Complexe(double a) {
        this(a, 0.0);
    }

    public Complexe() {
        this(1.0, 0.0);
    }

    public double getPartieReelle() {
        return this.partieReelle;
    }

    public double getPartieImaginaire() {
        return this.partieImaginaire;
    }

    public double module() {
        return (Math.sqrt(this.partieReelle * this.partieReelle + this.partieImaginaire * this.partieImaginaire));
    }

    public String toString() {
        if (this.partieImaginaire == 0) {
            return this.partieReelle + "";
        } else if (this.partieImaginaire > 0) {
            return this.partieReelle + "+" + this.partieImaginaire + "i";
        } else {
            return this.partieReelle + "" + this.partieImaginaire + "i";
        }
    }

    public void afficher() {
        if (this.partieImaginaire == 0) {
            System.out.print(this.partieReelle);
        } else if (this.partieImaginaire > 0) {
            System.out.print(this.partieReelle + "+" + this.partieImaginaire + "i");
        } else {
            System.out.print(this.partieReelle + "" + this.partieImaginaire + "i");
        }
    }

    public Complexe conjugue() {
        return new Complexe(this.partieReelle, -this.partieImaginaire);
    }

    public Complexe oppose() {
        return new Complexe(-this.partieReelle, -this.partieImaginaire);
    }

    public Complexe inverse() {
        return this.conjugue().fois(new Complexe(1.0 / this.module() / this.module()));
    }

    public Complexe plus(Complexe autre) {
        return new Complexe(this.partieReelle + autre.partieReelle, this.partieImaginaire + autre.partieImaginaire);
    }

    public Complexe moins(Complexe autre) {
        return this.plus(autre.oppose());
    }

    public Complexe fois(Complexe autre) {
        return new Complexe(this.partieReelle * autre.partieReelle - this.partieImaginaire * autre.partieImaginaire, 
                this.partieReelle * autre.partieImaginaire + this.partieImaginaire * autre.partieReelle);
    }

    public Complexe divisePar(Complexe autre) {
        return this.fois(autre.inverse());
    }

    public boolean equals(Object obj) {
        Complexe autre = (Complexe) obj;
        return (this.moins(autre)).module() < 0.00000000001;
    }

}
