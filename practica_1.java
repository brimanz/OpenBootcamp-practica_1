public class Main {
    
    public static void main(String[] args) {
        
        //primera parte del ejercicio.
		SumarNumeros(3,4,3);
		
		//segunda parte del ejercicio.
		Coche micoche = new Coche();
		micoche.agregarPuerta(1);
	}

    
    public static void SumarNumeros(int a, int b, int c){
        int suma = a + b + c;
        
        System.out.println("La sumatoria es: " + suma);
    }
    

	public static class Coche {
		static int puertas = 4; 

		void agregarPuerta(int numPuertas) {
			puertas += numPuertas;
			
			System.out.println("El numero de puertas es: " + Coche.puertas);
		}
	}
}
