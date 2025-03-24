package dragones_y_mazmorras;

import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args) {
		
			
		ArrayList<Personaje> personajes = new ArrayList<>();

        Inventario guerreroInventario = new Inventario();
        Inventario magoInventario = new Inventario();
        Inventario ladronInventario = new Inventario();

        Guerrero guerrero1 = new Guerrero("Guerrero1", 1, 100, guerreroInventario, null, false);
        Mago mago1 = new Mago("Mago1", 1, 100, 100, magoInventario);
        Ladron ladron1 = new Ladron("Ladron1", 1, 100, ladronInventario, false);

        personajes.add(guerrero1);
        personajes.add(mago1);
        personajes.add(ladron1);

        System.out.println("Información de los personajes:");
        guerrero1.mostrarInfo();
        mago1.mostrarInfo();
        ladron1.mostrarInfo();

		System.out.println("Probando habilidades de los personajes");

        guerrero1.proteger(mago1);

        mago1.recargarMana(50);

        ladron1.HacerseInvisible();
        ladron1.estaInvisible();

        System.out.println("El mago ataca con un hechizo al ladrón");
        mago1.lanzarHechizo(ladron1, 30, 20);

        System.out.println("El guerrero recibe daño ");
        guerrero1.bajarVida(15);

        System.out.println("Estado final de los personajes");
        guerrero1.mostrarInfo();
        mago1.mostrarInfo();
        ladron1.mostrarInfo();
			

          Equipamiento espada = new Equipamiento("Espada", "Arma");
          guerrero1.agregarEquipamiento(espada);
  
          System.out.println("Estado inicial de los inventarios ");
          System.out.println("Inventario del Guerrero:");
          guerrero1.getInventario();
          System.out.println("Inventario del Ladrón:");
          ladron1.getInventario();
  
          System.out.println("El Ladrón intenta robar al Guerrero ");
          ladron1.robarObjeto(guerrero1);
  
          System.out.println(" Estado final de los inventarios ");
          System.out.println("Inventario del Guerrero:");
          guerrero1.getInventario();
          System.out.println("Inventario del Ladrón:");
          ladron1.getInventario();
	
		

			
	}
		
		
		
		
		
		
		
		
		
		
}
	
	

