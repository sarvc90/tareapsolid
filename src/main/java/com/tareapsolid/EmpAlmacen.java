package com.tareapsolid;

public class EmpAlmacen extends Empleado{

    private Almacen almacen;

    public EmpAlmacen(String nombre, String apellido, String id, Almacen almacen) {
        super(nombre, apellido, id);
        this.almacen=almacen;
        //TODO Auto-generated constructor stub
    }
    @Override
    public void hacerReporte(){


    }
    
}
