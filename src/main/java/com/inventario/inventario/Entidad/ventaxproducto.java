/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.inventario.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "ventasxproducto")
public class ventaxproducto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idfactura;   
    private String nombreproducto;
    private int idventa;
    private int idproducto;
    
    @NotNull
    private int cantidadesvendidas;
    private int preciodeventa;
     
}
