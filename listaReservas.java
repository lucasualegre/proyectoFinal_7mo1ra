
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;
public class listaReservas {

	
	List<reservas> reserva = new ArrayList<>();

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

