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
public class Pessoa {
    private String nome;
    private int idade;
    Pessoa mae;
    Pessoa pai;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void addmae(String nome, int idade){
        mae = new Pessoa(nome,idade);
                
    }
    public void addpai(String nome, int idade){
        pai = new Pessoa(nome,idade);
                
    }
    
    public void imprimirArvore(){
        System.out.println("Pessoa: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("--Mãe-- ");
        System.out.println("Nome da mãe: " + mae.nome);
        System.out.println("Idade da mãe: " + mae.idade);
        System.out.println("--Pai-- ");
        System.out.println("Nome de pai: " + pai.nome);
        System.out.println("Idade do pai: " + pai.idade);
    }
}

