package unlam.edu.ar;

public class RandoNumberGenerator implements NumberGenerator {
	
	public Integer generate(){
		return (int)(Math.random() * 10 + 1);
	}
	
}