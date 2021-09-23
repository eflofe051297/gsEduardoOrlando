package com.example.gsEduardoOrlando.controllers;

import com.example.gsEduardoOrlando.Service.Movimientos_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("gsEduardoOrlando")
public class Movimientos_controller {
    @Autowired
    Movimientos_Service ms;

    @PostMapping("registrarIngresos")
    public ResponseEntity<?> registrarIngreso(String placa){
        try{
            ms.ingresoAuto(placa);
            return new ResponseEntity("auto registrado con placa :" + placa, HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity("error ", HttpStatus.OK);
        }
    }

    @PostMapping("registrarSalida")
    public ResponseEntity<?> registrarSalida(String placa){
        try{
            ms.registrarSalida(placa);
            return new ResponseEntity("salida registrada", HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity("error ", HttpStatus.OK);
        }
    }

    @GetMapping("Cobrar")
    public ResponseEntity<?> cobros(String placa){
        try{
            ms.calcularCuota(placa);
            return new ResponseEntity("auto registrado ", HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity("error ", HttpStatus.OK);
        }
    }
}
