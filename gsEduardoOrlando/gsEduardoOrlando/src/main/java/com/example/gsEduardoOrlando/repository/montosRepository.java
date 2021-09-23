package com.example.gsEduardoOrlando.repository;

import com.example.gsEduardoOrlando.Models.montosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface montosRepository  extends JpaRepository<montosModel,String> {

    @Query(value = "update registrosAutos set salida = NOW() where id =:id and placa =:placa",nativeQuery = true)
    montosModel update(@Param("id") int id , @Param("placa") String placa);

    @Query(value = "select TIMESTAMPDIFF(MINUTE,ingreso,salida) as minuto from registrosAutos where id =:id",nativeQuery = true)
    montosModel selectyMinutos(@Param("id") int id);
}
