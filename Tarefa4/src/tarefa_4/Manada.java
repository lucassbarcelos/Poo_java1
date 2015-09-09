package tarefa_4;
import java.util.ArrayList;
import java.util.List;

public abstract class Manada {	
	List<Animal> animais = new ArrayList<Animal>();		
	
	public List<Animal> getAnimais() {
		return animais;
	}
	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}
	public void addAnimal(Animal n){
		animais.add(n);
	}
	
	
	public String estourar(){
		String som = "";
		for(Animal i : animais){
			som += i.fazerBarulho();
			som += getDiv();
		}
		 return som;
	}
	
	public abstract String getDiv(); 
		
	
}