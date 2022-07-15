package br.com.gen.Atv05;

public class Ex01Animal {
    private String nome;
    private int idade;

    public Ex01Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

    public void emitirSom(){
        System.out.println("Óia o bixo barulhento");
    }
}
