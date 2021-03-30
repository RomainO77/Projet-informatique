/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PointColore;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author guillaume.laurent
 */
public class TestListePoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Point> liste = new ArrayList<Point>();
        liste.add(new Point(8, 9));
        liste.add(new Point(19, 7));
        liste.add(new Point(1, 11));
        Collections.sort(liste);
        System.out.println(liste);
    }

}
