package com.example.gsEduardoOrlando.Service;

import com.example.gsEduardoOrlando.Models.AutosModel;
import com.example.gsEduardoOrlando.repository.autosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class registraAutos_Services {
    @Autowired
    autosRepository ar;

    public void saveCar(String placa, String tipoAuto){
        AutosModel am = new AutosModel();
        am.setPlacas(placa);
        am.setTipoAuto(tipoAuto);
        ar.save(am);
    }
}
