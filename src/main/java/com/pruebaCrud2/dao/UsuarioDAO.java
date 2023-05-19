package com.pruebaCrud2.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.pruebaCrud2.model.Usuario;
import com.pruebaCrud2.model.Util;


public class UsuarioDAO {
	EntityManager entity = Util.getEntityManagerFactory().createEntityManager();
			
	//Guarda el usuario con la ayuda de Hibernate
	public void guardar(Usuario usuario) {
		entity.getTransaction().begin();
		entity.persist(usuario);
		entity.getTransaction().commit();
		Util.shutdown();
	}
	
	//Edita el usuario con la ayuda de Hibernate
	public void editar(Usuario usuario) {
		entity.getTransaction().begin();
		entity.merge(usuario);
		entity.getTransaction().commit();
		//Util.shutdown();
	}
	
	//Obtiene el usuario con la ayuda de Hibernate
	public Usuario buscar(String id) {
		Usuario user = new Usuario();
		user = entity.find(Usuario.class, id);
		//Util.shutdown();
		
		return user;
	}
	
	//Elimina el usuario con la ayuda de Hibernate
	public void eliminar(String id) {
		Usuario user = new Usuario();
		user = entity.find(Usuario.class, id);
		
		entity.getTransaction().begin();
		entity.remove(user);
		entity.getTransaction().commit();
	}
	
	//Obtiene todos los Usuarios con la ayuda de Hibernate
	public List<Usuario> getAllUsers() {
		List<Usuario> lUsers = new ArrayList<>();
		
		Query q = entity.createQuery("SELECT user FROM Usuario user");
		
		lUsers = q.getResultList();
		
		return lUsers;
	}
}
