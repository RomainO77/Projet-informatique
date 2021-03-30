/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author guillaume.laurent
 */
public class TestSelectObjet {

    public static void main(String[] args) {

        try {

            Connection connexion = DriverManager.getConnection("jdbc:mysql://nemrod.ens2m.fr:3306/tp_jdbc?serverTimezone=UTC", "etudiant", "YTDTvj9TR3CDYCmP");

            PreparedStatement requete = connexion.prepareStatement("SELECT id, description, latitude, longitude, visible, dateCreation, proprietaire FROM Objet;");
            ResultSet resultat = requete.executeQuery();
            while (resultat.next()) {
                int id = resultat.getInt("id");
                String description = resultat.getString("description");
                double latitude = resultat.getDouble("latitude");
                double longitude = resultat.getDouble("longitude");
                int visible = resultat.getInt("visible");                
                Date datecreation = resultat.getDate("datecreation");
                String proprietaire = resultat.getString("proprietaire");
                System.out.println(""+ id + " = (" + description + "; " + latitude + ";" + longitude + ";" + visible +";"+ datecreation + ";" +proprietaire + ")");
            }

            requete.close();
            connexion.close();
            
            

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    

    }
    
    

}