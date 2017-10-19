package ar.edu.unlam.pb2;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	@org.junit.Test
	public void test() {
		Map<Integer,SeleccionArgentina> jugadores = new HashMap<Integer,SeleccionArgentina>();
		SeleccionArgentina p1 =new SeleccionArgentina(3, "Sorin", "Defensor");
		SeleccionArgentina p2 =new SeleccionArgentina(7, "Saviola", "Delantero");
		SeleccionArgentina p3 =new SeleccionArgentina(10, "Riquelme", "Mediocampista");
		jugadores.put(1,p1);
		jugadores.put(3,p2);
		jugadores.put(2,p3);
		
		Iterator<Integer> it = jugadores.keySet().iterator();
		while(it.hasNext()){
			Integer key=it.next();
			SeleccionArgentina paux = new SeleccionArgentina();
			paux=jugadores.get(key);
			System.out.print("Clave: "+key+"\t");
			paux.mostrarObjeto();
			/*System.out.println("Clave: "+key+"\tNumCamiseta: "+paux.getNumeroCamiseta()+
					"\tNombre: "+paux.getNombre()+"\t Funcion: "+paux.getPosicion());*/
		}
		}
	
}
