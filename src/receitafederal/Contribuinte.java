/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package receitafederal;

import java.io.*;

/**
 *
 * @author alunos
 */
public class Contribuinte {

    private String nome;
    private String cpf;
    private String endereco;
    private double salario;
    private double irpf;
    private static double faixa1 = 1058;
    private static double faixa2 = 2115;
            
    public Contribuinte(String nome, String cpf, String endereco, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
        irpf = 0;
    }

    //Métodos de Acesso
    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSalario() {
        return salario;
    }

    public double getIrpf() {
        return irpf;
    }

    public void calcularIrpf() {
//        if (salario <= 900) {
//            irpf = 0;
//        } else if (salario <= 1800) {
//            irpf = salario * 10 / 100;
//        } else {
//            irpf = salario * 15 / 100;
//
//        }
        if (salario <= faixa1) {
            irpf = 0;
        } else if (salario > faixa1 && salario <= faixa2) {
            irpf = salario * 15 / 100;
        } else {
            irpf = salario * 27.5 / 100;

        }
    }

    public double getSalarioLiquido() {
        return getSalario() - getIrpf();
    }

    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Salário: " + getSalario());
        System.out.println("IRPF: " + getIrpf());
        System.out.println("Salário Líquido:" + getSalarioLiquido());
    }

}
