/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao02;

import Questao02.view.Tela02;


/**
 *
 * @author Samuel Melo
 */
public class Calculo02 {
    
 
   public String res="";
    
    
    public String Calcular(double a,int b) {
        
        switch(b){
            case 0:
                  res=Double.toString(a-(a*10)/100);
       
                break;
                
             case 1:
                 res=Double.toString(a- (a*20)/100);
                break;
                 
             case 2:
                 res=Double.toString( a-(a*30)/100);
                break;
                 
            case 3:
                 res=Double.toString(a- (a*40)/100);
                break;
            
        }
        
      return res;
        
    }
    
    public static void main(String args[]){
        Tela02 obj = new Tela02();
        obj.setVisible(true);
    }
    
}
