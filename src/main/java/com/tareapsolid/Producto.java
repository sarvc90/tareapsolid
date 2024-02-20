package com.tareapsolid;

public abstract class Producto{

    private String nombre;
    private String referencia;
    

    public Producto (String nombre,String referencia){

        this.nombre = nombre;
        this.referencia = referencia;
        

    }

    public String getNombre() {
        return nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    
}

