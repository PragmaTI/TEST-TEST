package com.pragma.dao;

import java.util.List;

public interface IPragmaDAO<K, E> {

	E save(E entity);

	E update(E entity);

	void remove(E entity);

	E findById(K id);

	List<E> findAll();
	
	Long getTotalResult();
}