package tarea3;

import java.io.*;
import java.util.*;

public class Main
{
	
	public static void main(String[] args) throws IOException
	{

        InputStreamReader converter = new InputStreamReader(System.in);
        BufferedReader lee = new BufferedReader(converter);
  
		
		boolean salir1=true;
		while(salir1)
		{
			System.out.println(" 1  Agregar Profesor");
			System.out.println(" 2  Agregar Materia");
			System.out.println("'S' Salir");
			
			System.out.print("\nEscriba la opcion deseada: ");
			String opcion= lee.readLine();
			
			if(opcion.toLowerCase().equals("s"))
			{
				salir1= false;
				break;
			}
			
			if(IsNumero.IsInt(opcion))
			{
				switch(opcion)
				{
					case "1":
						
						Profesores.agregarProfesor();
						 
					break;
					
					
					case "2":
						
						 Materias.AgregarMaterias();
						
					break;
					
					
					default:
						System.out.println("\nOpcion incorrecta!");
					break;
				}
			}
			else
			{
				System.out.println("\nEl valor debe ser numerico");
			}
				
		}
		
		GenerarHorario.horario();
			
		
		
		
		
		
		
			
	}
}
















