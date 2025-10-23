import java.util.ArrayList;
import java.util.List;
public class Listaclientes {

	List<Clientes> cliente = new ArrayList<>();
	
	
	public void AgregarCliente(Clientes cliente) {
		this.cliente.add(cliente);
	}
	
	public void MostrarCliente(int idcliente) {
		for (int i=0;i<=cliente.size();i++) {
			Clientes clientito = cliente.get(i);
		if (clientito.getId()==idcliente) {
			System.out.println(clientito.InfoCliente());
		}
		}
	}
	
	public void EliminarCliente (int idcliente) {
		for (int i=0;i<=cliente.size();i++) {
			Clientes clientito = cliente.get(i);
			if (clientito.getID()==idcliente) {
				cliente.remove(cliente.get(i));
			}
		}
			
	}
}
