package br.com.gen.Atv04;

public class Ex02Aviao {
  private String modelo;
  private float motor;
  private int cavalos;

  public Ex02Aviao(String modelo, float motor, int cavalos, int passageiros) {
    setCavalos(cavalos);
    setModelo(modelo);
    setMotor(motor);
    setPassageiros(passageiros);
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public float getMotor() {
    return motor;
  }

  public void setMotor(float motor) {
    this.motor = motor;
  }

  public int getCavalos() {
    return cavalos;
  }

  public void setCavalos(int cavalos) {
    this.cavalos = cavalos;
  }

  public int getPassageiros() {
    return passageiros;
  }

  public void setPassageiros(int passageiros) {
    this.passageiros = passageiros;
  }

  private int passageiros;
}
