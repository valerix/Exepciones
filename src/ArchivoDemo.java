import java.io.File;


public class ArchivoDemo {
	

	public ArchivoDemo(){
		
	}
	
	public void AnalizarRuta(String ruta){
		File arc=new File(ruta);
		if(arc.exists()){
			System.out.println(arc.getName()+" Si existe");
			if(arc.isFile()){
				System.out.println("Es archivo");
			}else{
				System.out.println("No es archivo");
			}
			if(arc.isDirectory()){
				System.out.println("Es directorio");
			}else{
				System.out.println("No es directorio");
			}
			System.out.println("La ruta absoluta es: "+arc.getAbsolutePath());
			System.out.println("Tama�o: "+arc.length());
			if(arc.isDirectory()){
				String directorio[]= arc.list();
				System.out.println("Contenido: ");
				for(String nombreDir: directorio){
					System.out.println(nombreDir);
				}
			}
		}else{
			System.out.println(ruta+" No existe");
		}
	}

}
