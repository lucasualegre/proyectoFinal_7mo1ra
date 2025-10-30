
import java.util.ArrayList;
import java.util.List;

public class ReservasActivas extends listaReservas {
	private int reservis2;
	public void reservis (int ReservaId){
		this.reservis=ReservaId;
	}
	public ReservasActivas(int reservis2){
		this.reservis2 = reservis2;
		
	}
	public void preciototal (int habitacionId){
		for (int i=0;i<lista_de_habitaciones.size();i++){
			lista_de_habitaciones lis = lista_de_habitaciones.get(i);
			if (lis.getReservaId()==habitacionId){
				System.out.println( "Precion total :"+super.gettotaldias()*super.get_costo);
			}

		}
		
	}
}
