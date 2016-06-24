package unlam.edu.ar;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTragamonedas {	
	
	@Test
	public void los3TamboresDelTragamonedasEstanEnLaPosicion1(){
		Tragamonedas miTragamonedas = new Tragamonedas();
		
		assertTrue(miTragamonedas.primerTambor.getPosicion() == 1 &&
				   miTragamonedas.segundoTambor.getPosicion() == 1 &&
				   miTragamonedas.tercerTambor.getPosicion() == 1
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
		
		if(miTragamonedas.entregaPremio())
			assertTrue(miTragamonedas.entregaPremio());
	}
	
}
