/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg6;

import java.util.Scanner;

/**
 *
 * @author Aluno20
 */
public class AULA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ativar a entrada de dados pelo usuário// 
        Scanner sc = new Scanner(System.in); 
        
        //Solicitar ao usuário//
        System.out.print("Digite o email: ");
        //Dados são gravados na variaveis//
        USUARIO.email = sc.nextLine(); 
        
        //Solicitar ao usuário//
        System.out.print("Digite a senha: ");
        //Dados são gravados na variaveis//
        USUARIO.senha =sc.nextLine();
        
        //Exibe os dados coletatos//
        System.out.println("O email é: " + USUARIO.email);
        System.out.println("O senha é: " + USUARIO.senha);
    }
    
}
