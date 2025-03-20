package dragones_y_mazmorras;

import java.util.Random;

public abstract class Mago {

	private String nombre;
	private int nivel;
	private int puntosVida;
	
	private Inventario inventario;
	

    public Mago(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.inventario = new Inventario(); 
        }
    
	
    
    
    public void mostrarInfo() {
    	System.out.println("Nombre: " + this.nombre +
    						"Nivel: " + this.nivel + 
    						"puntosVida: " + this.puntosVida);
    }
    
    public void bajarVida(int vida) {
    	
    	Random rand = new Random(); //rand nos permite acceder a los numreos aleatorios

 	   int upperbound = 25; //establece el limite de numeros
 	   
 	   int daño = rand.nextInt(upperbound);
 	   
 	   this.puntosVida = daño; //genera un numero aleatorio entre 0 i 25(upperbound)
 	   
 	   System.out.println("Se a echo un total de: " + daño + " Vida actual: " + this.puntosVida  );
 	   
    }
    
    public void getInventario() {
    	
    	this.inventario.mostrarInventario();
    }
    
    public void agregarEquipamiento(Equipamiento equipamiento) {
    	
    	this.inventario.agregarEquipamiento(equipamiento);
    	
    }
    
    
    
}
