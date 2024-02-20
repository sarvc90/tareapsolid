package com.tareapsolid;

public class Bebida extends Producto {
    private final float impuesto;
    public Bebida (String nombre,String referencia,float precio, int stock, float impuesto){
        super(nombre, referencia,precio,stock);
        this.impuesto = impuesto;
    }
    public float getImpuesto(){
        return impuesto;
    }
}
