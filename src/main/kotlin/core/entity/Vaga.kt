package core.entity

import java.time.LocalDateTime

data class Vaga(
    var ocupado: Boolean = false,
    val numero: String,
    var incio: LocalDateTime? = null,
    val tipo: TipoVaga,
    var placa: String? = null
)
