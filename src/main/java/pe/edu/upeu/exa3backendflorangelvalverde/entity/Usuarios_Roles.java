package pe.edu.upeu.exa3backendflorangelvalverde.entity;

public class Usuarios_Roles {
	private int idusuario;
	private int idrol;
	private String fecha;
	
	Usuarios_Roles() {
		super();
	}

	Usuarios_Roles(int idusuario, int idrol, String fecha) {
		super();
		this.idusuario = idusuario;
		this.idrol = idrol;
		this.fecha = fecha;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public int getIdrol() {
		return idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
