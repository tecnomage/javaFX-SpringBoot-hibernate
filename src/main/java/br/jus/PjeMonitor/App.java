/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.jus.PjeMonitor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.jus.PjeMonitor.view.VisaoView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;

/**
 * @author Thomas Darimont
 */
@SpringBootApplication
public class App extends AbstractJavaFxApplicationSupport {

	/**
	 * Note that this is configured in application.properties
	 */
	@Value("${app.ui.title:PJe Midia Monitor}")
	private String windowTitle;

	
	
	public static void main(String[] args) {
		
		launchApp(App.class, VisaoView.class, args);
	}

}
