package com.pruebaCrud2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.pruebaCrud2.dao.UsuarioDAO;
import com.pruebaCrud2.model.Usuario;

@ManagedBean(name="usuarioBean")
@RequestScoped
public class UsuarioBean {
	public String nuevo() {
		return "/faces/nuevo.xhtml";
	}

	public List<Usuario> obtenerUsuarios(){
		UsuarioDAO userDAO = new UsuarioDAO();

		return userDAO.getAllUsers();
	}
	
	public String editar(String id) {
		UsuarioDAO userDAO = new UsuarioDAO();
		
		Usuario user = new Usuario();
		user = userDAO.buscar(id);
		
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("usuario", user);
		
		return "/faces/editar.xhtml";
	}
	
	public String guardar(Usuario user) {
		UsuarioDAO userDAO = new UsuarioDAO();
		userDAO.guardar(user);
		return "/faces/index.xhtml";
	}
	
	public String actualizar(Usuario user) {
		UsuarioDAO userDAO = new UsuarioDAO();
		userDAO.editar(user);
		return "/faces/index.xhtml";
	}
	
	public String elimina(String id) {
		UsuarioDAO userDAO = new UsuarioDAO();
		userDAO.eliminar(id);
		
		return "/faces/index.xhtml";
	}
}
