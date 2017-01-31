/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lmontielr.act04;
import java.util. Scanner;
/**
 *
 * @author Carlosmontiel
 */
public class SppLmontielrAct04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa para calcular seno, coseno y tangente 
        int option;
        System.out.println("----------------------");
        System.out.println(" Calcula Trigonometrica");
        System.out.println("-----------------------");
        System.out.println(" Introducir la operacion que dese");
        System.out.println("1.- Calcular seno");
        System.out.println("2.- calcular coseno");
        System.out.println("3.- Calcular Tangente");
        Scanner entradaOperacion = new Scanner(System.in);
        option =entradaOperacion.nextInt();
        switch(option){
            case 1:
                double anguloSeno, senoCalculado;
                System.out.println("Introduce el angulo del cual desea sacar el seno");
                Scanner entradaAnguloSeno = new Scanner(System.in);
                anguloSeno = entradaAnguloSeno.nextDouble();
                senoCalculado = Math.sin(anguloSeno);
                System.out.println("El seno del angulo:"+anguloSeno+"es:"+senoCalculado);
                break;
                
              case 2 :
                double anguloCoseno, CosenoCalculado;
                System.out.println("Introduce el angulo del cual desea sacar el Coseno");
                Scanner entradaAnguloCoseno = new Scanner(System.in);
                anguloCoseno = entradaAnguloCoseno.nextDouble();
                CosenoCalculado = Math.cos(anguloCoseno);
                System.out.println("El Coceno del angulo:"+anguloCoseno+"es:"+CosenoCalculado);
                break;
                
              case 3:
                double anguloTangente, TangenteCalculado;
                System.out.println("Introduce el angulo del cual desea sacar la Tangente");
                Scanner entradaAnguloTangente = new Scanner(System.in);
                anguloTangente = entradaAnguloTangente.nextDouble();
                TangenteCalculado = Math.tan(anguloTangente);
                System.out.println("La Tangente del angulo:"+anguloTangente+"es:"+TangenteCalculado);
                break;  
                
                
               
        }

                 
    }
    
}
