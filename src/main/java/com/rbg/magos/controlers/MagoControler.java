package com.rbg.magos.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rbg.magos.Interfaces.IMagosService;
import com.rbg.magos.entitys.Magos;

@RestController
@RequestMapping("/magos")
public class MagoControler {
    @Autowired IMagosService imagosService;

    //*Trae lista de magos */
    @GetMapping("/magosList")
    public List<Magos> getMagosList() {
        List<Magos> magosList = imagosService.getMagosList();
        return magosList;
    }

    //*Trae mago por id */
    @GetMapping("/{id}")
    public Magos getMago(@PathVariable Long id){
        Magos mago = imagosService.getMago(id);
        return mago;
    }

    //*Crea nuevo mago */
    @PostMapping("/create")
    public String createMago(@RequestBody Magos mago){
        imagosService.createMago(mago);
        return "Nuevo mago creado correctamente con el nombre de: " + mago.getNombre();
    }

    //*Actualiza datos del mago por id */
    @PostMapping("/update/{id}")
    public String updateMago(
                            @PathVariable Long id,
                            @RequestBody Magos mago){
        imagosService.createMago(mago);
        return "Datos del mago con id: " + mago.getId() + "actualizados correctamente";
    }

    //*Elimena mago por id */
    @DeleteMapping("/delete/{id}")
    public String deleteMago(@PathVariable Long id){
        imagosService.deleteMago(id);
        return "El mago ha sido eliminado";
    }


}
