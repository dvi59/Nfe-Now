package com.example.nfenow.dto;

import lombok.*;
@Data
@Getter
@Setter
public class NfeDTO {

    private Long id;
    private String cnpj;
    private String endereco;
    private String razaoSocial;
    private double valor;
    private String nrSerie;

}
