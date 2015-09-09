public class Pessoa {
	public String nome;
	
	
	public String cumprimentar(){
		return "ola, meu nome é"+this.nome;
	}
	public Pessoa(){
		System.out.println("Metodo construtor");
	}
}
