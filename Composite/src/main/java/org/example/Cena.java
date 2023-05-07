package org.example;

import java.util.ArrayList;
import java.util.List;

class Cena implements ElementoDoFilme {
    private List<ElementoDoFilme> planos = new ArrayList<>();

    public void adicionarPlano(Plano plano) {
        planos.add(plano);
    }

    public void removerPlano(Plano plano) {
        planos.remove(plano);
    }

    public void exibir() {
    }
}
