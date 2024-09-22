/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.Servicio;

import com.inventario.inventario.DAO.VentaXProductoDAO;
import com.inventario.inventario.Entidad.venta;
import com.inventario.inventario.Entidad.ventaxproducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaXProductoServicio {
    
    @Autowired
    private VentaXProductoDAO ventaxproductoDao; 
    
    public void obtenerDetalleFactura(venta venta) {
        //Prueba
    }  
    
}
