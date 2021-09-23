package com.example.gsEduardoOrlando.Service;

import com.example.gsEduardoOrlando.Models.ingresosModel;
import com.example.gsEduardoOrlando.repository.autosRepository;
import com.example.gsEduardoOrlando.repository.ingresosRepository;
import com.example.gsEduardoOrlando.repository.montosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Movimientos_Service {
@Autowired
ingresosRepository ing ;
@Autowired
montosRepository mon ;

@Autowired
autosRepository au ;

    public void ingresoAuto(String placa){
        ingresosModel im = new ingresosModel();
        im.setPlaca(placa);
    ing.saveAuto(placa);
    }

    public void registrarSalida(String placa){
        int id = ing.findTopById().getId().intValue();
        mon.update(id,placa);
    }


    public Double calcularCuota(String placa){
        Double monto = 0.0;
        int id = ing.findTopById().getId().intValue();
        mon.update(id,placa);
        int minutos = mon.selectyMinutos(id).getMinutos().intValue();
        if(au.getByTipoAuto(placa).getTipoAuto().equals("R")){
           return monto = 0.03 * minutos;
        }else{
            return monto = 0.6 * minutos;
        }
    }

}
