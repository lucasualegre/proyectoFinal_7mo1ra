package desarrollo;

import java.util.ArrayList;
import java.util.List;
public class ListaReservas {

	
	private List<reservas> reserva = new ArrayList<>();
	private List<Habitaciones> habitaciones;
	
	public lista_de_habitaciones(){
		habitaciones = new ArrayList<>();
		habitaciones.add(new Habitaciones(1, 2, 15000," para 2 personas con 2 camas individuales", "estandar"));
		habitaciones.add(new Habitaciones(2, 2, 15000," para 2 persona con 2 camas individuales", "estandar"));
		habitaciones.add(new Habitaciones(3, 2, 15000," para 2 personas con 2 cama inidividuales", "estandar"));
		habitaciones.add(new Habitaciones(4, 3, 25000," para 3 personas con 1 una matrimonial y 2 individuales ", "suite"));
		habitaciones.add(new Habitaciones(5, 3, 25000," para 3 personas con  1 cama matrimonial y 2 individuales", "suite"));
		habitaciones.add(new Habitaciones(6, 4, 30000," para 4 personas con 4 camas induales", "king"));
		habitaciones.add(new Habitaciones(7, 4, 30000," para 4 persona con 4 camas individuales", "king"));
		habitaciones.add(new Habitaciones(8, 4, 30000," para 4 personas con 4 camas individuale", "king"));
		habitaciones.add(new Habitaciones(9, 5, 35000," para 5 persona con cama matrimonial y 4 individuales", "presidencial"));
		habitaciones.add(new Habitaciones(10, 5, 35000," para 5 personas con cama matrimonial y 4 individuales", "presidencial"));
	}

	public void CrearReserva(int ReservaId, int ClienteId , int HabitacionId, int FechaIngreso, int FechaSalida, int MetodoPago){
		
	reservas reserva = new reservas(ReservaId,ClienteId,HabitacionId,FechaIngreso,FechaSalida,MetodoPago);
	this.reserva.add(reserva);

	
	}
	
	
	public void AgregarReserva(reservas reserva) {
		this.reserva.add(reserva);
	}
	
		
	public void CancelacionReserva (int reservitaId){
		for (int i=0; i<=reserva.size();i++) {
			reservas reservita = reserva.get(i);
			if (reservita.getReservaId()==reservitaId) {
				reserva.remove(reserva.get(i));
			}
		}
	}
	
	public void HistorialReservaClientes(int clienteId) {
		for (int i=0; i<=reservas.size();i++) {
			reservas reservita = reserva.get(i);
			if (reservita.getClienteId()==clienteId)  {
				System.out.println(reserva);
			}
			}
		}
	public void TiempoReservado (int ReservaId) {
		for (int i=0; i<=reservas.size();i++) {
			reservas reservita = reserva.get(i);
			if (reservita.getreservaId()==reservaId)  {
				System.out.println("Tiempo Reservado" +
				  ChronoUnit.DAYS.between(FechaIngreso, FechaSalida)
				  + " dias.");
	}
		}
}
