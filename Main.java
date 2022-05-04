// Escrever uma programa em que leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados
import java.util.Scanner;


public class Main {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int a, b, c;

    System.out.println("Digite o valor de A:");
    a = input.nextInt();
    
    System.out.println("Digite o valor de B:");
    b = input.nextInt();

    c=a;
      a=b;
        b=c;
    System.out.println("O valor de A é:"+a);
    System.out.println("O valor de B é:"+b);
  }
}