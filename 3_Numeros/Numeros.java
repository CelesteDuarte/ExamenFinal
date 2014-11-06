package Numeros;
import java.io.*;

public class Numeros {
	static double num1 = 5;
	static double num2, total;
	static String texto = "";

	public static void main (String [] args) {
			try	{
			FileReader lector=new FileReader("InputNumeros.txt");
			BufferedReader contenido=new BufferedReader(lector);
			double num2 = Double.parseDouble(contenido.readLine());
	            double operacion = (3+Math.sqrt(num1));
	            total = num2 * operacion;
			}
			catch(Exception e){
			System.out.println("Error al leer");
			}	            

		    try {
		    File archivo=new File("OutputYoda.txt");
		    texto = String.valueOf(total);
		    FileWriter escribir=new FileWriter(texto,true);
		    escribir.write(texto);
		    escribir.close();
		    }
		    catch(Exception e){
		    }
		    
		}
		}