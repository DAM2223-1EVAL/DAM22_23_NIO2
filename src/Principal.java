import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Principal {
	
	static BufferedWriter bw = null;

	public static void main(String[] args) {
		
		//NIO.2
		Path origen = Paths.get("D:\\PRUEBAS\\alumnos.txt");
		Path destino = Paths.get("D:\\PRUEBAS\\dam22_23.txt");
		BufferedReader br = null;
		
		try {
			br = Files.newBufferedReader(origen);
		} catch (IOException e) {
			System.out.println("La ruta indicada no es correcta");
		}
		
		try {
			bw = Files.newBufferedWriter(destino);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Stream<String> lineas = br.lines();
		
		lineas.forEach(l -> {
			try {
				String linea;
				bw.write(l + "");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});

	}

}
