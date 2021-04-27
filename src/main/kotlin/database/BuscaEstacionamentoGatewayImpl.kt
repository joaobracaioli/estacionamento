package database

import core.entity.Estacionamento
import core.gateway.BuscaEstacionamentoGateway

class BuscaEstacionamentoGatewayImpl : BuscaEstacionamentoGateway {
    override fun buscaPorNumero(numeroEstacionamento: Int): Estacionamento {
        return Database.estacionamento
    }
}
