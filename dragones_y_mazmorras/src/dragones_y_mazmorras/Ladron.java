package dragones_y_mazmorras;


public class Ladron extends Personaje{
	
	boolean invisble = false;
	 
	public Ladron(String nombre, int nivel, int puntosVida,Inventario inventario, boolean invisible) {
		 super(nombre, nivel, puntosVida);
		 this.invisble = invisible;
	 
	}

	public boolean isInvisble() {
		return invisble;
	}

	public void setInvisble(boolean invisble) {
		this.invisble = invisble;
	}
	
	public void HacerseInvisible() {
		if(this.invisble){ 
			this.invisble = false;
			
		}else {
			this.invisble = true;
		}
	}
	public void estaInvisible() {
		if(this.invisble = true) {
			System.out.println("estas invisible");
			
		}else {
			System.out.println("No estas invisible tonto");
		}
	
	}
	
	public void mostrarInfo() {
		mostrarInfo(); System.out.print(" invisible: " + this.invisble);
	}

	public void robarObjeto(Personaje objetivo) {
        if (objetivo.getInventario().estaVacio()) {
            System.out.println(objetivo.getNombre() + " no tiene objetos para robar.");
            return;
        }

        Equipamiento objetoRobado = objetivo.getInventario().robarEquipamiento(0);
        this.getInventario().agregarEquipamiento(objetoRobado);

        System.out.println(this.getNombre() + " ha robado " + objetoRobado.getNombre() + " a " + objetivo.getNombre());
    }
	
	
	public void mostrarOpciones() {
		System.out.println("Opciones que puedes hacer:" );
		System.out.println("1 - Hacerse Invisible");
		System.out.println("2 - Robar Objetos");
		System.out.println("3 - Atacar");
	}
}

	
	
	
	




