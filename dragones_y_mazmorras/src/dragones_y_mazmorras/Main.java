package dragones_y_mazmorras;

import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args) {
		
			
		ArrayList<Personaje> personajes = new ArrayList<>();

        // Crear inventarios
        Inventario guerreroInventario = new Inventario();
        Inventario magoInventario = new Inventario();
        Inventario ladronInventario = new Inventario();

        // Crear personajes
        Guerrero guerrero1 = new Guerrero("Guerrero1", 1, 100, guerreroInventario, null, false);
        Mago mago1 = new Mago("Mago1", 1, 100, 100, magoInventario);
        Ladron ladron1 = new Ladron("Ladron1", 1, 100, ladronInventario, false);

        // Agregar personajes al ArrayList
        personajes.add(guerrero1);
        personajes.add(mago1);
        personajes.add(ladron1);

        // Usar métodos de los personajes
        System.out.println("\n--- Información de los personajes ---");
        guerrero1.mostrarInfo();
        mago1.mostrarInfo();
        ladron1.mostrarInfo();

        System.out.println("\n--- Probando habilidades ---");

        // Guerrero protege al Mago
        guerrero1.proteger(mago1);
        // El Mago recarga su maná
        mago1.recargarMana(50);
        // El Ladrón se hace invisible
        ladron1.HacerseInvisible();
        ladron1.estaInvisible();

        System.out.println("\n--- Estado final de los personajes ---");
        guerrero1.mostrarInfo();
        mago1.mostrarInfo();
        ladron1.mostrarInfo();

			
	
		

			
	}
		
		
		
		
		
		
		
		
		
		
}
	
	

