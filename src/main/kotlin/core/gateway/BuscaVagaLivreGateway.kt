package core.gateway

import core.entity.TipoVaga
import core.entity.Vaga

interface BuscaVagaLivreGateway {

    fun buscaVagaLivre(tipoVaga: TipoVaga): Vaga
}