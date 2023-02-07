package Testing.SerieVideojuegos;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class SerieTest {
	Serie serie1 = new Serie();
	Serie serie2 = new Serie();

	@Test
	@DisplayName("Test del setTitulo con assertThat")
	public void testSetTitulo() {
		serie1.setTitulo("Serie 1");
		assertThat(serie1.getTitulo(), is(equalTo("Serie 1")));
	}

	@Test
	@DisplayName("Test del setnumeroTemporadas con assertThat")
	public void testSetnumeroTemporadas() {
		serie1.setnumeroTemporadas(5);
		assertThat(serie1.getnumeroTemporadas(), is(equalTo(5)));
	}

	@Test
	@DisplayName("Test del setGenero con assertThat")
	public void testSetGenero() {
		serie1.setGenero("Drama");
		assertThat(serie1.getGenero(), is(equalTo("Drama")));
	}

	@Test
	@DisplayName("Test del setcreador con assertThat")
	public void testSetcreador() {
		serie1.setcreador("Creador 1");
		assertThat(serie1.getcreador(), is(equalTo("Creador 1")));
	}

	@Test
	@DisplayName("Test del método entregar con assertThat en isEntregado")
	public void testEntregar() {
		serie1.entregar();
		assertThat(serie1.isEntregado(), is(equalTo(true)));
	}

	@Test
	@DisplayName("Test del método devolver con assertThat en isEntregado")
	public void testDevolver() {
		serie1.devolver();
		assertThat(serie1.isEntregado(), is(equalTo(false)));
	}

	@Test
	@DisplayName("Test del método compareTo con assertThat en MENOR")
	public void testCompareToMenor() {
		serie1.setTitulo("Serie 1");
		serie1.setnumeroTemporadas(3);
		serie2.setTitulo("Serie 2");
		serie2.setnumeroTemporadas(5);
		assertThat(serie1.compareTo(serie2), is(equalTo(Serie.MENOR)));
	}
	
	@Test
	@DisplayName("Test del método compareTo con assertThat en IGUAL")
	public void testCompareToIgual() {
		serie1.setTitulo("Serie 1");
		serie1.setnumeroTemporadas(3);
		serie2.setTitulo("Serie 2");
		serie2.setnumeroTemporadas(3);
		assertThat(serie1.compareTo(serie2), is(equalTo(Serie.IGUAL)));

}
	@Test
	@DisplayName("Test del método compareTo con assertThat en IGUAL")
	public void testCompareToMayor() {
		serie1.setTitulo("Serie 1");
		serie1.setnumeroTemporadas(3);
		serie2.setTitulo("Serie 2");
		serie2.setnumeroTemporadas(3);
		assertThat(serie1.compareTo(serie2), is(equalTo(Serie.MAYOR)));
	}
}
	