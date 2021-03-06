package brep;

import java.util.ArrayList;

public class Color {
	
	private String tag = "color";
	private String nombre;
	private double r, g, b;
	private ArrayList<String> caras = new ArrayList<String>();
	
	
	/**
	 * Constructor vacio
	 */
	public Color(){
	}
	
	/**
	 * Constructor con nombre y valores RGB
	 * 
	 * @param nombre
	 * @param r
	 * @param g
	 * @param b
	 */
	public Color(String nombre, double r, double g, double b){
		this.nombre = nombre;
		this.r = r;
		this.g = g;
		this.b = b;
	}
	

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	
	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the r
	 */
	public double getR() {
		return r;
	}
	
	/**
	 * @param r the r to set
	 */
	public void setR(double r) {
		this.r = r;
	}
	
	/**
	 * @return the g
	 */
	public double getG() {
		return g;
	}
	
	/**
	 * @param g the g to set
	 */
	public void setG(double g) {
		this.g = g;
	}
	
	/**
	 * @return the b
	 */
	public double getB() {
		return b;
	}
	
	/**
	 * @param d the b to set
	 */
	public void setB(double d) {
		this.b = d;
	}
	
	/**
	 * @return the caras
	 */
	public ArrayList<String> getCaras() {
		return caras;
	}
	
	/**
	 * @param caras the caras to set
	 */
	public void setCaras(ArrayList<String> caras) {
		this.caras = caras;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String str = "";
		str += tag + " " + nombre + " " + r + " " + g + " " + b;
		for(int i=0; i<caras.size(); i++)
			str += " " + caras.get(i);
		return str;
	}

}
