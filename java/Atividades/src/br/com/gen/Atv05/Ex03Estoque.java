package br.com.gen.Atv05;

public class Ex03Estoque {
    private String nomeProduto;
    private int qtdEstoque;
    private double preco;

    public Ex03Estoque(String nomeProduto, int qtdEstoque, double preco) {
        this.nomeProduto = nomeProduto;
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

}
