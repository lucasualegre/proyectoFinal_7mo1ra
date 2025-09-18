import java.util.ArrayList;
import java.util.List;
public class Listaclientes {

	List<Clientes> cliente = new ArrayList<>();
	
	
	public void AgregarCliente(Clientes cliente) {
		this.cliente.add(cliente);
	}
	
	public void MostrarCliente(Clientes cliente) {
		System.out.println(cliente());
	}
	
}
