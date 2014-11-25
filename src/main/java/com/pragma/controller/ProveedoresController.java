package com.pragma.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pragma.model.Proveedor;
import com.pragma.services.ProveedoresService;
@Controller
@RequestMapping(value = "/proveedores")
public  class ProveedoresController extends PragmaController<Long, Proveedor>{

	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody
	List<Proveedor> findAll() {
		return super.findAll();
	}

	

	@RequestMapping(value = "/{numero}", method = RequestMethod.GET)
	public @ResponseBody
	Proveedor findById(@PathVariable Long id) {
		return super.findById(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	Proveedor save(@RequestBody Proveedor instance) {
		return super.save(instance);
	}

	@RequestMapping(value = "/{numero}", method = RequestMethod.PUT)
	public @ResponseBody
	Proveedor update(@RequestBody Proveedor instance) {
		return super.update(instance);
	}

	@RequestMapping(value = "/{numero}", method = RequestMethod.DELETE)
	public @ResponseBody
	void delete(@RequestBody Proveedor instance) {
		super.delete(instance);
	}

	@Autowired
	protected void setService(ProveedoresService service) {
		super.setService(service);
	}
}