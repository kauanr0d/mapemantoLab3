package com.Kauan.Lab3.dominio;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "Frete",schema = "bosta")
public class Frete implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private Integer numeroNotaFiscal;
    private BigDecimal valorKmRodado;

    @ManyToOne
    @JoinColumn(name = "id_veiculo")
    private Veiculo veiculo;

}
