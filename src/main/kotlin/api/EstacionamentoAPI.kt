package api

import api.model.EstacionamentoDTO
import api.model.VagaDTO
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus

@RequestMapping("estacionamento")
interface EstacionamentoAPI {

    @GetMapping(
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    @ResponseStatus(HttpStatus.OK)
    fun retornaEstacionamento(): EstacionamentoDTO

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun alocarCarroEstacionamento(@RequestBody vaga: VagaDTO)
}
