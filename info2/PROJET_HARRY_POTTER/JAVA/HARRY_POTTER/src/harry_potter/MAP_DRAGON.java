/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harry_potter;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author rollin
 */
public class MAP_DRAGON {
    
    private int largeur = 20;
    private int hauteur = 20;
    private int tailleTuile = 20;
    
    private BufferedImage uneTuile;
    
    public MAP_DRAGON() {
        
        for (int i = 1; i < 21; i++){
            for (int j = 1; j < 21; j++)
        try {
            BufferedImage tileset = ImageIO.read(getClass().getResource("../MAP_DRAGON_images/testorange20_20.png"));
            uneTuile = tileset.getSubimage(0, 0, tailleTuile, tailleTuile);
        } catch (IOException ex) {
            Logger.getLogger(MAP_DRAGON.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void miseAJour () {
    }
    public void rendu (Graphics2D contexte) {
    contexte . drawImage ( uneTuile , 0, 0, null);
    }
}
