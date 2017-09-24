package com.will.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.will.model.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Integer>{

	//Esto es HQL porque el motor definido en  tu properties es JPA Hibernate
	//JpaRepository nos define un CRUD para la entidad Persona
	//Si queremos algo diferente a lo que nos proveee el JPARepository
	//definimos nuestra Query personalizada
	//El @Query es propio JPA Repository de Spring
	//y dentro utilizamos la sentencia y es HQL que es propio de Hibernet
	//si utilizamos jpa+eclipselink es JPQL
	
	//Para implementar JPA tienes que pasar por algun motor hibernet, eclipselink
	
	//por defecto puedes utiliza jpql
	//JPQL o HQL no difiere mucho solo son las importciones de librerias
	@Query("select p.id from persona p where p.correo = :correo")
	Integer getUserIdByEmail(@Param("correo") String correo) throws Exception;
}
