package dragones_y_mazmorras;


public abstract class Personaje {

	private String nombre;
	private int nivel;
	private int puntosVida;
	
	private Inventario inventario;
	

    public Personaje(String nombre, int nivel, int puntosVida, Inventario inventario ) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.inventario = new Inventario(); 
        }
    
	
    
    
    public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public int getNivel() {
		return nivel;
	}




	public void setNivel(int nivel) {
		this.nivel = nivel;
	}




	public int getPuntosVida() {
		return puntosVida;
	}




	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}




	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}




	public void mostrarInfo() {
    	System.out.println("Nombre: " + this.nombre +
    						"Nivel: " + this.nivel + 
    						"puntosVida: " + this.puntosVida);
    }
    
    public void bajarVida(int vida) {
    	
    	
 	   this.puntosVida = vida; //genera un numero aleatorio entre 0 i 25(upperbound)
 	   
 	   System.out.println("Se a echo un total de: " + vida + " Vida actual: " + this.puntosVida  );
 	   
    }
    
    public void getInventario() {
    	
    	this.inventario.mostrarInventario();
    }
    
    public void agregarEquipamiento(Equipamiento equipamiento) {
    	
    	this.inventario.agregarEquipamiento(equipamiento);
    	
    }
    
    
    
}
