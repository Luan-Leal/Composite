package org.example;

import java.util.ArrayList;
import java.util.List;

class Filme implements ElementoDoFilme {
    private List<ElementoDoFilme> cenas = new ArrayList<>();

    public void adicionarCena(Cena cena) {
        cenas.add(cena);
    }

    public void removerCena(Cena cena) {
        cenas.remove(cena);
    }

    public void exibir() {
    }
}