package br.jus.PjeMonitor;

import org.springframework.beans.factory.annotation.Autowired;

//import br.jus.PjeMonitor.dao.ClienteRepo;
import br.jus.PjeMonitor.model.Client;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ClientController {

	@FXML
	private TextField tombo;
	@FXML
	private TextField vara;

//	@Autowired
//	ClienteRepo clientRepository;

	private Stage VaraStage;
	private Client client;

	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {

	}

	/**
	 * Sets the stage of this dialog.
	 * 
	 * @param varaStage
	 */
	public void setDialogStage(Stage varaStage) {
		this.VaraStage = varaStage;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public boolean SalvaClient(Client client) {

		try {
			//clientRepository.save(client);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
