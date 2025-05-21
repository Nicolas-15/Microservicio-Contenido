package com.Contenidos.Contenido.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Contenidos.Contenido.Model.cModel;
import com.Contenidos.Contenido.Repository.cRepository;

import jakarta.transaction.Transactional;
@Transactional
@Service

/**
 * Servicio encargado de manejar la lógica de negocio relacionada
 * con los contenidos del sistema.
 * 
 * Este servicio permite:
 * - Obtener todos los contenidos.
 * - Buscar contenidos por ID, título o ID de instructor.
 * - Guardar (crear o actualizar) contenidos.
 * - Eliminar contenidos.
 * 
 * Se comunica con {@link cRepository} para acceder a la base de datos.
 */

public class cService {

    @Autowired
    private cRepository contenidoRepository;

    /*Metodo: GET
      Ruta: ("/")
      Descripcion: Retorna el modelo de todo el Contenido guardado*/

    public List<cModel> getContenidos(){
        return contenidoRepository.findAll();
    }

    /*Metodo: GET
      Ruta: ("/{idContenido}")
      Descripcion: Obtiene todo el Contenido de el modelo segun la id de el contenido*/

    public cModel getContenido(Integer idContenido){
        return contenidoRepository.findById(idContenido).get();
    }

    /*Metodo: GET
      Ruta: ("/{idContenido}")
      Descripcion: Obtiene todo el Contenido de el modelo segun el titulo de el contenido*/

    public cModel getContenidoTitulo(String titulo){
        return contenidoRepository.findByTitulo(titulo);
    }

    /*Metodo: GET
      Ruta: ("/{idContenido}")
      Descripcion: Obtiene todo el Contenido de el modelo segun el id de el instructor*/

    public cModel getContenidoIdIntructor(Integer idInstructor){
        return contenidoRepository.findByIdInstructor(idInstructor);
    }

    /*Metodo: PUT
      Ruta: ("/{idContenido}")
      Descripcion: Actualiza el Contenido a traves de la id*/

    public cModel saveContenido(cModel contenido){
        return contenidoRepository.save(contenido);
    }

    /*Metodo: DELETE
      Ruta: ("/{idContenido}")
      Descripcion: Elimina todo el contenido a traves de la id
      Respuesta esperada: {}*/ 
      
    public void deleteContenido(Integer idContenido){
        contenidoRepository.deleteById(idContenido);
    }
}
