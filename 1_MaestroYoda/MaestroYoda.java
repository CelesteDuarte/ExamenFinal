import java.util.*;
import java.io.*;

public class MaestroYoda {
	public static void main(String[]args){
		String texto="";
		try	{
		FileReader lector=new FileReader("InputYoda.txt");
		BufferedReader contenido=new BufferedReader(lector);
			while((texto=contenido.readLine())!=null){
				StringTokenizer palabras = new StringTokenizer(texto);
				Stack<String> pila = new Stack<String>();
		    	pila.push(pila + "\n");		  
		    while (palabras.hasMoreTokens()) {
		    	pila.push(palabras.nextToken());
		    }
		    while (!pila.empty())
		    	System.out.print(pila.pop() + " ");
		}
		}
		catch(Exception e){
		System.out.println("Error al leer");
		}

    try {
    File archivo=new File("OutputYoda.txt");
    FileWriter escribir=new FileWriter(archivo,true);
    escribir.write(texto);
    escribir.close();
    }
    catch(Exception e){
    }
    
}
}