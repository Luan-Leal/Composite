package org.example;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FilmeTest {

    @Test
    void deveExibirFilmeComCenasPlanosEQuadros() {
        String imagem1 = "imagem1";
        String imagem2 = "imagem2";

        Filme filme = new Filme();
        Cena cena1 = new Cena();
        Plano plano1 = new Plano();
        Quadro quadro1 = new Quadro(imagem1);
        Quadro quadro2 = new Quadro(imagem2);

        cena1.adicionarPlano(plano1);
        plano1.adicionarQuadro(quadro1);
        plano1.adicionarQuadro(quadro2);
        filme.adicionarCena(cena1);

        List<String> quadrosEsperados = new ArrayList<>();
        quadrosEsperados.add(imagem1);
        quadrosEsperados.add(imagem2);

        List<ElementoDoFilme> planosEsperados = new ArrayList<>();
        planosEsperados.add(plano1);

        List<ElementoDoFilme> cenasEsperadas = new ArrayList<>();
        cenasEsperadas.add(cena1);

        List<ElementoDoFilme> filmesEsperados = new ArrayList<>();
        filmesEsperados.add(filme);

        List<String> quadrosExibidos = new ArrayList<>();
        List<ElementoDoFilme> planosExibidos = new ArrayList<>();
        List<ElementoDoFilme> cenasExibidas = new ArrayList<>();
        List<ElementoDoFilme> filmesExibidos = new ArrayList<>();

        filme.exibir();

        for (ElementoDoFilme cena : cenasEsperadas) {
            for (ElementoDoFilme plano : planosEsperados) {
                for (String quadro : quadrosEsperados) {
                    quadrosExibidos.add(quadro.toString());
                }
                planosExibidos.add(plano);
            }
            cenasExibidas.add(cena);
        }

        filmesExibidos.add(filme);

        assertEquals(quadrosEsperados, quadrosExibidos);
        assertEquals(planosEsperados, planosExibidos);
        assertEquals(cenasEsperadas, cenasExibidas);
        assertEquals(filmesEsperados, filmesExibidos);
    }
}
