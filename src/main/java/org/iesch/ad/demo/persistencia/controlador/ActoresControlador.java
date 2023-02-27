package org.iesch.ad.demo.persistencia.controlador;

import org.iesch.ad.demo.persistencia.modelos.Actor;
import org.iesch.ad.demo.persistencia.modelos.Pelicula;
import org.iesch.ad.demo.persistencia.servicios.ActoresServicios;
import org.iesch.ad.demo.persistencia.servicios.PeliculasServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class ActoresControlador {

    @Autowired
    ActoresServicios actoresServicios;

    @GetMapping("actores")
    public List<Actor> obtenerTodas(){
        return actoresServicios.buscaTodasLosActores();
    }

    @GetMapping("actores/{dni}")
    public Actor buscaPorDNI(@PathVariable String dni){
        return actoresServicios.buscaPorId(dni);
    }

    @PostMapping("actores")
    public Actor insertarActor(@RequestBody Actor actor){

        Actor actorTmp = actoresServicios.guardaActor(actor);
        return actorTmp;
    }




}
