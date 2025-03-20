package dragones_y_mazmorras;
	
	
	public class Guerrero extends Personaje {
		
		private boolean protegiendo;
		private boolean compañeroProtegido;
		
	    public Guerrero(String nombre, int nivel, int puntosVida, boolean protegiendo, boolean compañeroProtegido) {
			super(nombre, nivel, puntosVida);
			this.setProtegiendo(protegiendo);
			this.setCompañeroProtegido(compañeroProtegido);
			
		}

		public boolean isProtegiendo() {
			return protegiendo;
		}

		public void setProtegiendo(boolean protegiendo) {
			this.protegiendo = protegiendo;
		}

		public boolean isCompañeroProtegido() {
			return compañeroProtegido;
		}

		public void setCompañeroProtegido(boolean compañeroProtegido) {
			this.compañeroProtegido = compañeroProtegido;
		}

		public void proteger(Personaje compañero) {
		}
		
		
		public void dejarDeProteger() {
		}
		
		
		public void bajarVida(int vida) {
		}
		
		
		
		public void estaProtegiendo() {
		}
	
		
	
		}
		
	