package fabricas;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args)
	
	{
		
		int opcion, opcion1;
		
		Scanner valor = new Scanner(System.in);
		Scanner op = new Scanner(System.in);

		fabricaStandalone fabricas = new fabricaStandalone();
		
		fabricaWeb fabricaw = new fabricaWeb();

		System.out.println("crear fabrica standalone = 1");
		System.out.println("crear fabrica web = 2");
		
		opcion = valor.nextInt();
		
		switch(opcion) {
		
		case 1:
			System.out.println("Fabrica standalone");
			System.out.println("crea boton = 1");
			System.out.println("crea cuadro de texto = 2");
			
			
			opcion1 = op.nextInt();
			
			
			if(opcion1 == 1) 
			{
				fabricas.crearBoton();
				System.out.println(fabricas);
			}
			if(opcion1 == 2) 
			{
				fabricas.crearCuadro();
				System.out.println(fabricas);
			}
			break;
			
		case 2:
			
			System.out.println("Fabrica web");
			System.out.println("crea boton = 1");
			System.out.println("crea cuadro de texto = 2");
			
			opcion1 = op.nextInt();
			
			if(opcion1 == 1) 
			{
				fabricaw.crearBoton();
				System.out.println(fabricaw);
			
			}
			
			if(opcion1 == 1) 
			{
				fabricaw.crearCuadro();
				System.out.println(fabricaw);
				
			}
			break;
			
		}	
		
	}

}