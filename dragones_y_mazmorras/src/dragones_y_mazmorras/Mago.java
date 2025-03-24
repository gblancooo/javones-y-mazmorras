package dragones_y_mazmorras;

public class Mago extends Personaje{

	
	private int puntosMana;
	
	 public Mago(String nombre, int nivel, int puntosVida, int puntosMana, Inventario inventario) {
		 	super(nombre, nivel, puntosVida, inventario);
	        this.puntosMana = puntosMana;
	        
        }
	
   
    
   
    public void mostrarInfo() {
    	
    	mostrarInfo(); System.out.println(" Mana:  " + this.puntosMana);
    	
    }
	 
   public void recargarMana(int ManaRecarga) {
        this.puntosMana += ManaRecarga + 25;
        System.out.println("Mana recargado. Mana actual: " + this.puntosMana);
    }
    	    
	public void lanzarHechizo(Personaje objetivo, int costeMana, int daño) {
		if (this.puntosMana >= costeMana) {
			this.puntosMana -= costeMana;
			objetivo.bajarVida(daño);
			System.out.println(this.getNombre() + " ha lanzado un hechizo sobre " + objetivo.getNombre() +
							   " causando " + daño + " de daño. Maná restante: " + this.puntosMana);
		} else {
			System.out.println(this.getNombre() + " no tiene suficiente maná para lanzar el hechizo.");
		}
	}
   
   public void mostrarOpciones() {
		System.out.println("Opciones que puedes hacer:" );
		System.out.println("1 - Recargar mana");
		System.out.println("2 - Lanzar echizo");
		System.out.println("3 - Atacar");
	}
   
}
