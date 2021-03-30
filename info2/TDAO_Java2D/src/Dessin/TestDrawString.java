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
public class TestDrawString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FenetreGraphique fenetre = new FenetreGraphique("Hello World!", 300, 250);

        Graphics2D contexte = fenetre.getGraphics2D();

        contexte.setColor(new Color(124, 200, 30));
        contexte.setFont(new Font("Times New Roman", Font.PLAIN, 250));
        contexte.drawString("Hello world!", 0, 250);

        fenetre.actualiser();

    }

}
