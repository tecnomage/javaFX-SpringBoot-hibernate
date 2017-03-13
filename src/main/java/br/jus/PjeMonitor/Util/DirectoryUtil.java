package br.jus.PjeMonitor.Util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthSeparatorUI;

import br.jus.PjeMonitor.model.Audiencia;
import br.jus.PjeMonitor.model.Client;
import javafx.util.converter.LocalDateStringConverter;

public class DirectoryUtil {

	/*
	 * para ver se os arquivos, foram enviados verificando se existe o arquivo
	 * "Gravação final"
	 */
	private String tombo;
	private Client cliente;
	private List<Audiencia> auds;
	private File[] arquivos;

	// um arraylist de Clients, que depois lista os clients para a view

	public DirectoryUtil(String tombo) {
		this.tombo = tombo;
	}

	// TODO refatorar isso para virar Static
	static public List<String> ListaDiretórios(String tombo) {
		List<String> arq;
		arq = new ArrayList<>();
		try {
			File[] arquivos = new File("\\\\" + tombo + "\\c$\\FIDELIS\\").listFiles();
			for (File aud : arquivos) {
				if (aud.isDirectory()) {
					LocalDate dataAud;
					arq.add(aud.getName());
					
					//TODO refatorar para usar BasicFileAttributes					
					Path path = Paths.get(aud.getAbsolutePath());
					Map f = Files.readAttributes(path, "creationTime");
					String[] data = new String[4]; 
					//data[0]  = f.get("creationTime").toString().split("-");
					System.out.println(f.get("creationTime").toString().split("-"));
					
					
					//TODO insere a data
					//dataAud =  LocalDate.of();
				
					
					
					
					//processo data assinado
					//auds.add(aud., aud.get )
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arq;
	}

	static public List<String> listaAudiencia(String tombo) {

		File[] arquivos = new File("\\\\" + tombo + "\\c$\\FIDELIS\\").listFiles();

		List<Audiencia> auds = new ArrayList<>();
		/*for (String AR : auds) {

		}*/

		return null;
	}

	// TODO aqui deve retornar um String com arquivos terminados com
	public List<String> TerminaCom() {

		return null;

	}

}
