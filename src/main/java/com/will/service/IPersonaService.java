package com.will.service;

import com.will.model.Persona;

public interface IPersonaService extends CRUD<Persona>{

	Integer getUserIdByEmail(String correo) throws Exception;
	
}
