package api.translators

import api.model.EstacionamentoDTO
import core.entity.Estacionamento

class EstacionamentoParaEstacionamentoDTOTradutor {
    companion object {
        fun translator(estacionamento: Estacionamento): EstacionamentoDTO {
            return EstacionamentoDTO(
                vagas = VagaParaVagaDTOTradutor.translator(estacionamento.vagas)
            )
        }
    }
}