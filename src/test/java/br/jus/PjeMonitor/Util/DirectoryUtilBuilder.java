package br.jus.PjeMonitor.Util;

import java.io.File;

public class DirectoryUtilBuilder {

	private String tombo;
	

	public DirectoryUtilBuilder(String tombo) {
		super();
		this.tombo = tombo;
		
	}

	
	public DirectoryUtilBuilder() {
	}

	public DirectoryUtil criaDirectoryUtilBuilder() {
		return new DirectoryUtil(tombo);
	}


}
