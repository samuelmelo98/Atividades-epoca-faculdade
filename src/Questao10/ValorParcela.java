/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao10;

import Questao10.view.Tela10;

/**
 *
 * @author Samuel Melo
 */
public class ValorParcela {
    
    public double Parcelas(double compra){
        
        double total =compra/5;
        return total;
        
    }
    
    public static void main(String args[]){
       /* ValorParcela obj = new ValorParcela();
        
       double total =  obj.Parcelas(1550);
        System.out.println(total);*/
        Tela10 tela = new Tela10();
        tela.setVisible(true);
        tela.setTitle("Calcular total de compras em cinco");
        
    }
    
}
