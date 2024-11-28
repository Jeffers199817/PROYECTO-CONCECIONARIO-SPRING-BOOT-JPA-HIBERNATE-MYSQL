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
    public String createPropietario(@RequestBody Propietario propietario) {

        propietarioService.crearPropietario(propietario);
        return "Propietario creado, exitosamente";
    }

    @PutMapping("propietario/editar")
    public Propietario editPropietario(@RequestParam Long idOriginal,
                                       @RequestParam(required = false , name="id") Long  idNuevo,
                                       @RequestParam(required = false,name="nombre") String nombreNuevo,
                                       @RequestParam(required = false, name="apellido") String apellidoNuevo,
                                       @RequestParam(required = false, name="dni") String dniNuevo,
                                       @RequestParam(required=false, name="idauto") Long idAuto) {

        Auto auto=autoService.traerAuto(idAuto);

        propietarioService.editarPropietario(idOriginal, idNuevo, nombreNuevo, apellidoNuevo, dniNuevo,auto);

        return propietarioService.traerPropietario(idNuevo);

    }

    @PutMapping("propietario/editar1")
    public void editarPropietario(@RequestBody Propietario propietario) {

        propietarioService.editarPropietario(propietario);


    }

    @DeleteMapping("propietario/eliminar")
    public String eliminarPropietario(@RequestParam Long idOriginal) {
        propietarioService.elimnarPropietario(idOriginal);
        return "Propietario eliminado, exitosamente";
    }
}
