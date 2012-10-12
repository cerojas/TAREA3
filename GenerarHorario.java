package tarea3;

import java.util.ArrayList;
import java.util.List;

public class GenerarHorario {

	public static void horario()
	{

		List<DatosHorario> horario = new ArrayList<DatosHorario>();
	
		//total de creditos 
		int creditos =0;
		for(int s=0; s<Materias.listaMaterias.size(); s++)
		{
			creditos += Materias.listaMaterias.get(s).creditos;
		}
		/*___________________________________________________________*/
		
		// variables 
		int contadorProfesores= Profesores.listaProfesores.size();  
		int veces=0; 
		int hora=8; 
		int cuentadias=0;
		boolean salir= false;
		/*_________________________________________*/
		
		while(creditos>0)
		{
			for(int a=0; a<Materias.listaMaterias.size(); a++)
			{
				if(Materias.listaMaterias.get(a).creditos>0)
				{
					if(Materias.listaMaterias.get(a).creditos>4)
					{
						veces= Materias.listaMaterias.get(a).creditos/2;
					}
					else
					{
						veces= Materias.listaMaterias.get(a).creditos;
					}
					
					for(int v=0; v<veces; v++)
					{
						//guarda los datos del horario
						DatosHorario profesorMateria = new DatosHorario();
						
						if(hora==8){profesorMateria.dia= generarDia(cuentadias);}
						profesorMateria.hora= hora+":00";
						profesorMateria.aula= Materias.listaMaterias.get(a).aula;
						profesorMateria.nombreMateria = Materias.listaMaterias.get(a).nombre;
						
						profesorMateria.nombreProfesor = Profesores.listaProfesores.get(contadorProfesores-1).nombre;
						
						horario.add(profesorMateria);
						/*______________________________________________________________________________________________________*/
						
						//actualiza los creditos de la materia
						DatosMaterias materiaActualizar = new DatosMaterias();
						materiaActualizar = Materias.listaMaterias.get(a);
						
						materiaActualizar.creditos -=1;
						
						Materias.listaMaterias.set(a, materiaActualizar);
						/*________________________________________________________*/
						
						//actualiza las horas del profesor
						DatosProfesores profesorCambiar = new DatosProfesores();
						
						profesorCambiar = Profesores.listaProfesores.get(contadorProfesores-1);
						profesorCambiar.horas -=1;
						
						Profesores.listaProfesores.set(contadorProfesores-1, profesorCambiar);
						
						
						
						
						System.out.println(Profesores.listaProfesores.get(contadorProfesores-1).nombre);
						System.out.println(Profesores.listaProfesores.get(contadorProfesores-1).horas+"\n");
						
						
						
						
						
						/*________________________________________________________________________*/
						
						
						
						//total de horas de profesores 
						int horasProfesores =0;
						for(int s=0; s<Profesores.listaProfesores.size(); s++)
						{
							horasProfesores += Profesores.listaProfesores.get(s).horas;
						}
						System.out.println("\nTotal creditos "+horasProfesores);
						
						
						
						
						if(horasProfesores!=0)
						{
						
							if(contadorProfesores>1)
							{ 
								contadorProfesores--;
								while(Profesores.listaProfesores.get(contadorProfesores-1).horas==0)
								{
									if(contadorProfesores>1)
									{ 
										contadorProfesores--;
									}
									
									else
									{ 
										contadorProfesores=Profesores.listaProfesores.size(); 
									}
								}
								
							}
							else
							{ 
								contadorProfesores=Profesores.listaProfesores.size(); 
							}
						}
						else
						{
							System.out.println("\nNo hay maestros con horas disponibles");
							salir=true;
							break;
						}
						
						/*__________________________________________________________________________*/	
						
						
						//actualiza la hora
						if(hora==22){ hora=8; cuentadias++; }
						else{ hora++; }
						/*_________________________________________*/
						
					}//for veces
					if(salir){break;}
				}//fin if materiasCreditos >0 	
			}//fin for materias
			if(salir){break;}
			//inicializa la hora
			hora=8;
			/*________________________*/
			
			// incrementa los dias
			if(cuentadias==5){ cuentadias=0; }
			else{ cuentadias++; }
			/*___________________________________*/
			
			//CALCULA LOS CREDITOS
			creditos=0;
			for(DatosMaterias m : Materias.listaMaterias)
			{
				creditos += m.creditos;
			}
			/*________________________________________________*/
				
		}//fin while

		
		// imprime el horario por pantalla
		for(int a=0; a<horario.size(); a++)
		{
			if(horario.get(a).dia!=null){System.out.println("\n"+ horario.get(a).dia +"\n");}else{System.out.println("\n");}
			System.out.println(horario.get(a).hora);
			System.out.println(horario.get(a).nombreMateria);
			System.out.println(""+horario.get(a).nombreProfesor);
			System.out.println(""+horario.get(a).aula);
		}
		/*___________________________________________________________________________________________________________________*/
	
		
		System.out.println(Profesores.listaProfesores.get(0).nombre);
		System.out.println(Profesores.listaProfesores.get(0).horas+"\n");
		

		System.out.println(Profesores.listaProfesores.get(1).nombre);
		System.out.println(Profesores.listaProfesores.get(1).horas+"\n");
		

		System.out.println(Profesores.listaProfesores.get(2).nombre);
		System.out.println(Profesores.listaProfesores.get(2).horas+"\n");
		
		
		
		
		
		
		
	}//fin metodo horario()
	
	
	
	
	
	
	//genera el dia del horario
	public static String generarDia(int contadorDia)
	{
		String dia;
		
		switch(contadorDia)
		{
			case 0:
				dia="Lunes";
			break;
			
			case 1:
				dia="Martes";
			break;
			
			case 2:
				dia="Miercoles";
			break;
			
			case 3:
				dia="Jueves";
			break;
			
			case 4:
				dia="Viernes";
			break;
			
			case 5:
				dia="Sabado";
			break;
			
			default:
				dia="Lunes";
			break;	
		}
		
		
		return dia;
	}
}
