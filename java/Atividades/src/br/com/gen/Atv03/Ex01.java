package br.com.gen.Atv03;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    //Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
    //atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
    Scanner scanner = new Scanner(System.in);
    double ponto[] = new double[5];
    double maiorPonto = 0;

    for (int i = 0; i < 5; i++) {
      System.out.print("Insira ponto: ");
      ponto[i] = scanner.nextDouble();
      System.out.println("Ponto: " + ponto[i]);

      if(ponto[i] >= maiorPonto){
        maiorPonto = ponto[i];
      }
    }

    System.out.println("Maior ponto: " + maiorPonto);
  }
}
