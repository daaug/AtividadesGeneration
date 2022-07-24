package br.com.gen.Atv01;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    //Faça um programa que receba três inteiros e diga qual deles é o maior.

    Scanner scanner = new Scanner(System.in);
    int num01, num02, num03;
    int maior = 0;

    System.out.println("Insira nome completo");
    String nome = scanner.nextLine();
    System.out.println(nome);

    System.out.println("Primeiro num: ");
    num01 = scanner.nextInt();
    maior = num01 >= maior ? num01 : maior;

    System.out.println("Segundo num: ");
    num02 = scanner.nextInt();
    maior = num02 >= maior ? num02 : maior;

    System.out.println("Terceiro num: ");
    num03 = scanner.nextInt();
    maior = num03 >= maior ? num03 : maior;

    System.out.println("Maior numero: " + maior);
  }
}
