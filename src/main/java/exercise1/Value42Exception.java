package exercise1;
import java.lang.RuntimeException;

public class Value42Exception extends RuntimeException{

	public Value42Exception(){
		System.out.println("Erreur car valeur égale à 42");
	}

}
