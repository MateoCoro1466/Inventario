/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.Servicio;

import com.inventario.inventario.DAO.ProductoDAO;
import com.inventario.inventario.Entidad.producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio {
    
    @Autowired
    private ProductoDAO productoDao; 
    
    public void setearUnidades(producto producto, Long idProducto, int UnidadesRestantes) {
        
        var productoAModificar = productoDao.findById(idProducto);
        
        producto.setIdproducto(productoAModificar.get().getIdproducto());
        producto.setNombreproducto(productoAModificar.get().getNombreproducto());
        producto.setPreciodecompra(productoAModificar.get().getPreciodecompra());
        producto.setPreciodeventa(productoAModificar.get().getPreciodeventa());
        producto.setUnidad(UnidadesRestantes);        
        
        productoDao.save(producto);
    }
    
}
