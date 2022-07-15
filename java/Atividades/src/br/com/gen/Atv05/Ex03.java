package br.com.gen.Atv05;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        ArrayList<Ex03Estoque> lista = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        String nome;
        int contador, qtd = 0;
        double preco = 0;

        do {
            System.out.println("\n1 - Inserir Produto | 2 - Remover Produto | 3 - Atualizar Produto | 4 - Listar todos produtos");
            contador = entrada.nextInt();

            switch (contador){
                case 1:
                    System.out.println("Insira nome produto: ");
                    nome = entrada.next();
                    System.out.println("Insira qtd produto: ");
                    qtd = entrada.nextInt();
                    System.out.println("Insira preco produto: ");
                    preco = entrada.nextDouble();
                    lista.add(new Ex03Estoque(nome, qtd, preco));

                    contador = 0;
                    break;

                case 2:
                    System.out.println("\nInsira nome produto: ");
                    nome = entrada.next();
                    int i = 0;
                    for (Ex03Estoque item: lista) {
                        if (item.getNomeProduto().equals(nome)){
                            lista.remove(i);
                            break;
                        }
                        i++;
                    }
                    contador = 0;
                    break;

                case 3:
                    System.out.println("Insira nome produto: ");
                    nome = entrada.next();

                    for (Ex03Estoque item: lista) {
                        if (item.getNomeProduto().equals(nome)){
                            System.out.println("Insira nova qtd produto: ");
                            qtd = entrada.nextInt();
                            System.out.println("Insira novo preco produto: ");
                            preco = entrada.nextDouble();

                            item.setQtdEstoque(qtd);
                            item.setPreco(preco);
                            break;
                        }
                    }

                    contador = 0;
                    break;

                case 4:
                    System.out.println("\nListando produtos: ");
                    for (Ex03Estoque item: lista) {
                        System.out.println("Produto: " + item.getNomeProduto() + " Qtd: " + item.getQtdEstoque() + " R$" + item.getPreco());
                    }
                    contador = 0;
                    break;
                default:
                    contador = 9;
                    break;
            }
        }while (contador != 9);
    }
}
