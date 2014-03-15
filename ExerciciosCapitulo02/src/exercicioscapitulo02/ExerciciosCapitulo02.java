/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicioscapitulo02;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class ExerciciosCapitulo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soma = 0;
        for(int i = 1; i < 1000; i=i+2){
            soma= soma + i;
}
        JOptionPane.showMessageDialog(null,"Resultado da soma é : "+soma);

    }
    
}
