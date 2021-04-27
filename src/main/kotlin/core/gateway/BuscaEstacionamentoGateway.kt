package core.gateway

import core.entity.Estacionamento

interface BuscaEstacionamentoGateway {

    fun buscaPorNumero(numeroEstacionamento: Int): Estacionamento
}
