package com.example.gsEduardoOrlando.Models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "registrosAutos")
@Data
public class montosModel {
    @Id
    private Long id;
    private Timestamp salida;
    private Long minutos;
}
