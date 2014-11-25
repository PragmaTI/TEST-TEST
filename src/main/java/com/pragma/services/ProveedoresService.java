package com.pragma.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pragma.dao.ProveedoresDAO;

import com.pragma.model.Proveedor;


@Service
public  class ProveedoresService extends PragmaService<Long, Proveedor> {

	@Autowired
	protected void setDao(ProveedoresDAO dao) {
		this.dao = dao;
	}
	
	
}
