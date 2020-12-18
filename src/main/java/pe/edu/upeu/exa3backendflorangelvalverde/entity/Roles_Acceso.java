package pe.edu.upeu.exa3backendflorangelvalverde.entity;

public class Roles_Acceso {
	private int idrol;
	private int idacceso;

	Roles_Acceso() {
		super();
		// TODO Auto-generated constructor stub
	}

	Roles_Acceso(int idrol, int idacceso) {
		super();
		this.idrol = idrol;
		this.idacceso = idacceso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idacceso;
		result = prime * result + idrol;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Roles_Acceso other = (Roles_Acceso) obj;
		if (idacceso != other.idacceso)
			return false;
		if (idrol != other.idrol)
			return false;
		return true;
	}
	
}
