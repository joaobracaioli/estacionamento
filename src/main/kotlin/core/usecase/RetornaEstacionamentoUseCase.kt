package core.usecase

import core.entity.Estacionamento
import core.gateway.BuscaEstacionamentoGateway

class RetornaEstacionamentoUseCase(val buscaEcionamento: BuscaEstacionamentoGateway) {

    fun execute(numeroEstacionamento: Int): Estacionamento {
        return buscaEcionamento.buscaPorNumero(numeroEstacionamento)
    }
}
