package poo;

public class Main {

	public static void main(String[] args) {
		
		
//		Cliente c = new Cliente();
//		c.setCPF("123456789");
//		c.setNome("Jo�o Ant�nio");		
//		
//		System.out.println("O nome do cliente �: " + c.getNome());
		
		
		
		Humano danilo = new Humano("Danilo", 92, 1.92, 36);
		danilo.Andar();
		System.out.println("O IMC de " + danilo.Nome + " �: " + danilo.Imc + " e o seu g�nero � " + danilo.Genero + ". Possui p�lo? " + danilo.PossuiPelo);
		danilo.EmitirSom();	
		danilo.EmitirSom("Falando enquando dar aula");
		
		Humano silvio = new Humano("Silvio", 86, 1.75, 21);
		silvio.Andar();
		System.out.println("O IMC do " + silvio.Nome + " �: " + silvio.Imc + " e o seu g�nero � " + silvio.Genero + ". Possui p�lo? " + silvio.PossuiPelo);
		silvio.EmitirSom();
		
		Humano stephanie = new Humano("Stephanie", 61, 1.67, 22);
		stephanie.Genero = "Feminino";
		stephanie.Andar();
		System.out.println("O IMC do " + stephanie.Nome + " �: " + stephanie.Imc + " e o seu g�nero � " + stephanie.Genero + ". Possui p�lo? " + stephanie.PossuiPelo);
		stephanie.EmitirSom();
		
		
		
		
		Cachorro ragna = new Cachorro(3, 1, "Macho");
		System.out.println("O Ragna possui " + ragna.Idade + " anos, pesa " + ragna.Peso + "kg e � do g�nero " + ragna.Genero + ". Possui p�lo? " + ragna.PossuiPelo);
		ragna.EmitirSom();
		
		Cachorro amy = new Cachorro(5, 8, "F�mea");
		System.out.println("O Amy possui " + amy.Idade + " anos, pesa " + amy.Peso + "kg e � do g�nero " + amy.Genero + ". Possui p�lo? " + amy.PossuiPelo);
		amy.EmitirSom();		
		
		
		
		
		Jabuti doroteia = new Jabuti(5);
		doroteia.Nome = "Dorot�ia";
		System.out.println(doroteia.Nome + " possui " + doroteia.Idade + " anos. Possui p�lo? " + doroteia.PossuiPelo);
		doroteia.EmitirSom();
		

	}

}
