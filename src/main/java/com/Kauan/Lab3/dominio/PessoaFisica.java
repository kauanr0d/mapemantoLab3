package com.Kauan.Lab3.dominio;

import jakarta.persistence.*;

import java.io.Serializable;



@Entity
@Table(name= "PessoaFisica",schema = "bosta")
@Inheritance(strategy = InheritanceType.JOINED)
public class PessoaFisica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @Column(unique = true)
    private String CPF;
    private String telefone;
    private String email;

}

