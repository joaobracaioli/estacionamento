package api.translators

import api.model.VagaDTO
import core.entity.Vaga

class VagaParaVagaDTOTradutor {

    companion object {
        fun translator(vaga: Vaga): VagaDTO {
            return VagaDTO(
                nome = vaga.numero,
                placa = vaga.placa,
                tipoVaga = vaga.tipo.name
            )
        }

        fun translator(vagas: List<Vaga>): List<VagaDTO> {
            return vagas.map {
                translator(it)
            }
        }
    }
}
