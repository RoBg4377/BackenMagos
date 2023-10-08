package com.rbg.magos.Interfaces;

import java.util.List;

import com.rbg.magos.entitys.Magos;

public interface IMagosService {

    //*trae lista de magos */
    public List<Magos> getMagosList();

    //*trae mago por id */
    public Magos getMago(Long id);

    //*crea un mago nuevo */
    public void createMago(Magos mago);

    //*actualiza datos de mago por id */
    //?puede usar el mismo método de crear mago

    //*elimina mago por id */
    public void deleteMago(Long id);
    
}
