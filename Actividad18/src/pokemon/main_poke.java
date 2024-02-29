package pokemon;

import java.util.Scanner;

public class main_poke {
	public static void main(String[] args) {
		
		Scanner muni = new Scanner(System.in);
        muniemon Mm = new muniemon();
        muniemon Mm2= new muniemon();
        
        int opcion;
        do {
        	System.out.println("bienvenido al menu de creacion");
        	System.out.println();
        	System.out.println("pulse 1 para crear el munimon ");
        	System.out.println();
        	System.out.println("pulse 2 para crear el segundo munimon");
        	System.out.println();
        	System.out.println("pulse 3 para mostrar el primer muniemon");
        	System.out.println();
        	System.out.println("pulse 4 para mostrar el segundo muniemon");
        	System.out.println();
        	System.out.println("pulse 5 para atacar al segundo muneimon");
        	System.out.println();
        	System.out.println("pulse 6 para atacar al segundo muneimon");
        	System.out.println();
        	System.out.println("pulse 7 para salir");
        
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
		System.out.println("introduzca el nombre del muniemon");
		 nombre=muni.next();	
		
		System.out.println("introduzca la vida del munimon");
		 vida= muni.nextInt();
		
		System.out.println("introduzca el ataque");
		 ataque=muni.nextInt();
		
		System.out.println("introduzca los puntos de defensa");
		 defensa=muni.nextInt();
		
		System.out.println("introduza el tipo del munimon");
		System.out.println("Estos son Agua, Fuego, Tierra, Planta");
		Tipo tipo2= Tipo.valueOf(muni.next()); 
		
		Mm2= new muniemon(nombre, vida, ataque, defensa, tipo2);
		System.out.println("Muniemon creado con éxito.");
		 	
	
			break;
         
	case 3:
		System.out.println("Datos del Muniemon:");
        System.out.println("Nombre: " + Mm.nombre ); 
        System.out.println("Vida: "  + Mm.vida);
        System.out.println("Ataque: " + Mm.ataque) ;
        System.out.println("Defensa: " + Mm.defensa); 
        System.out.println("Tipo: " + Mm.tipo );
		break;
		
	case 4:
		System.out.println("Datos del Muniemon:");
        System.out.println("Nombre: " + Mm2.nombre ); 
        System.out.println("Vida: "  + Mm2.vida);
        System.out.println("Ataque: " + Mm2.ataque) ;
        System.out.println("Defensa: " + Mm2.defensa); 
        System.out.println("Tipo: " + Mm2.tipo );
		
		break;
		
	case 5:
		
		Mm.atacarMuniemon(Mm2);
		
		
		break;
		
	case 6:
		
		Mm2.atacarMuniemon(Mm);
		
		break;
		
        
       	
	case 7:  System.out.println("programa finalizado");
       }
       
        } while (opcion !=7); 
        
       
        
	}
}
