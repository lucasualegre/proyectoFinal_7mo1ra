package projecto;
import java.util.ArrayList;
import java.util.List;

public class lista_de_habitaciones {
	
	private List<Habitaciones> habitaciones;
	
	public lista_de_habitaciones(){
		habitaciones = new ArrayList<>();
		habitaciones.add(new Habitaciones(1, 3, 17000," para 3 personas con camas individuales", "estandar"));
		habitaciones.add(new Habitaciones(2, 1, 13000," para 1 persona cama individual", "estandar"));
		habitaciones.add(new Habitaciones(3, 2, 15000," para 2 personas con 2 cama matrimonial", "estandar"));
		habitaciones.add(new Habitaciones(4, 4, 20000," para 4 personas con 4 camas individuales ", "suite"));
		habitaciones.add(new Habitaciones(5, 5, 35000," para 5 personas con  1 cama matrimonial y 4 individuales", "king"));
		habitaciones.add(new Habitaciones(6, 2, 15000," para 2 personas con cama matrimonial", "suite"));
		habitaciones.add(new Habitaciones(7, 5, 35000," para 5 persona con cama matrimonial y 4 individual", "king"));
		habitaciones.add(new Habitaciones(8, 2, 15000," para 2 personas con cama matrimonial", "suite"));
		habitaciones.add(new Habitaciones(9, 5, 35000," para 5 persona con cama matrimonial y 4 individual", "king"));
		habitaciones.add(new Habitaciones(10, 3, 17000," para 3 personas con camas individuales", "estandar"));



		

	}
}
