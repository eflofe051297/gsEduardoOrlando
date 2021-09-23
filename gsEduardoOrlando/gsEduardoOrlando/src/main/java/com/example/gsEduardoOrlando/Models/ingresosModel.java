package com.example.gsEduardoOrlando.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "registrosAutos")
@Data
public class ingresosModel {
@Id
    private  Long id;
    private String placa;
    private Timestamp ingreso;
}
