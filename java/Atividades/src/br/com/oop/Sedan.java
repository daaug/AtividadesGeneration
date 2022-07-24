package br.com.oop;

public class Sedan extends Carro{
  public String cor;
  public double motor;

  public Sedan(String portas, int pneus, String cor, double motor) {
    super(portas, pneus);
    this.cor = cor;
    this.motor = motor;
  }
}
