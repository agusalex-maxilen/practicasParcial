package regs;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class expresionesreg {


	public static void main (String [] args){
		System.out.println(numeroValido("01173434234"));
		
		/*Pattern patron = Pattern.compile("foo");
		
		Matcher matcher = patron.matcher("A buscar foo aqui! foo");
		
	
		while( matcher.find() )
		{
			System.out.println("Encontre " + matcher.group() + " comenzando en"
			+ matcher.start() + " y terminando en " + matcher.end());
		}*/
	}
	
	
	private static boolean numeroValido(String num){
	
		
		Pattern patron = Pattern.compile("\\(?\\d{3,4}\\)?"
				+ "\\s?(\\d{3,4})"
				+ "-?"
				+ "(\\d{3,4})");
		
		Matcher matcher = patron.matcher(num);


		
		
		return matcher.find();
	}
	

}