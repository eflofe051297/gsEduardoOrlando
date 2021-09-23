package com.example.gsEduardoOrlando.controllers;

import com.example.gsEduardoOrlando.Models.AutosModel;
import com.example.gsEduardoOrlando.Service.registraAutos_Services;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("gdEduardoOrlando")
@CrossOrigin
public class SaveCars_Controller {
    @Autowired
    registraAutos_Services rg;

    @PostMapping("registrar_Auto_Residente")
    public ResponseEntity<?> saveCar(String placa){
        try {
            rg.saveCar(placa,"R");
            return new ResponseEntity("auto residente registrado ", HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity("error al registrar", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("registrar_Auto_No_Residente")
    public ResponseEntity<?> saveCarNoResidente(String placa){
        try {
            rg.saveCar(placa,"NR");
            return new ResponseEntity("auto no residente registrado ", HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity("error al registrar", HttpStatus.BAD_REQUEST);
        }
    }
}
