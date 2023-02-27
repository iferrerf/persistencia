package org.iesch.ad.demo.persistencia.controlador;

import org.iesch.ad.demo.persistencia.modelos.Actor;
import org.iesch.ad.demo.persistencia.modelos.Pelicula;
import org.iesch.ad.demo.persistencia.servicios.PeliculasServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PeliculasControlador {

    @Autowired
    PeliculasServicios peliculasServicios;

    @GetMapping("peliculas")
    public List<Pelicula> obtenerTodas(){
        return peliculasServicios.buscaTodasLasPeliculas();
    }

    @GetMapping("peliculas/{id}")
    public Pelicula buscaPeliculaPorId(@PathVariable Long id){
        return peliculasServicios.buscaPeliculaPorId(id);
    }


    @PostMapping("peliculas")
    public Pelicula insertarPelicula(@RequestBody Pelicula pelicula){

        Pelicula peliculaTmp = peliculasServicios.guardaPelicula(pelicula);
        return peliculaTmp;
    }

}
