package com.pragma.services;

import java.util.List;

import com.pragma.dao.IPragmaDAO;

import com.pragma.model.PragmaModel;



public abstract class PragmaService<K, T extends PragmaModel> {

	protected IPragmaDAO<K, T> dao;

	public List<T> findAll() {
		return dao.findAll();
	}
	
	public T findById(K id) {	
		return dao.findById(id);
	
	}

	
	public T save(T instance) {
		return dao.save(instance);
	}

	public T update(T instance) {		
		return dao.update(instance);
	}

	public void delete(T instance) {
		 dao.remove(instance);
	}
	

	protected void setDao(IPragmaDAO<K, T> dao) {
		this.dao = dao;
	}
	
	
}
