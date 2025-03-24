package dragones_y_mazmorras;

import java.util.ArrayList;

public class Inventario {
	
	private ArrayList<Equipamiento> equipamientos;
	
	public Inventario() {
		
		this.equipamientos = new ArrayList<>();
	}


	
	
	public void agregarEquipamiento(Equipamiento equipamiento) {
		
		this.equipamientos.add(equipamiento);
		
	}
	
	public void mostrarInventario() {
		
		if(equipamientos.isEmpty()) {
			System.out.println("El inventario esta vacio");
		}
		else {
			for(Equipamiento i: equipamientos) {
				System.out.println("Objeto 1: " + i.getNombre() + " Tipo: " + i.getTipo());
				
			}
		}
		
		
		
	}
	
	
}
