package com.example.gsEduardoOrlando.repository;

import com.example.gsEduardoOrlando.Models.ingresosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ingresosRepository extends JpaRepository<ingresosModel,String>  {
    @Query(value = "insert into registrosAutos(Placa,ingreso) values (:placa,NOW())",nativeQuery = true)
    ingresosModel saveAuto(@Param("placa") String placa);

    ingresosModel findTopById();


}
