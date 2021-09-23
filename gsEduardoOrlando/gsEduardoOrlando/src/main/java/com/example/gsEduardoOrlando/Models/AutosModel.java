package com.example.gsEduardoOrlando.Models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tiposAutos")
@Data
public class AutosModel{
    @Id
    private String placas;
    @Column(name = "tipoAuto")
    private String tipoAuto;
}



