package estacionamento_java;

import java.time.LocalDateTime;

public class Vaga {

    private boolean ocupado;
    private String numero;
    private LocalDateTime incio;
    private Veiculo veiculo;

    public Vaga(String numero) {
        this.numero = numero;
        this.ocupado = false;
    }

    public void alocarVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
        this.ocupado = true;
        this.incio = LocalDateTime.now();
    }
}
