package com.tareapsolid;

public class Producto{

    private String nombre;
    private String referencia;
    private int stock;

    public Producto (String nombre,String referencia,int stock){

        this.nombre = nombre;
        this.referencia = referencia;
        this.stock = stock;

    }

    public String getNombre() {
        return nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public int getStock() {
        return stock;
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

