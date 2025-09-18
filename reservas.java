package reserva;

public class reservas {

	private int ReservaId; 
	private int ClienteId;
	private int HabitacionId;
	private int FechayHoraIngreso;
	private int FechayHoraSalida;
	private int MetodoPago;

	public reservas (int ReservaId, int ClienteId , int HabitacionId, int FechayHoraIngreso, int FechayHoraSalida, int MetodoPago) {
		this.ReservaId=ReservaId;
		this.ClienteId=ClienteId;
		this.HabitacionId=HabitacionId;
		this.FechayHoraIngreso=FechayHoraIngreso;
		this.FechayHoraSalida=FechayHoraSalida;
		this.MetodoPago=MetodoPago;
	}

	public int getReservaId() {
		return ReservaId;
	}

	public void setReservaId(int reservaId) {
		ReservaId = reservaId;
	}

	public int getClienteId() {
		return ClienteId;
	}

	public void setClienteId(int clienteId) {
		ClienteId = clienteId;
	}

	public int getHabitacionId() {
		return HabitacionId;
	}

	public void setHabitacionId(int habitacionId) {
		HabitacionId = habitacionId;
	}

	public int getFechayHoraIngreso() {
		return FechayHoraIngreso;
	}

	public void setFechayHoraIngreso(int fechayHoraIngreso) {
		FechayHoraIngreso = fechayHoraIngreso;
	}

	public int getFechayHoraSalida() {
		return FechayHoraSalida;
	}

	public void setFechayHoraSalida(int fechayHoraSalida) {
		FechayHoraSalida = fechayHoraSalida;
	}

	public int getMetodoPago() {
		return MetodoPago;
	}

	public void setMetodoPago(int metodoPago) {
		MetodoPago = metodoPago;
	}
}
 
