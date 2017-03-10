package br.jus.PjeMonitor.Util;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Lists;
import org.hamcrest.core.IsNot;
import org.junit.Before;
import org.junit.Test;


public class DirectoryUtilTest {

	@Before
	public void criaDirectoryUtil() {

	}

	@Test
 	public void TestaSeListagemNaoRetornaNulo() {
		List<String> lista = new ArrayList<>();
		
		DirectoryUtilBuilder dirBuilder = new DirectoryUtilBuilder("CTA146063");
		DirectoryUtil directoryUtil = dirBuilder.criaDirectoryUtilBuilder();
		
		lista.addAll(directoryUtil.ListaDiretórios());
		
		assertThat(lista, is(equals("teste")));
		
			}

}
