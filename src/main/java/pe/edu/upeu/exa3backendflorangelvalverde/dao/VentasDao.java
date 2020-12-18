package pe.edu.upeu.exa3backendflorangelvalverde.dao;

import java.util.List;
import java.util.Map;


import pe.edu.upeu.exa3backendflorangelvalverde.entity.Ventas;

public interface VentasDao {
	int create(Ventas v);
	int update(Ventas v);
	int update(int id);
	int delete(int id);
	List<Map<String, Object>> read(int id);
	List<Map<String, Object>> readAll();

}
