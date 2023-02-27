package org.iesch.ad.demo.persistencia.servicios;

import org.iesch.ad.demo.persistencia.modelos.Actor;
import org.iesch.ad.demo.persistencia.modelos.Pelicula;
import org.iesch.ad.demo.persistencia.repositorio.ActorRepositorio;
import org.iesch.ad.demo.persistencia.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActoresServicios {
    @Autowired
    ActorRepositorio actorRepositorio;

    public List<Actor> buscaTodasLosActores(){

        return actorRepositorio.findAll();
    }

    public Actor buscaPorId(String dni){
        Optional<Actor> actorOptional = actorRepositorio.findById(dni);
        return actorOptional.orElse(null);
    }
    public Actor guardaActor(Actor actor) {
        return actorRepositorio.save(actor);
    }


}
