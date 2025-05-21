package com.Contenidos.Contenido;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContenidoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContenidoApplication.class, args);
	}

}

//Servicio dedicado a la visualización de material didáctico, relacionado con el curso al que va dirigido,
// el instructor que creó ese material y los estudiantes que pueden acceder al contenido.