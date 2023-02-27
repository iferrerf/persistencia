package org.iesch.ad.demo.persistencia.modelos;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="nombre")

@JsonIgnoreProperties("pelicula")
public class Actor {

    @Id
    @Column(length = 9)
    String dni;
    String nombre;
    LocalDate nacimiento;

    @ManyToOne(fetch = FetchType.EAGER)
    Pelicula pelicula;

}
