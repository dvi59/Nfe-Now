package com.example.nfenow.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nfe")
public class NFE {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String cnpj;
    private String endereco;
    private String razaoSocial;
    private double valor;
    private String nrSerie;

}