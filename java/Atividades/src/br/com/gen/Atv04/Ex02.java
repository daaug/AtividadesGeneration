package br.com.gen.Atv04;

public class Ex02 {
  public static void main(String[] args) {

    Ex02Aviao aviao01 = new Ex02Aviao("Boeing 22", 200.6f, 150, 35);

    System.out.println(aviao01.getCavalos());
    System.out.println(aviao01.getModelo());
    System.out.println(aviao01.getMotor());
    System.out.println(aviao01.getPassageiros());

  }
}
