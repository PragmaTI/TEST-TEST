package com.pragma.controller;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.pragma.exception.PragmaException;
import com.pragma.model.PragmaModel;
import com.pragma.services.PragmaService;

public abstract class PragmaController<K, T extends PragmaModel> {

	
	protected static Logger log = Logger.getLogger(PragmaController.class);

	
	protected PragmaService<K, T> service;

	
	public List<T> findAll() {
		return service.findAll();
	}

	public T findById(K id) {
		return service.findById(id);
	}

	public T save(T instance) {
		return service.save(instance);
	}

	public T update(T instance) {
		return service.update(instance);
	}

	public void delete(T instance) {
		 service.delete(instance);
	}



	protected void setService(PragmaService<K, T> service) {
		this.service = service;
	}

	

	@ExceptionHandler(Exception.class)
	public @ResponseBody
	Map<String, String> handleUncaughtException(Exception ex, WebRequest request, HttpServletResponse response) throws IOException {
		Map<String, String> map = new HashMap<String, String>();
		if (ex instanceof PragmaException) {
			map.put("code", ((PragmaException) ex).getCodigo());
		} else {
			long ticketId = System.currentTimeMillis();
			log.error("Error - TicketId : " + ticketId);
			map.put("code", ex.getClass().getName());
			map.put("ticketId", String.valueOf(ticketId));
			ex.printStackTrace();
		}
		map.put("error", ex.getMessage());
		log.error(ex);
		return map;
	}
}