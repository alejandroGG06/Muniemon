package pokemon;

import java.util.Scanner;

public class main_poke {
	public static void main(String[] args) {
		
		Scanner muni = new Scanner(System.in);
        muniemon Mm = new muniemon();
        
        
        int opcion;
        do {
        	System.out.println("bienvenido al menu de creacion");
        	System.out.println("pulse 1 para crear el munimon ");
        	System.out.println("pulse 2 para mostrar el munimon");
        	System.out.println("pulse 3 para salir del programa");
        opcion = muni.nextInt();
		
        	
       
        
       switch (opcion) {
	case 1:
			System.out.println("introduzca el nombre del muniemon");
			String nombre=muni.next();	
			
			System.out.println("introduzca la vida del munimon");
			int vida= muni.nextInt();
			
			System.out.println("introduzca el ataque");
			int ataque=muni.nextInt();
			
			System.out.println("introduzca los puntos de defensa");
			int defensa=muni.nextInt();
			
			System.out.println("introduza el tipo del munimon");
			System.out.println("Estos son Agua, Fuego, Tierra, Planta");
			Tipo tipo= Tipo.valueOf(muni.next()); 
			
			Mm	= new muniemon(nombre, vida, ataque, defensa, tipo);
	
             System.out.println("Muniemon creado con éxito.");
		break;

	case 2:
		 System.out.println("Datos del Muniemon:");
         System.out.println("Nombre: " + Mm.nombre ); 
         System.out.println("Vida: "  + Mm.vida);
         System.out.println("Ataque: " + Mm.ataque) ;
         System.out.println("Defensa: " + Mm.defensa); 
         System.out.println("Tipo: " + Mm.tipo );
	
			break;
         
	case 3:	 System.out.println("programa finalizado");
		break;
			
		
        
       	
	 
       }
        } while (opcion !=3); 
        
       
        
	}
}
