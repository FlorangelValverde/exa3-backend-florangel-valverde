package pe.edu.upeu.exa3backendflorangelvalverde.entity;

public class Detalle_Ventas {
	private int iddetalle;
	private String nomprod;
	private double precio;
	private int cantidad;
	private int idventa;
	private int idproducto;
	
	Detalle_Ventas() {
		super();
	}

	Detalle_Ventas(int iddetalle, String nomprod, double precio, int cantidad, int idventa, int idproducto) {
		super();
		this.iddetalle = iddetalle;
		this.nomprod = nomprod;
		this.precio = precio;
		this.cantidad = cantidad;
		this.idventa = idventa;
		this.idproducto = idproducto;
	}

	public int getIddetalle() {
		return iddetalle;
	}

	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}

	public String getNomprod() {
		return nomprod;
	}

	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getIdventa() {
		return idventa;
	}

	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	
}
