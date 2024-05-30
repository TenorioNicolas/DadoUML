public class Juego_Dados {
	private Dado dado1;
	private Dado dado2;


	public Juego_Dados() {
		this.dado1 = new Dado(6); // Crer un dado con 6 caras
		this.dado2 = new Dado(6); // Crear otro dado con 6 caras
	}

	public void jugar() {
		// Lanzamos los dos dados
		int resultadoDado1 = dado1.lanzar();
		int resultadoDado2 = dado2.lanzar();

		// Mostrar resultados
		System.out.println("Resultado del dado 1: " + resultadoDado1);
		System.out.println("Resultado del dado 2: " + resultadoDado2);

		// suma de los resultados
		int suma = resultadoDado1 + resultadoDado2;

		// Determinar si se gana o se pierde
		if (suma == 7) {
			System.out.println("\n¡Ganaste!");

		} else {
			System.out.println("\nPerdiste");

		}
	}
}
