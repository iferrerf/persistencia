package org.iesch.ad.demo.persistencia.servicios;

import org.iesch.ad.demo.persistencia.modelos.Actor;
import org.iesch.ad.demo.persistencia.modelos.Pelicula;
import org.iesch.ad.demo.persistencia.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculasServicios {

    @Autowired
    PeliculaRepositorio peliculaRepositorio;

    public List<Pelicula> buscaTodasLasPeliculas(){
        return peliculaRepositorio.findAll();
    }

    public Pelicula buscaPeliculaPorId(Long id){
        return Optional.of(peliculaRepositorio.findById(id)).get().orElse(null);
    }

    public Pelicula guardaPelicula(Pelicula pelicula) {
        return peliculaRepositorio.save(pelicula);
    }
}
