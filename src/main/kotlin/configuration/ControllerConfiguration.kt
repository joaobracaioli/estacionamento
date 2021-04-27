package configuration

import api.EstacionamentoAPI
import api.controller.EstacionamentoAPIController
import core.usecase.AlocarCarroEmVagaUseCase
import core.usecase.RetornaEstacionamentoUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ControllerConfiguration {

    @Bean
    fun retornaEstacionmentoController(
        retornaEstacionamentoUseCase: RetornaEstacionamentoUseCase,
        alocarCarroEmVagaUseCase: AlocarCarroEmVagaUseCase
    ):
        EstacionamentoAPI = EstacionamentoAPIController(retornaEstacionamentoUseCase, alocarCarroEmVagaUseCase)
}
