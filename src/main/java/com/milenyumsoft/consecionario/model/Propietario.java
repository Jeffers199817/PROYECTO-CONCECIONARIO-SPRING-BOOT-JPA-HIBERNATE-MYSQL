package com.milenyumsoft.consecionario.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(name="global_seq", sequenceName = "hibernate_seq", allocationSize = 1)
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    private Long idPropietario;
    private String nombre;
    private String apellido;
    private String dni;

    @ManyToOne
    @JoinColumn(name="idAuto")
    private Auto unAuto;

}
