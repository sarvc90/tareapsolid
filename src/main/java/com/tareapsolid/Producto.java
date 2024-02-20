package com.tareapsolid;

public abstract class Producto{

    private String nombre;
    private String referencia;
    private float precio;
    private int stock;
    

    public Producto (String nombre,String referencia, float precio, int stock){

        this.nombre = nombre;
        this.referencia = referencia;
        this.precio=precio;
        this.stock=stock;
    }


    public String getNombreProducto() {
        return nombre;
    }

    public String getReferencia() {
        return referencia;
    }
    
    public float getPrecio(){
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock=stock;
    }

    
    // ejemplo pricipio S de SOLID una sola responsabilidad 
    public void incrementarStock(int cantidad) {
        if (verificarNumNegativo(cantidad)) {
            stock += cantidad;
        }
    }

    private boolean verificarNumNegativo(int numero) {
        return numero >= 0;
    }

    

    
}

