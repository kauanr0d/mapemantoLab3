package com.Kauan.Lab3.dominio;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Cliente",schema = "bosta")

public class Cliente extends  PessoaFisica implements Serializable {

    private String contato;
    private boolean status;


}

