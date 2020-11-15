/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_oca;

import javax.swing.JFrame;

/**
 *
 * @author Pepe
 */
public class Vista_Juego extends JFrame {

    public Vista_Juego() {
        configurar_ventana();
        this.setVisible(true);
       
    }
    private void configurar_ventana(){
        
        this.setSize(1000, 1000);
    }
}
