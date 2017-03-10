package br.jus.PjeMonitor.Util;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DirectoryUtil {

	/*
	 * para ver se os arquivos, foram enviados verificando se existe o arquivo
	 * "Gravação final"
	 */
	private String tombo;
	private File[] arquivos;

	// um arraylist de Clients, que depois lista os clients para a view

	public DirectoryUtil(String tombo) {
		this.tombo = tombo;
	}

	// listará as maáquinas
	public List<String> ListaDiretórios() {
		File[] arquivos = new File("\\\\" + this.tombo + "\\c$\\FIDELIS\\").listFiles();
		List<String> arq = new ArrayList<>();
		for (File s : arquivos) {
			arq.add(s.getAbsolutePath());

		}
		return arq;
	}

	// TODO aqui deve retornar um String com arquivos terminados com
	public List<String> TerminaCom() {

		return null;

	}

}
