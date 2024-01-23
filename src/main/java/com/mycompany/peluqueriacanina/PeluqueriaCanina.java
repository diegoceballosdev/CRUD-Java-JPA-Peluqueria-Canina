package com.mycompany.peluqueriacanina;

import com.mycompany.peluqueriacanina.igu.Principal;
import javax.swing.JFrame;

public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        Principal pantallaPrinc = new Principal();
        pantallaPrinc.setVisible(true);
        pantallaPrinc.setLocationRelativeTo(null);
        pantallaPrinc.setResizable(false);
        pantallaPrinc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
