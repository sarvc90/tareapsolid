package com.tareapsolid;

public class EmpVentas extends Empleado{

    private int numeroVentas;

    public EmpVentas(String nombre, String apellido, String id, int numeroVentas) {
        super(nombre, apellido, id);
        this.numeroVentas=numeroVentas;
        //TODO Auto-generated constructor stub
    }

    public int getNumeroVentas(){
        return numeroVentas;
    }


    @Override
    public void hacerReporte() {

        System.out.println("Las ventas realizadas en el dia son: "+getNumeroVentas());

        
    }

}
