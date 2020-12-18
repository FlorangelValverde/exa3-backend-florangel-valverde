package pe.edu.upeu.exa3backendflorangelvalverde.service;

import java.util.Map;

import pe.edu.upeu.exa3backendflorangelvalverde.entity.Usuarios;


public interface UsuarioService {
	Usuarios validarUsuario(String nomuser);
	Map<String, Object> datosUsuario(String username);
	
}
