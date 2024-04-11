package com.Kauan.Lab3.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;

import com.Kauan.Lab3.dominio.Dependente;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Funcionario",schema = "bosta")
public class Funcionario extends PessoaFisica implements Serializable {
    @Column(unique = true)
    private int matricula;

    @OneToMany(mappedBy = "funcionario")
    private List<Dependente> dependentes = new ArrayList<>();
}
