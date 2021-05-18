package configuration

import core.gateway.BuscaEstacionamentoGateway
import core.gateway.BuscaVagaLivreGateway
import core.gateway.SalvarVagaComCarroGateway
import core.usecase.AlocarCarroEmVagaUseCase
import core.usecase.RetornaEstacionamentoUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration(proxyBeanMethods = false)
class UseCaseConfiguration {

    @Bean
    fun retornaEstacionmentoUseCase(buscaEstacionamentoGateway: BuscaEstacionamentoGateway):
        RetornaEstacionamentoUseCase = RetornaEstacionamentoUseCase(buscaEstacionamentoGateway)

    @Bean
    fun alocarCarroEmVagaUseCase(
        buscaVagaLivreGateway: BuscaVagaLivreGateway,
        salvarVagaComCarroGateway: SalvarVagaComCarroGateway
    ): AlocarCarroEmVagaUseCase = AlocarCarroEmVagaUseCase(buscaVagaLivreGateway, salvarVagaComCarroGateway)
}
