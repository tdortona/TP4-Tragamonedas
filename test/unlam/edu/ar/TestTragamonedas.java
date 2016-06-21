package unlam.edu.ar;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTragamonedas {

	@Test
	public void queLosTamboresSeInicialicen(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		
		assertTrue(miTragamonedas.primerTambor.getPosicion() == 5 &&
				   miTragamonedas.segundoTambor.getPosicion() == 5 &&
				   miTragamonedas.tercerTambor.getPosicion() == 5
				  );
	}
	
	@Test
	public void queSeCreeUnNumeroAleatorioEntreUnoYDiez() {
		RandoNumberGenerator newGenerator = new RandoNumberGenerator();
		Integer numeroAleatorio = newGenerator.generate();
		assertTrue(numeroAleatorio >0 && numeroAleatorio <= 10);
	}
	
	@Test
	public void queEntreguePremioONo(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		
		assertTrue(miTragamonedas.entregaPremio());
	}
	
}
