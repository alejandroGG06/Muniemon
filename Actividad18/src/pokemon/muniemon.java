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

	public void atacarMuniemon(muniemon objetivo) {
		  if (this.vida <= 0) {
	            System.out.println(this.nombre + " está muerto y no puede atacar.");
	            return;
	        }

		  	else if (objetivo.vida <= 0) {
	            System.out.println(objetivo.nombre + " está muerto y no puede ser atacado.");
	            return;
	        }

	        else if (this.vida > 0) {
	            int ataqueRealizado = this.ataque - objetivo.defensa;
	            if (ataqueRealizado <objetivo.defensa) {
	            	ataqueRealizado=this.ataque;
	            } 
				
			
            objetivo.defensa -= ataqueRealizado;
            System.out.println(this.nombre + " ataca a " + objetivo.nombre + " y le resta " + ataqueRealizado + " puntos de vida.");
       
            if (objetivo.defensa<=0) { int ataquefinal= this.ataque-objetivo.vida;
            if (ataquefinal<objetivo.vida) {
				ataquefinal=this.ataque;
			}
            objetivo.vida-=ataquefinal;
            
            if (objetivo.vida<=0) {System.out.println("tu muniemon ha muerto");
				
			}
			
			
         
		}
    }
		   
      
    }
		
	}
	


