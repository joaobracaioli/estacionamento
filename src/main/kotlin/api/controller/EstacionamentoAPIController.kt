package api.controller

import api.EstacionamentoAPI
import api.model.EstacionamentoDTO
import api.model.VagaDTO
import api.translators.EstacionamentoParaEstacionamentoDTOTradutor
import core.entity.TipoVaga
import core.usecase.AlocarCarroEmVagaUseCase
import core.usecase.RetornaEstacionamentoUseCase
import org.springframework.web.bind.annotation.RestController

@RestController
class EstacionamentoAPIController(
    val retornaEstacionamentoUseCase: RetornaEstacionamentoUseCase,
    val alocarCarroEmVagaUseCase: AlocarCarroEmVagaUseCase
) : EstacionamentoAPI {
    override fun retornaEstacionamento(): EstacionamentoDTO {
        return EstacionamentoParaEstacionamentoDTOTradutor
            .translator(retornaEstacionamentoUseCase.execute(1))
    }

    override fun alocarCarroEstacionamento(vaga: VagaDTO) {
        alocarCarroEmVagaUseCase.execu(TipoVaga.valueOf(vaga.tipoVaga), vaga.placa)
    }
}
