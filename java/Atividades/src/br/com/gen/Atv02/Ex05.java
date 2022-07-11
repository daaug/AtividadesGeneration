package br.com.gen.Atv02;

import java.util.*;

public class Ex05 {
  public static void main(String[] args) {
    //Crie um programa que leia um número do teclado até que encontre um
    //número igual a zero. No final, mostre a soma dos números
    //digitados.(DO...WHILE)
    Scanner scanner = new Scanner(System.in);
    Random gerador = new Random(System.nanoTime());
    int numero = 0, somaNum = 0;

    do {
      //numero = scanner.nextInt();
      numero = gerador.nextInt(0, 120);
      somaNum += numero;
    }while (numero != 0);

    System.out.println("Soma Total: " + somaNum);

  }
}
