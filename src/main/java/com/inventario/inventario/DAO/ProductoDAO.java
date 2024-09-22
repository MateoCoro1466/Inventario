/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.DAO;

import com.inventario.inventario.Entidad.producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDAO extends CrudRepository<producto, Long>{       
    
}
