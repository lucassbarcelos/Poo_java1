package aulas;



public class main {

	public main(String[] args) {
		Pessoa mulher = new Pessoa('diana');
		System.out.println(mulher.cumprimentar());
		Mulher clone = (Mulher) mulher;
		System.out.println(mulher instanceof Mulher);

	}

}
