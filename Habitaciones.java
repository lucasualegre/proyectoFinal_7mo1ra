package projecto;
import java.util.ArrayList;
import java.util.List;

public class Habitaciones {
	private int id;
	private int capacidad;
	private int costo;
	private String descripcion;
	private String nasa;
	
	private boolean habitaciones;
	
	private int precio_total;
	
	public Habitaciones (int id,int capacidad,int costo,String descripcion,String nasa){
		this.id=id;
		this.capacidad=capacidad;
		this.costo=costo;
		this.descripcion=descripcion;
		this.nasa=nasa;
		
	}
	public int get_ID(){
		return id;
	}
	public void set_ID (int id2){
		id=id2;
	}
	public int  get_capacidad(){
		return capacidad;
	}
	public void set_capacidad (int capacidad2){
		capacidad=capacidad2;
	}
	public int get_costo(){
		return costo;
	}
	public void set_costo (int costo2){
		costo=costo2;
	}
	public String get_descripcion(){
		return descripcion;
	}
	public void set_descripcion (String descripcion2){
		descripcion=descripcion2;
	}
	public String get_nasa(){
		return nasa;
	}
	public void set_nasa (String nasa2){
		nasa=nasa2;
	}
	public int costoxnoche (int id){
		return costo;
	}
	

	
}
