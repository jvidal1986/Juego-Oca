/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_oca;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/**
 *
 * @author Pepe
 */
public class Controlador_Vista_Iniciar_Juego implements ActionListener {

    private Vista_Iniciar_Juego vista_Iniciar_Juego;
    private Vista_Juego vista_Juego;

    public Controlador_Vista_Iniciar_Juego(Vista_Iniciar_Juego vista_Iniciar_Juego) {
        this.vista_Iniciar_Juego = vista_Iniciar_Juego;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String opcion_Combo_Modo_Juego = vista_Iniciar_Juego.obtenerItem_ComboModoJuego();
        if (e.getActionCommand().equals(Vista_Iniciar_Juego.INICIAR_PARTIDA_STRING_BOTON)) {

            switch (opcion_Combo_Modo_Juego) {

                case Vista_Iniciar_Juego.MODO_JUEGO_1:
                    vista_Iniciar_Juego.setVisible(false);
                    new Vista_Juego();
                    System.out.println(opcion_Combo_Modo_Juego);

                    break;

                case Vista_Iniciar_Juego.MODO_JUEGO_2:

                    System.out.println(opcion_Combo_Modo_Juego);
                    break;
            }
        }
    }

}
