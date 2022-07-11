package br.com.gen.Atv02;

import java.util.*;

public class Ex02 {
  public static void main(String[] args) {
    //Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
    Scanner scanner = new Scanner(System.in);
    int num = 0;

    for (int i = 0; i < 10; i++) {
      num = scanner.nextInt();
      if (num % 2 == 0){
        System.out.println("é par");
      }else{
        System.out.println("é impar");
      }
    }
  }
}
