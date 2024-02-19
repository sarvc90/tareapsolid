package com.tareapsolid;

public class Cliente extends Persona {
    private final String membresia;
    // ejemplo pricipio I de SOLID segregación de interfaz.
    private final CompraProductos ServicioCompraProducto;
    public Cliente (String nombre, String apellido, String membresia, CompraProductos ServicioCompraProducto){
        super(nombre, apellido);
        this.membresia = membresia;
        this.ServicioCompraProducto = ServicioCompraProducto;
    }
    // ejemplo pricipio D de SOLID inversion de dependencias.
    public void RealizarCompra(Producto producto){
        ServicioCompraProducto.comprarProducto(producto);
    }
    public String getMembresia(){
        return membresia;
    }
    
}