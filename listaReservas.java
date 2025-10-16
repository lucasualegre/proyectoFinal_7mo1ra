package desarrollo;

import java.util.ArrayList;
import java.util.List;
public class listaReservas {

	
	List<reservas> reserva = new ArrayList<>();

	public void CrearReserva(int ReservaId, int ClienteId , int HabitacionId, int FechayHoraIngreso, int FechayHoraSalida, int MetodoPago){
		
	reservas reserva = new reservas(ReservaId,ClienteId,HabitacionId,FechayHoraIngreso,FechayHoraSalida,MetodoPago);
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
			} else {
				System.out.println("Reserva no encontrada X");
			}
		}
	}
	
	
}

