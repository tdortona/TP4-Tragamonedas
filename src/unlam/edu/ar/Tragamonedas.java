package unlam.edu.ar;

public class Tragamonedas {
	
	Tambor primerTambor;
	Tambor segundoTambor;
	Tambor tercerTambor;
	
	FixNumberGenerator newGenerator = new FixNumberGenerator(1);
	
	public Tragamonedas(){
		this.primerTambor = new Tambor(newGenerator);
		this.segundoTambor = new Tambor(newGenerator);
		this.tercerTambor = new Tambor(newGenerator);
	}

	public void activar(){
		this.primerTambor.girar();
		this.segundoTambor.girar();
		this.tercerTambor.girar();
	}

	public Boolean entregaPremio(){

		return this.primerTambor.getPosicion() == this.segundoTambor.getPosicion() &&
			   this.segundoTambor.getPosicion() == this.tercerTambor.getPosicion();
			
	}
	
}
