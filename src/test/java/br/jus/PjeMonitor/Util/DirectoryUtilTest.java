package br.jus.PjeMonitor.Util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Matchers.isNotNull;
import static org.hamcrest.MatcherAssert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DirectoryUtilTest {

	@Before
	public void criaDirectoryUtil() {

	}

	@Test
	public void TestaSeListagemNaoRetornaNulo() {
		List<String> lista = new ArrayList<>();

		lista.addAll(DirectoryUtil.ListaDiretórios("CTA146063"));

		assertThat(lista, not(empty()));
	}



	@Test
	public void DeveSepararDiretorioEmClientes() {
		
	}
	
}


