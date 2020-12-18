package pe.edu.upeu.exa3backendflorangelvalverde.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.exa3backendflorangelvalverde.entity.Detalle_Ventas;

public interface Detalle_VentasDao {
	int create(Detalle_Ventas dv);
	int update(Detalle_Ventas dv);
	int update(int id);
	int delete(int id);
	List<Map<String, Object>> read(int id);
	List<Map<String, Object>> readAll();
}
