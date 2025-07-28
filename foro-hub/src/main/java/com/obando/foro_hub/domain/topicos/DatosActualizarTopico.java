package com.obando.foro_hub.domain.topicos;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizarTopico(

        @NotNull
        Long id,

        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        Estado estado
) {
}
