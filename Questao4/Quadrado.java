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
public class Quadrado extends FormaGeometrica {

    private float lado;
    
    public Quadrado(float lado){
        this.lado = lado;
        
    }

    public float getLado1() {
        return lado;
    }

    public void setLado1(float lado) {
        this.lado = lado;
    }

    public float getLado2() {
        return lado;
    }

    public void setLado2(float lado) {
        this.lado = lado;
    }
    
    public void CalculaArea(){
        super.setarea(lado * lado);
        System.out.println(super.getarea());
    }
}
