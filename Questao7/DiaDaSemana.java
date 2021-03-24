/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao7;

/**
 *
 * @author Guilherme
 */
public class DiaDaSemana {

    
    enum Dias{
        DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
        
    }
    
    public boolean ehDiaUtil(Dias dia){
        if (dia == Dias.DOMINGO || dia == Dias.SABADO){
            System.out.println("a");
            return false;
        }
        else{
            System.out.println("b");
            return true;
        }
            
    }
}
