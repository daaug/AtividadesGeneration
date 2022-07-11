package br.com.gen.Atv02;

import java.util.*;

public class Ex03 {
  public static void main(String[] args) {
    // Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
    //21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
    //idade for =-99. (WHILE)
    Scanner scanner = new Scanner(System.in);
    int idade = 0;
    int idadeMaior50 = 0;
    int idadeMenor21 = 0;

    while(idade != -99){
      System.out.print("Insira uma idade: ");
      idade = scanner.nextInt();

      if (idade == -99){
        break;
      }
      if (idade < 21){
        idadeMenor21++;
      }else if(idade > 50){
        idadeMaior50++;
      }

      System.out.println("Pessoas menor de 21: " + idadeMenor21);
      System.out.println("Pessoas maior de 50: " + idadeMaior50);
    }

  }
}
