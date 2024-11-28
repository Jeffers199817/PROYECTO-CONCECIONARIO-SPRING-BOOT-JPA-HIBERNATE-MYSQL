package com.milenyumsoft.consecionario.controller;

import com.milenyumsoft.consecionario.model.Auto;
import com.milenyumsoft.consecionario.model.Propietario;
import com.milenyumsoft.consecionario.service.AutoService;
import com.milenyumsoft.consecionario.service.IAutoService;
import com.milenyumsoft.consecionario.service.IPropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

public class AutoController {


    @Autowired
    private IAutoService autoService;
    @Autowired
    private IPropietarioService propiedadService;


    @GetMapping("auto/traer")
    public List<Auto> getAuto() {

        return autoService.traerAutos();
    }

    @GetMapping("auto/traer/{idauto}")
    public Auto getAuto(@PathVariable("idauto") Long idauto) {

        return autoService.traerAuto(idauto);
    }

    @PostMapping("auto/crear")
    public String createAuto(@RequestBody Auto auto) {

        autoService.crearAuto(auto);
        return "Auto creado, exitosamente";
    }

    @PutMapping("auto/editar")
    public Auto editAuto(@RequestParam Long idOriginal,
                                       @RequestParam(required = false , name="id") Long  idNuevo,
                                       @RequestParam(required = false,name="marca") String marcaNuevo,
                                       @RequestParam(required = false, name="modelo") String modeloNuevo,
                                       @RequestParam(required = false, name="patente") String patenteNuevo,
                                       @RequestParam(required=false, name="anio") String anio) {


        autoService.editarAuto(idOriginal, idNuevo,marcaNuevo,modeloNuevo,patenteNuevo,anio);

        return autoService.traerAuto(idNuevo);

    }

    @PutMapping("auto/editar1")
    public void editarAuto(@RequestBody Auto auto) {

        autoService.editarAuto(auto);


    }

    @DeleteMapping("auto/eliminar")
    public String eliminarAuto(@RequestParam Long idOriginal) {
        autoService.eliminarAuto(idOriginal);
        return "Propietario eliminado, exitosamente";
    }
}
