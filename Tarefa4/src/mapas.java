
public class mapas {
import java.util.Map;

import javax.print.DocFlavor.STRING;

import java.util.HashMap;
	public static void main(String[] args) {
		Map<String,String> paises = new HashMap<String, String>();
		paises.put("Brasil","Portugues");
		paises.put("Argentina","Espanho");
		System.out.println(paises.get("Argentina")));
		System.out.println(paises.containsKey("Argentina"));
		paises.remove("Argentina");
		System.out.println();
	}

}
