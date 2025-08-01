package com.obando.foro_hub.domain.topicos;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(

        @NotBlank
        String titulo,

        @NotBlank
        String mensaje,

        @NotBlank
        String curso,

        @NotBlank
        String autor
) {
}
