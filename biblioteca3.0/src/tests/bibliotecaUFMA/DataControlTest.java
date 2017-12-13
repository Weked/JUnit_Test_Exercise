package tests.bibliotecaUFMA;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import bibliotecaUFMA.DataControlClass;
import bibliotecaUFMA.biblioteca;

public class DataControlTest {
	DataControlClass control;
	biblioteca b;
	
	@Before
	public void setUp() throws Exception {
		control = new DataControlClass();
		b = new biblioteca();
	}
	
	//todas a funcoes a seguir se esperam que sua execucao 
	//retorne true, ou seja o procedimento foi bem executado
	
	@Test
	public void testCarregaDados() {
		assertNotNull(control.carregaDados(b));
		//fail("Not yet implemented");
	}

	@Test
	public void testSalvaDados() {
		//ha uma nota sobre erro neste treco de codigo no arquivo datacontrolclass
		assertTrue(control.salvaDados(b));
		//fail("Not yet implemented");
	}

	@Test
	public void testCarregaFuncionarios() {
		assertTrue(control.carregaFuncionarios());
		//fail("Not yet implemented");
	}

	@Test
	public void testCarregarLivros() {
		assertTrue(control.carregarLivros());
		//fail("Not yet implemented");
	}

	@Test
	public void testCarregaUsuarios() {
		assertTrue(control.carregaUsuarios());
		//fail("Not yet implemented");
	}

	@Test
	public void testSalvarFuncionarios() {
		assertTrue(control.salvarFuncionarios(b));
		//fail("Not yet implemented");
	}

	@Test
	public void testSalvarLivros() {
		assertTrue(control.salvarLivros(b));
		//fail("Not yet implemented");
	}

	@Test
	public void testSalvarUsuarios() {
		assertTrue(control.salvarUsuarios(b));
		//fail("Not yet implemented");
	}

}
