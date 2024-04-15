package com.Kauan.Lab3.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn(name = "id_filial", nullable=false)
    private Filial filial;

}
