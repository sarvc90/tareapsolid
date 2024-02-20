package com.tareapsolid;

public abstract class Empleado extends Persona {
    
    private final String id;
    public Empleado (String nombre, String apellido, String id){
        super(nombre, apellido);
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public abstract void hacerReporte();

    
}
