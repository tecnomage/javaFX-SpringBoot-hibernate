package br.jus.PjeMonitor.view;

import java.io.IOException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import br.jus.PjeMonitor.App;
import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import de.felixroske.jfxsupport.FXMLView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/*
 * @AutoConfigurationPackage
 * 
 * @ComponentScan(basePackages = "br.jus.trt9.PjeMonitor")
 * 
 * @EnableAutoConfiguration
 */

@FXMLView(value = "visao.fxml")
public class VisaoView extends AbstractFxmlView {

	private Stage primaryStage;
	private BorderPane rootLayout;

	

	public VisaoView() {
			
		}

	
	private void showTableAudiencia() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(VisaoView.class.getResource("visao.fxml"));
			AnchorPane TableOverview = (AnchorPane) loader.load();

			// Set person overview into the center of root layout.
			rootLayout.setCenter(TableOverview);

			// Give the controller acckess to the main app.
			 MonitorPjeController controller = loader.getController();
			// controller.setMainApp();
			System.out.println("carregou main app");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	//FIXME nao carrega o rootLayout
	private void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(VisaoView.class.getResource("RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			MonitorPjeController controller = loader.getController();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void showCadastroClients() {

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(App.class.getResource("view/clientcadastro.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

			// Create the dialog Stage.
			Stage dialogStage = new Stage();
			dialogStage.setTitle("Cadastro de máquinas");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initOwner(primaryStage);
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}


	
	
	
}
