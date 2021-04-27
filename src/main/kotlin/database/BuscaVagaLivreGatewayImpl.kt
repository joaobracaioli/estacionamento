package database

import core.entity.TipoVaga
import core.entity.Vaga
import core.gateway.BuscaVagaLivreGateway

class BuscaVagaLivreGatewayImpl : BuscaVagaLivreGateway {
    override fun buscaVagaLivre(tipoVaga: TipoVaga): Vaga {
        return Database.estacionamento.vagas.first {
            !it.ocupado && it.tipo == tipoVaga
        }
    }
}
