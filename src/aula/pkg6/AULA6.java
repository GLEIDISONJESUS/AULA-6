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
        
        //Criação de variais, u1, u2, u3//
        USUARIO u1 = new USUARIO();
        USUARIO u2 = new USUARIO();
        USUARIO u3 = new USUARIO();
        
        //Solicitar ao usuário//
        System.out.print("Digite o email: ");
        //Dados são gravados na variaveis//
        u1.email = sc.nextLine(); 
        
        //Solicitar ao usuário//
        System.out.print("Digite a senha: ");
        //Dados são gravados na variaveis//
        u1.senha =sc.nextLine();
        
        //Solicitar ao usuário//
        System.out.print("Digite seu nome: ");
        //Dados são gravados na variaveis//
        u1.nome =sc.nextLine();
        System.out.println("");
        
       
        
        //----------------------------------------//
             //Solicitar ao usuário//
        System.out.print("Digite o email: ");
        //Dados são gravados na variaveis//
        u2.email = sc.nextLine(); 
        
        //Solicitar ao usuário//
        System.out.print("Digite a senha: ");
        //Dados são gravados na variaveis//
        u2.senha =sc.nextLine();
        
        //Solicitar ao usuário//
        System.out.print("Digite seu nome: ");
        //Dados são gravados na variaveis//
        u2.nome =sc.nextLine();
        System.out.println("");
        
        
    //----------------------------------------//
             //Solicitar ao usuário//
        System.out.print("Digite o email: ");
        //Dados são gravados na variaveis//
        u3.email = sc.nextLine(); 
        
        //Solicitar ao usuário//
        System.out.print("Digite a senha: ");
        //Dados são gravados na variaveis//
        u3.senha =sc.nextLine();
        
        //Solicitar ao usuário//
        System.out.print("Digite seu nome: ");
        //Dados são gravados na variaveis//
        u3.nome =sc.nextLine();
        System.out.println("------------------------");
        
        //-----------------------------//
        
         //Exibe os dados coletatos//
        System.out.println("O email é: " + u1.email);
        System.out.println("O senha é: " + u1.senha);
        System.out.println("O nome é " + u1.nome);
        System.out.println("");
        
        //Exibe os dados coletatos//
        System.out.println("O email é: " + u2.email);
        System.out.println("O senha é: " + u2.senha);
        System.out.println("O nome é " + u2.nome);
        System.out.println("");
        
        //Exibe os dados coletatos//
        System.out.println("O email é: " + u3.email);
        System.out.println("O senha é: " + u3.senha);
        System.out.println("O nome é " + u3.nome);
        
    }
    
}
