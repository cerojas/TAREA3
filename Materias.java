package tarea3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Materias {
		
	public static List<DatosMaterias> listaMaterias = new ArrayList<DatosMaterias>();
	
	
	public static boolean validarMaterias(String nombre)
	{
		boolean exite= false;
		
		for(DatosMaterias a : listaMaterias)
		{
			if(a.nombre.equals(nombre))
			{
				exite = true;
			}
		}
		
		return exite;
	}
	
	
	
	
	public static void AgregarMaterias()
	{
		InputStreamReader converte = new InputStreamReader(System.in);
		BufferedReader lee = new BufferedReader(converte);
		
		boolean salirMaterias =true;
		
		/*
		while(salirMaterias)
		{
			//verifica si el numero de creditos ha pasado el limite
			int contador =0;
			for (DatosMaterias a : listaMaterias) {
				contador += a.creditos;
				if(contador>84)
				{
					System.out.println("\nHa pasado el limites de credito semanal ya que las clases son de lunes a sabado de 8:00 am - 10:00 pm");
					salirMaterias =false;
					break;
				}
			}
			
			
			DatosMaterias datosMateria= new DatosMaterias();
			
			boolean sigue= true;
			
			inicio:
			while(sigue)
			{
				System.out.print("\nEscriba el nombre de la materia o 'S' para salir: ");
				datosMateria.nombre = lee.readLine;
				
				if(Materias.validarMaterias(datosMateria.nombre))
				{
					System.out.println("\nEste nombre ya fue agregado");
					continue inicio;
				}
				else{sigue=false;}
				
				
				if(datosMateria.nombre.toLowerCase().equals("s"))
				{
					salirMaterias= false;
					continue inicio;
				}
				
				System.out.print("Escriba el aula de la materia: o 'S' para salir: ");
				datosMateria.aula = lee.readLine();
				
				if(datosMateria.aula.toLowerCase().equals("s"))
				{
					salirMaterias= false;
					continue inicio;
				}
			}
			
			if(!salirMaterias){break;}
			
			sigue= true;
			while(sigue)
			{
				System.out.print("Escriba los creditos de la materia: o 'S' para salir:");
				String entrada = lee.readLine();
				
				if(entrada.toLowerCase().equals("s"))
				{
					salirMaterias= false;
					break;
				}
				
				if(IsNumero.IsInt(entrada))
				{
					datosMateria.creditos = Integer.parseInt(entrada);
					sigue= false;
				}
				else{System.out.println("\nEl valor debe ser numerico y entero!");}	
			}
			if(!salirMaterias){break;}
			
			
			
			listaMaterias.add(datosMateria);
		}
		
		*/
		

		
		
		
		
		DatosMaterias datosMateria= new DatosMaterias();
		
		datosMateria.nombre ="matematicas";
		datosMateria.aula="11a";
		datosMateria.creditos=5;
		listaMaterias.add(datosMateria);
		
		datosMateria= new DatosMaterias();
		datosMateria.nombre ="fisica";
		datosMateria.aula="22a";
		datosMateria.creditos=5;
		listaMaterias.add(datosMateria);
		
		datosMateria= new DatosMaterias();
		datosMateria.nombre ="sociales";
		datosMateria.aula="32a";
		datosMateria.creditos=3;
		listaMaterias.add(datosMateria);
		
		datosMateria= new DatosMaterias();
		datosMateria.nombre ="redaccion";
		datosMateria.aula="41a";
		datosMateria.creditos=3;
		listaMaterias.add(datosMateria);
		
		datosMateria= new DatosMaterias();
		datosMateria.nombre ="etica";
		datosMateria.aula="42a";
		datosMateria.creditos=3;
		listaMaterias.add(datosMateria);
		
		datosMateria= new DatosMaterias();
		datosMateria.nombre ="programacion 1";
		datosMateria.aula="42a";
		datosMateria.creditos=4;
		listaMaterias.add(datosMateria);
		
		
	}

}
