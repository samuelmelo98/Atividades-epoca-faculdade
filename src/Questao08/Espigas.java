/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao08;

import Questao08.view.Tela08;

/**
 *
 * @author Samuel Melo
 */
public class Espigas {
    
    public int EspigaProfessora(int espigas,int aluno){
        int professora = espigas%aluno;
        return professora;
        
    }
    
     public int EspigaAluno(int espigas,int aluno){
        int alunos = espigas/aluno;
        return alunos;
        
    }
    
    public static void main(String arsg[]){
      Tela08 tela = new Tela08();
      tela.setVisible(true);
      tela.setTitle("Dividir Espigas");
      
    }
    
}
