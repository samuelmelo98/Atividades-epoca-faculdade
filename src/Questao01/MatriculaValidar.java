/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

import atividades.pdo.view.Tela;



/**
 *
 * @author Samuel Melo
 */
public class MatriculaValidar {
   public  String n="samuel";
   public  String m="123456";
   public  String res="";
    
    public  String validar(String nome,String matricula){
        
        if(nome.equals("samuel")&&matricula.equals("123456")){
           
       return res="certo";
      
    
        
    }
       return res="Erro!";
  
  
    
}
    public static void main(String args[]){
        Tela obj = new Tela();
        obj.setVisible(true);
    }
}