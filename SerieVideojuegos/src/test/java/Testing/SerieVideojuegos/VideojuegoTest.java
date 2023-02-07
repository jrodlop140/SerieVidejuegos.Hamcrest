package Testing.SerieVideojuegos;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class VideojuegoTest {
	Videojuego vj = new Videojuego();
	Videojuego vj1 = new Videojuego("Titulo1", "Compania1");
	Videojuego vj2 = new Videojuego("Titulo1", "Compania1");
	Videojuego vj3 = new Videojuego("Titulo2", "Compania2");

	@Test
	@DisplayName("Test de SetTitulo con Hamcrest")
	public void testGetTitulo() {
	    vj.setTitulo("Videojuego de prueba");
	    assertThat(vj.getTitulo(), is("Videojuego de prueba"));
	}

	@Test
	@DisplayName("Test de SetHorasEstimadas con Hamcrest")
	public void testSetHorasEstimadas() {
	    vj.setHorasEstimadas(200);
	    assertThat(vj.getHorasEstimadas(), is(200));
	}

	@Test
	@DisplayName("Test de SetGenero con Hamcrest")
	public void testSetGenero() {
	    vj.setGenero("Accion");
	    assertThat(vj.getGenero(), is("Accion"));
	}

	@Test
	@DisplayName("Test del metodo entrega con Hamcrest")
	public void testEntrega() {
	    vj.entregar();
	    assertThat(vj.isEntregado(), is(true));
	}

	@Test
	@DisplayName("Test del metodo devolver con Hamcrest")
	public void testDevolver() {
	    vj.devolver();
	    assertThat(vj.isEntregado(), is(false));
	}

	@Test
	@DisplayName("Test del metodo compareTo con Hamcrest horas estimadas Videojuego1 es menor que Videojuego2")
	public void testCompareToMenor() {
	    vj1.setHorasEstimadas(50);
	    vj2.setHorasEstimadas(100);
	    assertThat(vj1.compareTo(vj2), is(-1));
	}

	@Test
	@DisplayName("Test del metodo compareTo con Hamcrest horas estimadas Videojuego1 es igual que Videojuego2")
	public void testCompareToIgual() {
	    vj1.setHorasEstimadas(100);
	    vj2.setHorasEstimadas(100);
	    assertThat(vj1.compareTo(vj2), is(0));
	}

	@Test
	@DisplayName("Test del metodo compareTo con Hamcrest horas estimadas Videojuego1 es mayor que Videojuego2")
	public void testCompareToMayor() {
	    vj1.setHorasEstimadas(100);
	    vj2.setHorasEstimadas(50);
	    assertThat(vj1.compareTo(vj2), is(1));
	}

	@DisplayName("Test del metodo equals con Hamcrest")
	public void testEquals() {
	vj1.setTitulo("Titulo1");
	vj1.setcompañia("Compania1");
	vj2.setTitulo("Titulo1");
	vj2.setcompañia("Compania1");
	assertThat(vj1.equals(vj2), is(true));
	}

	@Test
	@DisplayName("Test del metodo equals con Hamcrest Videojuego1 no es igual a Videojuego3")
	public void testNotEquals() {
	vj1.setTitulo("Titulo1");
	vj1.setcompañia("Compania1");
	vj3.setTitulo("Titulo2");
	vj3.setcompañia("Compania2");
	assertThat(vj1.equals(vj3), is(false));
	}


}
