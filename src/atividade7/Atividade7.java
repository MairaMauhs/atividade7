/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade7;

import javax.swing.JOptionPane;

/**
 *
 * @author AliraMaria
 */
public class Atividade7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crie um algoritmo que leia um número inteiro 
        //e mostre como resultado o dobro de um número 
        //caso ele seja positivo e o seu triplo caso seja
        //negativo, mostre o resultado o resultado.
        
         int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o Valor do número: "));
        
        
        if(numero >= 0){
            
            numero = numero * 2;
            
            JOptionPane.showMessageDialog(null, "Se o valor do número  foi positivo,"
                    + " então ele sera Dobrado e seu valor final foi de: "+numero);
            
        }else{
            numero = numero * 3;
            
            JOptionPane.showMessageDialog(null, "Se o Valor do número foi negativo,"
                    + " então seu valor sera Triplicado"
                    + " e seu valor final será de: "+numero);

    }
    
}}
