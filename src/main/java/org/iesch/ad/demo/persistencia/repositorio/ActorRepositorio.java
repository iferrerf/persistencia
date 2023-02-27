package org.iesch.ad.demo.persistencia.repositorio;

import org.iesch.ad.demo.persistencia.modelos.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepositorio extends JpaRepository<Actor, String> {
}
