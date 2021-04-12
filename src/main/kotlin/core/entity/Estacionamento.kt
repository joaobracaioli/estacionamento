package core.entity

class Estacionamento {

    val vagas: ArrayList<Vaga> = ArrayList()

    init {
        criaVagas(TipoVaga.CARRO)
        criaVagas(TipoVaga.MOTO)
        criaVagas(TipoVaga.CAMINHAO)
    }

    private fun criaVagas(tipo: TipoVaga) {
        for (count in 1..tipo.qtd) {
            val nova = Vaga(numero = tipo.name + count, tipo = tipo)
            vagas.add(nova)
        }
    }
}
