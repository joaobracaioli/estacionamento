import java.time.LocalDateTime

data class Vaga(
    var ocupado: Boolean = false,
    val numero: String,
    var incio: LocalDateTime? = null,
    var veiculo: Veiculo? = null
) {
    fun alocarVeiculo(veiculo: Veiculo?) {
        this.ocupado = true
        this.incio = LocalDateTime.now()
        this.veiculo = veiculo
    }
}
