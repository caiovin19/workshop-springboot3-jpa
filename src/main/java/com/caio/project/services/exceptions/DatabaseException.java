package com.caio.project.services.exceptions;

import org.hibernate.boot.model.relational.Database;

public class DatabaseException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String msg) {
		super(msg);
	}

}
