package br.com.gen.Atv01;

import java.util.*;

public class Ex04 {
  public static void main(String[] args) {
    //Faça um programa em que permita a entrada de um número qualquer e exiba se este
    //número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    //ímpar exiba o número elevado ao quadrado.

    Scanner scanner = new Scanner(System.in);
    float num = 0.f;

    System.out.print("Insira numero: ");
    num = scanner.nextFloat();

    if(num % 2 == 0){
      System.out.println("Par: " + Math.sqrt(num));
    }else{
      System.out.println("Impar: " + Math.pow(num, 2));
    }

  }
}
