package br.com.gen.Atv03;

public class Ex03 {
  public static void main(String[] args) {
    //Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
    //a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
    //das matrizes N1 e N2;
    //b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
    //posição das matrizes N1 e N2.

    int n1[][] = {{1,2,3,4,5,6}, {1,2,3,4,5,6}, {1,2,3,4,5,6}, {1,2,3,4,5,6}};
    int n2[][] = {{6,5,4,3,2,1}, {6,5,4,3,2,1}, {6,5,4,3,2,1}, {6,5,4,3,2,1}};
    int m1[][] = new int[4][6];
    int m2[][] = new int[4][6];

    for (int l = 0; l < n1.length; l++) {
      for (int c = 0; c < n1[0].length; c++) {
        m1[l][c] = n1[l][c] + n2[l][c];
        m2[l][c] = n1[l][c] - n2[l][c];
      }
      System.out.println("\nSoma:");
      for (int c = 0; c < n1[0].length; c++) {
        System.out.print(m1[l][c] + " | ");
      }
      System.out.println("\nDiferenca:");
      for (int c = 0; c < n1[0].length; c++) {
        System.out.print(m2[l][c] + " | ");
      }
    }

  }
}
