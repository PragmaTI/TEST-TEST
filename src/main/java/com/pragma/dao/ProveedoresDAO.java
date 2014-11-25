package com.pragma.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pragma.model.Proveedor;
@Service
public class ProveedoresDAO extends PragmaDAO<Long, Proveedor> {

    public List<Proveedor> findByNombre(String nombre) {
        return em.createNamedQuery(Proveedor.FIND_BY_NOMBRE).setParameter("nombre", nombre).getResultList();
    }

    
}