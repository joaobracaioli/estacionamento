package core.usecase

import core.entity.Vaga
import java.time.LocalDateTime

class AlocarCarroEmVagaUseCase {

    fun execu(vaga: Vaga, placa: String) : Vaga {
        vaga.ocupado = true
        vaga.incio = LocalDateTime.now()
        vaga.placa = placa
        return vaga
    }
}