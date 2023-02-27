package org.iesch.ad.demo.persistencia.modelos;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="titulo")
@JsonIgnoreProperties("actores")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String titulo;
    LocalDate año;
    String genero;
    String urlFoto;
    String director;
    String sinopsis;
    int duracion;
    int puntuacion;

    @OneToMany(mappedBy = "pelicula", fetch = FetchType.EAGER)
    List<Actor> actores = new ArrayList<>();

    public void addActor(Actor actor) {
        actores.add(actor);
    }

}
