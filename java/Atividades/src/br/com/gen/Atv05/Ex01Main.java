package br.com.gen.Atv05;

public class Ex01Main {
    public static void main(String[] args) {

        Ex01Cachorro dog = new Ex01Cachorro("daniel", 5);
        Ex01Cavalo peDePano = new Ex01Cavalo("severino", 12);
        Ex01Preguica patolino = new Ex01Preguica("Patolino", 8);

        dog.emitirSom();
        peDePano.emitirSom();
        patolino.emitirSom();
        patolino.subirArvore();

    }
}
