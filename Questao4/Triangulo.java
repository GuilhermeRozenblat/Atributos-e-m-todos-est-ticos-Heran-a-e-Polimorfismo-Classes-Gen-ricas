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
public class Triangulo extends FormaGeometrica {
    
    private float base;
    private float altura;
    
    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    public void CalculaArea(){
        super.setarea((base * altura)/2);
        System.out.println(super.getarea());
    }
    
}
