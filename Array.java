//Desenvolva um algoritmo que permita ao usuário informar 10 números inteiros,
// onde esses números serão armazenados em uma lista.
// Em seguida preciso que seja exibido em tela as seguintes informações:





package Exerciciojava;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numpares = 0, maiorV = 0, menorV = 0, soma = 0;

        int[] num = new int[10];

        for (int i = 0; i < num.length; i++){
            System.out.println("Informe um número, por gentileza: ");
            num[i] = input.nextInt();

            if(i == 0){
                maiorV = num[i];
                menorV = num[i];
            }
            if (num[i] % 2 == 0){
                numpares += num[i];

                soma += num[i];
            }
           if (num[i] < menorV){
               menorV = num[i];
           }
           else if (num[i] > maiorV){
               maiorV = num[i];
           }
        }
        System.out.println("Soma dos números inteiros informados: " +soma);
        System.out.println("Soma dos números pares informados:" +numpares);
        System.out.println("Maior valor inteiro informado:" +maiorV);
        System.out.println("Menor valor inteiro informado:" + menorV);



    }
}
