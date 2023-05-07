package org.example;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        Cena cena1 = new Cena();
        Plano plano1 = new Plano();
        Quadro quadro1 = new Quadro("imagem1");
        Quadro quadro2 = new Quadro("imagem2");

        cena1.adicionarPlano(plano1);
        plano1.adicionarQuadro(quadro1);
        plano1.adicionarQuadro(quadro2);
        filme.adicionarCena(cena1);

        filme.exibir();
    }
}