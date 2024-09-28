/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package receitafederal;

import java.util.Scanner;

/**
 *
 * @author alunos
 */
public class ReceitaFederal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = entrada.next();

        System.out.print("Digite seu CPF: ");
        String cpf = entrada.next();

        System.out.print("Digite seu Endereco: ");
        String endereco = entrada.next();

        System.out.print("Digite seu Salario: ");
        double salario = entrada.nextDouble();

        Contribuinte cl;
        //cl = new Contribuinte("Samara", "12345678901", "Rua Flor", 3000);
        
        cl = new Contribuinte(nome, cpf, endereco, salario);

        cl.calcularIrpf();
        cl.imprimir();
        
        
        //System.out.println("Nome: " + cl.getNome());
        //System.out.println("CPF: " + cl.getCpf());
        //System.out.println("Endereço: " + cl.getEndereco());
        //System.out.println("Salário: " + cl.getSalario());
        //System.out.println("IRPF: " + cl.getIrpf());

    }

}
