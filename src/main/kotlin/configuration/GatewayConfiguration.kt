package configuration

import core.gateway.BuscaEstacionamentoGateway
import core.gateway.BuscaVagaLivreGateway
import core.gateway.SalvarVagaComCarroGateway
import database.BuscaEstacionamentoGatewayImpl
import database.BuscaVagaLivreGatewayImpl
import database.SalvarVagaComCarroGatewayImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GatewayConfiguration {

    @Bean
    fun buscaEstacionamento(): BuscaEstacionamentoGateway = BuscaEstacionamentoGatewayImpl()

    @Bean
    fun buscaVagaLivre(): BuscaVagaLivreGateway = BuscaVagaLivreGatewayImpl()

    @Bean
    fun salvarVagaComCarro(): SalvarVagaComCarroGateway = SalvarVagaComCarroGatewayImpl()
}
