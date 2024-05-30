import java.util.Random;

public class Dado {
	private int numCaras;
	private Random resultado;

	// Constructor para crear un nuevo dado con un número específico de caras
	public Dado(int numCaras) {
		this.numCaras = numCaras;
		this.resultado = new Random();
	}

	// Método para lanzar el dado y obtener un valor aleatorio entre 1 y el número de caras
	public int lanzar() {
		return this.resultado.nextInt(numCaras) + 1;
	}
}
