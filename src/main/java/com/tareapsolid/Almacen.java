package com.tareapsolid;

import java.util.List;

public class Almacen {

    private List<Producto> productos;

    public Almacen(List<Producto> productos) {
        this.productos = productos;
        
    }

    public List<Producto> getProductos() {
        return productos;
    }


    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    
    
}
