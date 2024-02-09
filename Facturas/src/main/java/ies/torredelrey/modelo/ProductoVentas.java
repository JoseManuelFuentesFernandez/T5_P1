/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.torredelrey.modelo;

/**
 *
 * @author usuario
 */
public class ProductoVentas {
    private int id;
    private String nombre;
    private double precio;
    private int totalVendidos;
    // DOUBLE PARA ventaTotal = precio * totalVendidos -> EN INFORME
    
    public ProductoVentas(int id, String nombre, double precio, int totalVendidos) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.totalVendidos = totalVendidos;
    }

    public ProductoVentas() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTotalVendidos() {
        return totalVendidos;
    }

    public void setTotalVendidos(int totalVendidos) {
        this.totalVendidos = totalVendidos;
    }

    
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", totalVendidos=" + totalVendidos + '}';
    }
}
