package com.pragma.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL) 
@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PragmaModel implements Serializable {

    public static final String FIND_ALL = "Entity.findAll";

    public static final String TOTAL_RESULT = "Entity.totalResult";

    public static final String FIND_BY_EXAMPLE = "Entity.findByExample";
    
    private static final long serialVersionUID = 1L;

	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
