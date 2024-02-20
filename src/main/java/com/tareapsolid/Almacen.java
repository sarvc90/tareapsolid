package com.tareapsolid;

public class Almacen {

    private String producto;
    private int stock;

    public Almacen( String producto, int stock){
        this.producto=producto;
        this.stock=stock;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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
