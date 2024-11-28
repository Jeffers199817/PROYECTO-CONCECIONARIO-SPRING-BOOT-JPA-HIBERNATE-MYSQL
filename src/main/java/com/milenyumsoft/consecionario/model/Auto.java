package com.milenyumsoft.consecionario.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name="global_seq", sequenceName = "hibernate_seq", allocationSize = 1)
@Entity
public class Auto {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "global_seq")
    private Long id;
    private String marca;
    private String modelo;
    private String patente;
    private String anio;

    @OneToMany(mappedBy = "unAuto")
    @JsonIgnore
    private List<Propietario> listaPropietarios;

}
