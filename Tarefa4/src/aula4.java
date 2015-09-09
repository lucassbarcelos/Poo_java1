import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class aula4 {

	public static void main(String[] args) {
		List<String>nomes = new ArrayList<String>();
		String[] aux = {"Leonardo","Diana"};
		List<String> nomes2 =Arrays.asList(aux);
		System.out.println(nomes.size());
		nomes.add("Lucas");
		System.out.println(nomes);
		System.out.println(nomes.size());
		nomes.add(0,"Barcelos");
		System.out.println(nomes);
		System.out.println(nomes.size());
		nomes.addAll(nomes2);
		nomes.remove("Lucas");
		System.out.println(nomes);
		System.out.println(nomes.size());
		
		for(String n:nomes){
			System.out.println(n);
		}
	}

}
