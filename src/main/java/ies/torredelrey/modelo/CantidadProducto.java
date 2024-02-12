/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ies.torredelrey.modelo;

/**
 *
 * @author usuario
 */
public class CantidadProducto {
    
    private String nombre;
    private Integer totalVendidos;

    public CantidadProducto(String nombre, int cantidad) {
        
        this.nombre = nombre;
        this.totalVendidos = cantidad;
    }

    public CantidadProducto() {
    }

    @Override
    public String toString() {
        return "CantidadProducto{" + "nombre=" + nombre + ", totalVendidos=" + totalVendidos + '}';
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public Integer getTotalVendidos() {
        return totalVendidos;
    }

    public void setTotalVendidos(Integer totalVendidos) {
        this.totalVendidos = totalVendidos;
    }

  
    
    
}
