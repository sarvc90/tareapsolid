package com.tareapsolid;

public class EmpAlmacen extends Empleado{

    private Almacen almacen;

    public EmpAlmacen(String nombre, String apellido, String id, Almacen almacen) {
        super(nombre, apellido, id);
        this.almacen=almacen;
        //TODO Auto-generated constructor stub
    }


    @Override
    public void hacerReporte(){

        System.out.println("La cantidad de unidades disponibles en el almacén es: ");
        for(Producto producto: almacen.getProductos()){
            System.out.println("Producto: "+producto.getNombreProducto()+", Cantidad: "+producto.getStock());
        }

    }
    
}
