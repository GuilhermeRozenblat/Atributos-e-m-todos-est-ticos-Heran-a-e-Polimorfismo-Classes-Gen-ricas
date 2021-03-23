/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4;

/**
 *
 * @author Guilherme
 */

public class Circulo extends FormaGeometrica {
    private float raio;
    private double pi = 3.14;
    
    public Circulo(float raio){
        this.raio = raio;
    }

    Circulo(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void CalculaArea(){
        super.setarea((float) (pi * (raio*raio)));
        System.out.println(super.getarea());
    }
        
}
