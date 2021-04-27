package core.usecase

import core.entity.TipoVaga
import core.entity.Vaga
import core.gateway.BuscaVagaLivreGateway
import core.gateway.SalvarVagaComCarroGateway
import java.time.LocalDateTime

class AlocarCarroEmVagaUseCase(
    val buscaVagaLivreGateway: BuscaVagaLivreGateway,
    val salvarVagaComCarroGateway: SalvarVagaComCarroGateway
) {

    fun execu(tipoVaga: TipoVaga, placa: String): Vaga {

        var vagaLivre = buscaVagaLivreGateway.buscaVagaLivre(tipoVaga)

        vagaLivre.ocupado = true
        vagaLivre.incio = LocalDateTime.now()
        vagaLivre.placa = placa

        salvarVagaComCarroGateway.salvar(vagaLivre)
        return vagaLivre
    }
}
