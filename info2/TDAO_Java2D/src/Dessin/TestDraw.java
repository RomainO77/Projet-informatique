/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dessin;

import FenetreGraphique.FenetreGraphique;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

/**
 *
 * @author guillaume.laurent
 */
public class TestDraw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FenetreGraphique fenetre = new FenetreGraphique("Hello World!", 300, 250);

        Graphics2D contexte = fenetre.getGraphics2D();

        contexte.setColor(Color.RED);
        contexte.drawLine(10, 10, 60, 160);

        contexte.setColor(Color.GREEN);
        contexte.drawRect(100, 10, 50, 30);

        contexte.setColor(Color.BLUE);
        contexte.fillOval(200, 10, 20, 10);
        fenetre.actualiser();

    }

}
