import java.util.ArrayList;
import java.util.List;


public class ListaNumeros {

	private List<Integer> list;
	private final int SIZE=10;
	
	public ListaNumeros(){
		
		list=new ArrayList<Integer>(SIZE);
		for(int i=0; i<10; i++){
			list.add(new Integer(i));
			
		}
	}
	
	public void imprimirLista(){
		try{
			
		for(int i=0; i<10; i++){
			System.out.println(":) ->El valor en: "+i+"="+list.get(i));
			
		}
		}catch(IndexOutOfBoundsException e){
			System.err.print("El rango del indice es incorrecto");
		}
	}
}
