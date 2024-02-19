package com.tareapsolid;

public class Persona {
    private final String nombre;
    private final String apellido;

    public Persona(String nombre,String apellido){
        assert nombre != null && !nombre.isBlank() : "El nombre es requerido";
        assert apellido != null && !apellido.isBlank() : "El apellido es requerido";
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
