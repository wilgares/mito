package com.will.service;

import java.util.List;

import com.will.model.Habilidad;

public interface IHabilidadService extends CRUD<Habilidad> {
	
	List<Habilidad> getHabilidadByPersonaId(Integer id);
}

