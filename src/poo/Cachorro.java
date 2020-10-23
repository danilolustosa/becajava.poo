package poo;

public class Cachorro extends Mamifero {
	
	public Cachorro(int idade, int peso, String genero) {
		Idade = idade;
		Peso = peso;
		Genero = genero;
	}
	
	public void EmitirSom() {
		System.out.println("Latindo...");
	}
	
}
