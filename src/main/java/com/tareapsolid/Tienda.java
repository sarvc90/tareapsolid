package com.tareapsolid;

import java.util.List;

public class Tienda {
    private List<Producto> productos;
    private List<Empleado> empleados;
    private List<Cliente> clientes;

    public Tienda(List<Producto> productos, List<Empleado> empleados, List<Cliente> clientes) {
        this.productos = productos;
        this.empleados = empleados;
        this.clientes = clientes;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

}
