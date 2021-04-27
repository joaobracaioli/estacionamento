package core.usecase

import core.entity.Vaga
import core.gateway.SalvarVagaComCarroGateway

class SalvarVagaComCarroUseCase(var salvarVagaComCarroGateway: SalvarVagaComCarroGateway) {

    fun executar(vaga: Vaga) {
        salvarVagaComCarroGateway.salvar(vaga)
    }
 }
