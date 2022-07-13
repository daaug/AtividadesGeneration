package br.com.gen.Atv04;

public class Ex01Cliente {
  private String nome;
  private int idade;

  public Ex01Cliente(String nome, int idade) {
    setNome(nome);
    setIdade(idade);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
}
