package br.com.gen.Atv01;

import java.util.*;

public class Ex02 {
  public static void main(String[] args) {
    //Faça um programa que entre com três números e coloque em ordem crescente.
    Scanner scanner = new Scanner(System.in);
    int num1, num2, num3;

    System.out.print("Primeiro num: ");
    num1 = scanner.nextInt();
    System.out.print("Segundo num: ");
    num2 = scanner.nextInt();
    System.out.print("Terceiro num: ");
    num3 = scanner.nextInt();

    if (num1 <= num2 && num2 <= num3){
      System.out.println(num1 + " " + num2 + " " + num3);
    } else if (num1 <= num3 && num3 <= num2){
      System.out.println(num1 + " " + num3 + " " + num2);
    }

    if (num2 <= num1 && num1 <= num3){
      System.out.println(num2 + " " + num1 + " " + num3);
    } else if (num2 <= num3 && num3 <= num1){
      System.out.println(num2 + " " + num3 + " " + num1);
    }

    if (num3 <= num1 && num1 <= num2){
      System.out.println(num3 + " " + num1 + " " + num2);
    } else if (num3 <= num2 && num2 <= num1){
      System.out.println(num3 + " " + num2 + " " + num1);
    }

  }
}
