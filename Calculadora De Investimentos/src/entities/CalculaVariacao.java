package entities;

import java.util.ArrayList;

public class CalculaVariacao {

    public CalculaVariacao() {
    }

    public void calcularVariacao(ArrayList<Double> totalDoDia) {

        for (int i = 0; i < totalDoDia.size() - 1; i++) {
            double variacao = 0;
            double testeUm = ( totalDoDia.get(i + 1) * 100 / totalDoDia.get(i)) - 100;
            System.out.printf("A variação (em porcentagem) foi de : %.2f.\n", testeUm);
        }
    }
}

