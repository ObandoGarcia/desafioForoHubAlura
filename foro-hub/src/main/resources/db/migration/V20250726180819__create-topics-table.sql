CREATE TABLE topicos(
    id BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    mensaje VARCHAR(500) NOT NULL,
    fecha_creacion DATE NOT NULL,
    estado VARCHAR(50),
    curso VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL
);