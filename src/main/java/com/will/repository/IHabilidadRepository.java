package com.will.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.will.model.Habilidad;

@Repository
public interface IHabilidadRepository  extends JpaRepository<Habilidad, Integer >{

	//Esto es HQL porque el motor definido en  tu properties es Hibernate
	//El Query es propio de Hibernate
	@Query("select new com.will.model.Habilidad(h.id, h.nombre, h.experiencia) from habilidad h where h.persona.id = :idPersona")
	List<Habilidad> getHabilidadByPersonaId(@Param("idPersona") Integer id);
}
