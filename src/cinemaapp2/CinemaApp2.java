/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemaapp2;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.Login;

/**
 *
 * @author Dell Inspiron
 */

public class CinemaApp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            new Login().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CinemaApp2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
