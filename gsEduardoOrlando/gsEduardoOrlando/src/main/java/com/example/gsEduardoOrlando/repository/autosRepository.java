package com.example.gsEduardoOrlando.repository;

import com.example.gsEduardoOrlando.Models.AutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface autosRepository extends JpaRepository<AutosModel,String> {

    @Query(value = "select tipoAuto from tiposAutos where placa =:placa",nativeQuery = true)
    AutosModel getByTipoAuto(@Param("placa") String placa);

    @Query(value = "select * from tipoAuto",nativeQuery = true)
    List<AutosModel> getAll();

}
