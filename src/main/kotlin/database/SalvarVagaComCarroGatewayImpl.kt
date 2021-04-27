package database

import core.entity.Vaga
import core.gateway.SalvarVagaComCarroGateway

class SalvarVagaComCarroGatewayImpl : SalvarVagaComCarroGateway {
    override fun salvar(vaga: Vaga) {
        val indexVaga = Database.estacionamento.vagas.filter { it.numero.equals(vaga.numero) }.first().let {
            Database.estacionamento.vagas.indexOf(it)
        }
        Database.estacionamento.vagas.get(indexVaga) to vaga
    }
}
