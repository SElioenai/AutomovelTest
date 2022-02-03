package com.demo.test.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.TimeZone;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Automovel {

    @Column
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String marca;

    @Column
    private String modelo;

    @Column
    private BigDecimal valor;

    @Column
    @JsonProperty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/YYYY")
    private Date dataCadastro;

}
