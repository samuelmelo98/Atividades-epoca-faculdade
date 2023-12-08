/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao07;

import Questao07.view.Tela07;

/**
 *
 * @author Samuel Melo
 */
public class Juros {
    
    public double ValorJuros(double deposito){
        double total = deposito+(deposito*.70)/100;
        return total;
        
    }
    
    public static void main(String args[]){
        
        Tela07 tela = new Tela07();
        tela.setVisible(true);
        tela.setTitle("Calculo juros após 30 dias");
    }
    
}
