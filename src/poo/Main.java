package poo;

public class Main {

	public static void main(String[] args) {
		
		
//		Cliente c = new Cliente();
//		c.setCPF("123456789");
//		c.setNome("João Antônio");		
//		
//		System.out.println("O nome do cliente é: " + c.getNome());
		
		
		
		Humano danilo = new Humano("Danilo", 92, 1.92, 36);
		danilo.Andar();
		System.out.println("O IMC de " + danilo.Nome + " é: " + danilo.Imc + " e o seu gênero é " + danilo.Genero + ". Possui pêlo? " + danilo.PossuiPelo);
		danilo.EmitirSom();	
		danilo.EmitirSom("Falando enquando dar aula");
		
		Humano silvio = new Humano("Silvio", 86, 1.75, 21);
		silvio.Andar();
		System.out.println("O IMC do " + silvio.Nome + " é: " + silvio.Imc + " e o seu gênero é " + silvio.Genero + ". Possui pêlo? " + silvio.PossuiPelo);
		silvio.EmitirSom();
		
		Humano stephanie = new Humano("Stephanie", 61, 1.67, 22);
		stephanie.Genero = "Feminino";
		stephanie.Andar();
		System.out.println("O IMC do " + stephanie.Nome + " é: " + stephanie.Imc + " e o seu gênero é " + stephanie.Genero + ". Possui pêlo? " + stephanie.PossuiPelo);
		stephanie.EmitirSom();
		
		
		
		
		Cachorro ragna = new Cachorro(3, 1, "Macho");
		System.out.println("O Ragna possui " + ragna.Idade + " anos, pesa " + ragna.Peso + "kg e é do gênero " + ragna.Genero + ". Possui pêlo? " + ragna.PossuiPelo);
		ragna.EmitirSom();
		
		Cachorro amy = new Cachorro(5, 8, "Fêmea");
		System.out.println("O Amy possui " + amy.Idade + " anos, pesa " + amy.Peso + "kg e é do gênero " + amy.Genero + ". Possui pêlo? " + amy.PossuiPelo);
		amy.EmitirSom();		
		
		
		
		
		Jabuti doroteia = new Jabuti(5);
		doroteia.Nome = "Dorotéia";
		System.out.println(doroteia.Nome + " possui " + doroteia.Idade + " anos. Possui pêlo? " + doroteia.PossuiPelo);
		doroteia.EmitirSom();
		

	}

}
