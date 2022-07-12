package br.com.gen.Atv03;

import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    // Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
    //em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
    //diagonal, ou seja, diagonal principal.

    Scanner scanner = new Scanner(System.in);
    int matriz[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
    int soma = 0;

    for (int i = 0; i < matriz.length; i++) {
      soma += matriz[i][i];
    }

    System.out.println("Soma: " + soma);

  }
}
