package poo;

public class Humano extends Mamifero {
	public String Nome = "Nome do ser humano";	
	public double Altura;
	public double Imc;
	
	public Humano(String nome, int peso, double altura, int idade) {
		Nome = nome;
		Peso = peso;
		Altura = altura;
		Idade = idade;
		
		Imc = Peso / (Altura * Altura);
	}
	
	public void Andar() {		
		System.out.println(Nome + ", que possui " + Altura + "m, está andando!");
	}
	
	public void EmitirSom() {
		System.out.println("Conversando...");
	}
	
	public void EmitirSom(String som) {
		System.out.println(som);
	}
}