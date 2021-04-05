package estacionamento_java;

import java.util.Collection;
import java.util.HashSet;

public class Estacionamento {


    private static final int TOTAL_CARRO = 10;
    private static final int TOTAL_MOTO = 5;
    private static final int TOTAL_CAMINHAO = 2;
    private Collection<Vaga> vagas;

    public Estacionamento() {
        vagas = new HashSet<>();
        criaVagas("CAR_", TOTAL_CARRO);
        criaVagas("MOT_", TOTAL_MOTO);
        criaVagas("CAM_", TOTAL_CAMINHAO);
    }

    private void criaVagas(String incial, int total) {
        for (int count = 1; count <= total; count++) {
            Vaga nova = new Vaga(incial+count);
            vagas.add(nova);
        }
    }


    public Collection<Vaga> recuperaVagas() {
        return this.vagas;
    }


}
