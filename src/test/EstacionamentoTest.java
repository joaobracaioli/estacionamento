package test;

import estacionamento_java.Estacionamento;

public class EstacionamentoTest {

    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();

        System.out.println("Total Vagas:" + estacionamento.recuperaVagas().size());
    }
}
