/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao06;

import Questao06.view.Tela06;

/**
 *
 * @author Samuel Melo
 */
public class Vendedor {
  public   String nome="";
  public double salario=0;
  public int ADICIONAL=15;
    
    
    public double Salario(double salario,double totalvendas){
        
        double total= salario+(totalvendas*ADICIONAL)/100;
        return total;
        
    }
    
    public static void main(String args[]){
        
       // Vendedor veda= new Vendedor();
       // double total =veda.Salario(1000,5000);
       // System.out.println(total);
        Tela06 tela = new Tela06();
        tela.setVisible(true);
        
    }
    
}
