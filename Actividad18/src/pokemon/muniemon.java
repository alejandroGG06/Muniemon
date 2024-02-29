package pokemon;



public class muniemon {
	 String nombre;
	 int vida;
	 int ataque;
	 int defensa;
	Tipo tipo;



	public muniemon() {
		super();
	}



	public muniemon(String nombre, int vida, int ataque, int defensa, Tipo tipo) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.tipo = tipo;
	}
	
	public void atacarMuniemon (muniemon objetivo) {
		
		if (this.vida <= 0) {
            System.out.println(this.nombre + " está muerto y no puede atacar.");
            return;
        }

        if (objetivo.vida <= 0) {
            System.out.println(objetivo.nombre + " está muerto y no puede ser atacado.");
            return;
        }

        System.out.println(this.nombre + " ataca a " + objetivo.nombre + ".");
        
        int danoRealizado = ( this.ataque - objetivo.defensa);
        objetivo.defensa-= danoRealizado;
        
        
		

        System.out.println("Se realizó un daño de " + danoRealizado + " puntos de defensa.");
        
      
        
        if (objetivo.vida <= 0) {
            System.out.println(objetivo.nombre + " ha sido derrotado.");
        }
        }
        
        
        
			
		}
		
	
	
	



