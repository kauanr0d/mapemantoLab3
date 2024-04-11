package com.Kauan.Lab3.dominio;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "Dependente",schema = "bosta")
public class Dependente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private LocalDate dataNascimento;

    @ManyToOne
    @JoinColumn(name = "id_funcionario",nullable = false)
    private Funcionario funcionario;


}
