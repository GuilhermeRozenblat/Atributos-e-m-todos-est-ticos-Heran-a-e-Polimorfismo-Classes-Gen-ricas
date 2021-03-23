/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1_e_Questao2;

/**
 *
 * @author Guilherme
 */
public class ConversaoDeUnidadesDeArea {
    
    private static float metroQuadrado;
    private static float centimetroQuadrado;
    private static float peQuadrado;
    private static float acre;
    private static float milhaQuadrada;
    
    public static void converter(float entrada){
        
        metroQuadrado = entrada;
        peQuadrado = (float) (metroQuadrado * 10.76);
        centimetroQuadrado = peQuadrado * 929;
        acre = peQuadrado * 43560;
        milhaQuadrada = 640 * acre;
                
        System.out.println(metroQuadrado + " Metros quadrados");
        System.out.println(centimetroQuadrado + " Centímetros quadrados");
        System.out.println(peQuadrado + " Pés quadrados");
        System.out.println(acre + " Acres");
        System.out.println(milhaQuadrada + " Milhas quadradas");
    }
    
}
