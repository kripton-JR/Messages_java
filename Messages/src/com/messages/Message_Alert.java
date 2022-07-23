package com.messages;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Message_Alert extends JFrame {
    
    Font Roboto14 = new Font("Roboto",0,14);
    Font Roboto18 = new Font("Roboto",1,18);
    Color rojo = new Color(250,78,78);
    Color blanco = new Color(255,255,255);
    Color naranja = new Color(255,159,17);

    public Message_Alert(String texto) {
        
        
        //para la ventana
        this.setSize(360, 220);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
       
        //para el panel
        CreacionComponentes(texto);

        
       
    }
    private void CreacionComponentes(String mes){
    //creamos el panel
        JPanel panel = new JPanel();
        panel.setSize(360, 220);
        panel.setBackground(naranja);
        panel.setLayout(null);
        this.getContentPane().add(panel);
     //creamos la etiqueta con icono 
        JLabel titulo = new JLabel();
        titulo.setText("Mensaje del Sistema");
        titulo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        titulo.setForeground(blanco);
        titulo.setFont(Roboto18);
        titulo.setBounds(0, 10, 360, 20);
        panel.add(titulo);
        
    //creamos la etiqueta con icono 
        JLabel icono = new JLabel(new ImageIcon(getClass().getResource("/icons/warning.png")));
        icono.setOpaque(true);
        icono.setBackground(blanco);
        icono.setBounds(10, 40, 340, 100);
        panel.add(icono);
        
    //creamos el mensaje
        JLabel mensage = new JLabel();
        mensage.setText(mes);
        mensage.setFont(Roboto18);
        mensage.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        mensage.setOpaque(true);
        mensage.setBackground(blanco);
        mensage.setBounds(10, 140, 340, 70);
        panel.add(mensage);
        
    //crear boton salir
        JLabel salir = new JLabel();
        salir.setOpaque(true);
        salir.setBackground(rojo);
        salir.setForeground(blanco);
        salir.setText("X");
        salir.setFont(Roboto18);
        salir.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        salir.setBounds(335,0,25,25);
        salir.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            dispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                }

            @Override
            public void mouseReleased(MouseEvent e) {
                }

            @Override
            public void mouseEntered(MouseEvent e) {
                salir.setBackground(Color.RED);
               
               }

            @Override
            public void mouseExited(MouseEvent e) {
                
                 salir.setBackground(rojo);
                }
        });
        
        panel.add(salir);
        
        
        
    }
    
   

    
}
