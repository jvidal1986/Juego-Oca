/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_oca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Pepe
 */
public class Vista_Iniciar_Juego extends JFrame {
   private final String TITULO_STRING="JUEGO DE LA OCA";
   private final String MODO_JUEGO="Elija modo de juego";
   private final String MODO_JUEGO_1="1 Jugador";
   private final String MODO_JUEGO_2="2 Jugadores";
   private final String boto_Iniciar_Partida_String="Iniciar partida";
   private JLabel labelTitulo;
  
   private JPanel JComboxPanel;
   private JComboBox<String> combo_ModoJuego;
   
   private JButton iniciar_Partida_Boton;

    public Vista_Iniciar_Juego() {
        configura_Ventana();
        this.setVisible(true);
    }
    
    private void configura_Ventana(){
        this.setLayout(null);
        anadirPanelY_Label_Titulo();
        anadirPanel_JCombox();
        anadirJComboxY_Item();
        this.setSize(300,300);
    }
    
    public void anadirPanelY_Label_Titulo(){
        JPanel panelTitulo=new JPanel();
        labelTitulo=new JLabel(TITULO_STRING);
        panelTitulo.setBounds(50, 50, 150, 50);
        panelTitulo.add(labelTitulo);
        this.add(panelTitulo);
    }

    private void anadirPanel_JCombox() {
       JComboxPanel=new JPanel();
       JComboxPanel.setBounds(50, 100, 150, 200);
      
       JLabel modoJuego_Label=new JLabel(MODO_JUEGO);
       JComboxPanel.add(modoJuego_Label, BorderLayout.NORTH);
       JComboxPanel.add(modoJuego_Label);
       this.add(JComboxPanel);
       
    }
    
    private void anadirJComboxY_Item(){
        combo_ModoJuego=new JComboBox<>();
       combo_ModoJuego.addItem(MODO_JUEGO_1);
       combo_ModoJuego.addItem(MODO_JUEGO_2);
       JComboxPanel.add(combo_ModoJuego, BorderLayout.CENTER);
       
    }
  
   
   
   
    
}
