package com.Contenidos.Contenido.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Contenidos.Contenido.Model.cModel;

/**
 * Repositorio para acceder a los datos de la entidad {ContenidoModel}.
 * 
 * Extiende {JpaRepository}, lo que proporciona operaciones CRUD básicas
 * como guardar, buscar por ID, eliminar, etc.
 * 
 * Además, define métodos personalizados para buscar contenidos por título
 * o por el ID del instructor asociado.
 */

@Repository
public interface cRepository extends JpaRepository<cModel, Integer> {
    
    /*Metodo implementado para buscar a traves de el titulo de el Contenido*/

    public cModel findByTitulo(String Titulo);

    /*Metodo implementado para buscar a traves de el id de el Instructor */
    
    public cModel findByIdInstructor(Integer idInstructor);
}
