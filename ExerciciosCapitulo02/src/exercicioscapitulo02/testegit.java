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
public class testegit {
    public static void main(String[] args) {
  JOptionPane.showMessageDialog(null,"Seu saldo é 0");
  
  String DPST = JOptionPane.showInputDialog(null,"Digite o valor do deposito: ");
  int dpst = Integer.parseInt(DPST);
  JOptionPane.showMessageDialog(null,"Seu saldo atual é: "+dpst+"R$");
  String DBT = JOptionPane.showInputDialog(null,"Quanto deseja retirar: ");
  int dbt = Integer.parseInt(DBT);
  int cont = dpst - dbt;
  JOptionPane.showMessageDialog(null,"Seu Saldo é de : "+cont+"R$");
  
    }
    
}
