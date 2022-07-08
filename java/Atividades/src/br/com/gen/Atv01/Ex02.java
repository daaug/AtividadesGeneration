package br.com.gen.Atv01;

import java.util.*;

public class Ex02 {
  public static void main(String[] args) {
    //Faça um programa que entre com três números e coloque em ordem crescente.
    Scanner scanner = new Scanner(System.in);
    int sortedNums[] = new int[3];

    System.out.println("Primeiro num: ");
    sortedNums[0] = scanner.nextInt();

    System.out.println("Segundo num: ");
    sortedNums[1] = scanner.nextInt();

    System.out.println("Terceiro num: ");
    sortedNums[2] = scanner.nextInt();

    Arrays.sort(sortedNums);

    for (int num : sortedNums) {
      System.out.print(num + " ");
    }

  }
}
