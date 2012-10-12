package tarea3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class Profesores {
	
	public static List<DatosProfesores> listaProfesores = new ArrayList<DatosProfesores>();
	
	public static boolean validarProfesor(String nombre)
	{
		boolean exite= false;
		
		for(DatosProfesores a : listaProfesores)
		{
			if(a.nombre.equals(nombre))
			{
				exite = true;
			}
		}
		
		return exite;
	}
	
	
	public static void agregarProfesor() throws IOException
	{
		InputStreamReader converte = new InputStreamReader(System.in);
		BufferedReader lee = new BufferedReader(converte);
		
		
		boolean salirProfesores =true;
		
		inicio:
		while(salirProfesores)
		{
		
			DatosProfesores datosProfesor= new DatosProfesores();

			boolean sigue= true;
			
			
			while(sigue)
			{
				System.out.print("\nEscriba el nombre del profesor o 'S' para salir: ");
				datosProfesor.nombre= lee.readLine();
				
				if(Profesores.validarProfesor(datosProfesor.nombre))
				{
					System.out.print("\nEste nombre ya fue agregado");
				}
				else{sigue=false;}
				
				if(datosProfesor.nombre.toLowerCase().equals("s"))
				{
					salirProfesores= false;
					continue inicio;
				}
			
			}
			
			sigue= true;
			while(sigue)
			{
				
				System.out.print("Escriba horas de trabajo del profesor o 'S' para salir: ");
				String entrada = lee.readLine();
				
				if(entrada.toLowerCase().equals("s"))
				{
					salirProfesores= false;
					break;
				}
				
				if(IsNumero.IsInt(entrada))
				{
					if(Integer.parseInt(entrada)<=40)
					{
						
						datosProfesor.horas= Integer.parseInt(entrada);
						sigue= false;
					}
					else
					{
						System.out.println("\nEl numero de horas de trabajo debe ser menor de 40 !");
					}
					
				}
				else
				{
					System.out.println("\nEl valor debe ser numerico y entero !");
					
				}	
			}
			
			
			 listaProfesores.add(datosProfesor);
		}
		
		
		
		DatosProfesores datosProfesor= new DatosProfesores();
		
		datosProfesor.nombre="cesar";
		datosProfesor.horas=2;
		listaProfesores.add(datosProfesor);
		
		datosProfesor= new DatosProfesores();
		datosProfesor.nombre="juan";
		datosProfesor.horas=3;
		listaProfesores.add(datosProfesor);
		
		datosProfesor= new DatosProfesores();
		datosProfesor.nombre="pedro";
		datosProfesor.horas=3;
		listaProfesores.add(datosProfesor);

			
	}
}
