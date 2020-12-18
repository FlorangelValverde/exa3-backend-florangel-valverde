package pe.edu.upeu.exa3backendflorangelvalverde.dao;

import java.util.List;
import java.util.Map;


import pe.edu.upeu.exa3backendflorangelvalverde.entity.Producto;

public interface ProductoDao {
	int create(Producto pr);
	int update(Producto pr);
	int update(int id);
	int delete(int id);
	List<Map<String, Object>> read(int id);
	List<Map<String, Object>> readAll();

}
