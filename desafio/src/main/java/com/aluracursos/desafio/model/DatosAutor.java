package com.aluracursos.desafio.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAlias;
import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutor(
 @JsonAlias("name") String nombre,
         @JsonAlias("birth_year") String fechaDeNacimiento
 ){

}
