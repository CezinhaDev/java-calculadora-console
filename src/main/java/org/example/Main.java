package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora em console !!!");

        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char operador = scanner.next().charAt(0); // usado para pegar o primeiro caracter

        double resultado;

        switch (operador){
            case '+':
                resultado = valor1 + valor2;
                break;


            case '-':
                resultado = valor1 - valor2;
                break;

            case '*':
                resultado = valor1 * valor2;
                break;

            case '/':
                if(valor2 != 0){
                    resultado = valor1 / valor2;
                }else{
                    System.out.println("Erro: Divisão por zero!");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido!");
                return;
        }
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}