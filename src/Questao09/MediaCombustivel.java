/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao09;

import Questao09.view.Tela09;

/**
 *
 * @author Samuel Melo
 */
public class MediaCombustivel {
    
    public double ConsumoMedio(double distancia,double litros){
        double medio = distancia/litros;
        return medio;
        
    }
    
    public static void main(String args []){
       /* MediaCombustivel obj = new MediaCombustivel();
              double total=  obj.ConsumoMedio(2000,200 );
              System.out.println(total);*/
        Tela09 tela = new Tela09();
        tela.setVisible(true);
        tela.setTitle("Calcular Cosumo Medio");
    }
    
}
