/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3;

/**
 *
 * @author Guilherme
 */
public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa("Guilherme",21);
        p1.addmae("Maria", 60);
        p1.addpai("Joao", 60);
        p1.imprimirArvore();
    }
}

