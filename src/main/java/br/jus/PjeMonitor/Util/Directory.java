package br.jus.PjeMonitor.Util;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import javax.swing.filechooser.FileFilter;

import org.apache.commons.io.FileUtils;

import br.jus.PjeMonitor.model.Client;

public class Directory {

	public static void main(String[] args) {

		
		Path path = Paths.get("\\\\" + "CTA146063" + "\\c$\\FIDELIS\\");

		List<Client> clients = new ArrayList<>();
		List<String> listaDiretorio = new ArrayList<>();
				

		try {
			String s = path.toString();

			Consumer<Object> c2 = System.out::println;
			c2.accept("imprimindo usando default methods" + s);


			File[] arquivos = new File("\\\\CTA146063\\c$\\FIDELIS\\").listFiles();
			
			// listaDiretorio.add(Arrays.toString(Files.newDirectoryStream(Paths.get("\\\\",
			// "CTA146063\\c$\\FIDELIS\\"))));

			// TODO funciona mas devo fazer o split
			/*
			 * Files.newDirectoryStream(Paths.get("\\\\", "CTA146063\\c$\\
			 * FIDELIS\\")).forEach( (System.out::println));
			 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String trataEntrada(String entrada) {

		return null;

	}

}
