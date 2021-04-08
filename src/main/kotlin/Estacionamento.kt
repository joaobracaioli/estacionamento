class Estacionamento {

    val vagas: ArrayList<Vaga> = ArrayList()

    companion object {
        private val TOTAL_CARRO = 10
        private val TOTAL_MOTO = 5
        private val TOTAL_CAMINHAO = 2
    }

    init {
        criaVagas("CAR_", TOTAL_CARRO)
        criaVagas("MOT_", TOTAL_MOTO)
        criaVagas("CAM_", TOTAL_CAMINHAO)
    }

    private fun criaVagas(incial: String, total: Int) {
        for (count in 1..total) {
            val nova = Vaga(numero = incial + count)
            vagas.add(nova)
        }
    }
}
