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
public class Main {
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(2,3);
        retangulo.CalculaArea();
        
        Quadrado quadrado = new Quadrado(2);
        quadrado.CalculaArea();
        
        Triangulo triangulo = new Triangulo(3,5);
        triangulo.CalculaArea();
        
        Circulo circulo = new Circulo(3);
        circulo.CalculaArea();
    }
    
}
