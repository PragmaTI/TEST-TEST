package com.pragma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
    @NamedQuery(name = Proveedor.FIND_ALL, query = "select p from Proveedor p"),
    @NamedQuery(name = Proveedor.TOTAL_RESULT, query = "select count(p) from Proveedor p"),
    @NamedQuery(name = Proveedor.FIND_BY_NOMBRE, query = "select p from Proveedor p where p.nombre = :nombre"),    
})
public class Proveedor extends PragmaModel {

	private static final long serialVersionUID = 1L;


	public static final String FIND_BY_NOMBRE = "Proveedor.findByNombre";

   
    @Column(name="nombre")
    private String nombre;


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

        
    
    
}