package PointColore;

/**
 *
 * @author guillaume.laurent
 */
public class Point implements Affichable, Comparable {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setAbscisse(double x) {
        this.x = x;
    }

    public double distance(Point p) {
        return Math.sqrt((this.x - p.x) * (this.x - p.x)
                + (this.y - p.y) * (this.y - p.y));
    }

    public void afficher() {
        System.out.println("Abscisse = " + this.x);
        System.out.println("Ordonnee = " + this.y);
    }

    public int compareTo(Object obj) {
        Point autre = (Point) obj;
        if (this.x < autre.x) {
            return -1;
        } else if (this.x > autre.x) {
            return 1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "(" + x + ", " + y + ')';
    }
    
}
