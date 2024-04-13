package com.Kauan.Lab3.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Veiculo",schema = "bosta")
public class Veiculo implements Serializable {
    @Id
    @Column(unique = true)
    private String numeroPlaca;

    @OneToMany(mappedBy = "veiculo")
    private List <Frete> fretes = new ArrayList<>();
}
