package org.example;

import java.util.ArrayList;
import java.util.List;

class Plano implements ElementoDoFilme {
    private List<ElementoDoFilme> quadros = new ArrayList<>();

    public void adicionarQuadro(Quadro quadro) {
        quadros.add(quadro);
    }

    public void removerQuadro(Quadro quadro) {
        quadros.remove(quadro);
    }

    public void exibir() {
    }
}