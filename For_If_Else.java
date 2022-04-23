package Exerciciojava;
import java.util.Scanner;

public class For_If_Else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float alt, menorAlt=1000, maiorAlt=0, medAlt=0, soma = 0;
        int homem=0, mulher =0;
        char sexo;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o sexo (M ou F)");
            sexo = input.next().charAt(0);
            System.out.println("Digite a sua altura:");
            alt = input.nextFloat();

            if(alt > maiorAlt)
                maiorAlt = alt;
            if(alt < menorAlt)
                menorAlt = alt;
            if(sexo == 'F'){
                mulher++;

            }
            else if (sexo == 'M'){
                homem++;
                soma = soma + alt;
                medAlt = soma / homem;

            }
        }


        System.out.println("A maior altura é: "+maiorAlt);
        System.out.println("A menor altura é: "+menorAlt);
        System.out.println("O número de registros de sexo igual a feminino é:" +mulher);
        System.out.println("A média das alturas dos homens é:" +medAlt/homem);




        }

        }


