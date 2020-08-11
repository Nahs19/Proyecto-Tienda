package Tienda;

import java.util.Date;
//import java.util.Random;

public class Productos {
	private double codigo;
	private float IVA;
	private float precio;
	private String nombreProducto;
	
	public Productos() {}

  
    public void setPrecio(float precio) {
    	this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
  
    public void setIVA(float IVA) {
        this.IVA = IVA;
    }  
  
    public float getIVA() {
        return IVA;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
  
    public double codigoProducto(){
        codigo = (double)Math.floor(Math.random()*10000000);
        return codigo;
    }
  
    public float precioTotal(){
        float total = ((getPrecio()*getIVA())+getPrecio());
        return total;
    }  
}
	


