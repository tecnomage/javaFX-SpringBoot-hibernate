package br.jus.PjeMonitor.view;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.jus.PjeMonitor.App;
import br.jus.PjeMonitor.model.Audiencia;
import br.jus.PjeMonitor.model.Client;
import de.felixroske.jfxsupport.FXMLController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.StringConverter;

@FXMLController
public class MonitorPjeControllerOld {

	@FXML
	private TableView<Audiencia> audTable;

	@FXML
	private TableColumn<Audiencia, String> audId;

	@FXML
	private TableColumn<Audiencia, LocalDate> dataId;

	@FXML
	private TableColumn<Audiencia, String> assId;

	@FXML
	private ComboBox<Client> clientcomboBox;

	@FXML
	private Button BtnListaId = new Button();

	@FXML
	private Button BtnListarMaq;

	private ObservableList<Client> myClientComboBoxData = FXCollections.observableArrayList();

	// referencia a aplicacao principal
	private App app;

	// @Autowired
	// ClientRepo clientRepo;

	public MonitorPjeControllerOld() {

	}

	@FXML
	private void initialize() {
		audId.setCellValueFactory(cellData -> cellData.getValue().processoProperty());
		dataId.setCellValueFactory(cellData -> cellData.getValue().dataProperty());
		assId.setCellValueFactory(cellData -> cellData.getValue().assinadoProperty());

		Client client = new Client("teste123", "21 vt");

		// sets the combobox options
		myClientComboBoxData.add(client);
		myClientComboBoxData.add(new Client("cta122223", "10 vt"));
		myClientComboBoxData.add(new Client("cta122223", "17 vt"));
		myClientComboBoxData.add(new Client("cta120337", "18 vt"));

		clientcomboBox.setItems(myClientComboBoxData);

		clientcomboBox.setCellFactory((comboBox) -> {
			return new ListCell<Client>() {
				@Override
				protected void updateItem(Client item, boolean empty) {
					super.updateItem(item, empty);

					if (item == null || empty) {
						setText(null);
					} else {
						setText(item.getVara());
					}
				}
			};
		});

		clientcomboBox.setConverter(new StringConverter<Client>() {

			@Override
			public String toString(Client maquina) {
				if (maquina == null) {
					return null;
				} else {
					return maquina.getVara();
				}
			}

			@Override
			public Client fromString(String string) {
				// TODO Auto-generated method stub
				return null;
			}
		});

		// clientcomboBox.setOnAction((event) -> {
		// selectedPerson = myComboBox.getSelectionModel().getSelectedItem();
		// outputTextArea.appendText("ComboBox Action (selected: " +
		// selectedPerson.toString() + ")\n");
		// });

		// TODO setar para o botao da view
		// audTable.getSelectionModel().selectedItemProperty()
		// .addListener((observable, oldValue, newValue)-> show);

		/*
		 * BtnListaId.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
		 * 
		 * mouseEvent();
		 * 
		 * });
		 */

	}

	// public void setMainApp(MainApp mainApp) {
	// this.mainapp = mainApp;
	//
	// audTable.setItems(mainApp.getAudData());
	//
	// }

	/*
	 * TODO nesse método deve ser buscado uma entidade Client para editar os
	 * dados da máquina de audiência
	 */
	/*
	 * @FXML private void EditaClient(ActionEvent e) {
	 * System.out.println("botao listar clicado");
	 * 
	 * }
	 */

	// TODO em caso de erro enviar msg de erro
	@FXML
	public void mouseEvent() {
		Client client = new Client(1, "cta 12344", "18 vt");

	}

	public ObservableList<Client> getMyClientComboBoxData() {
		return myClientComboBoxData;
	}

	public void setMyClientComboBoxData(ObservableList<Client> myClientComboBoxData) {
		this.myClientComboBoxData = myClientComboBoxData;
	}

	// public void setMainApp(MainApp mainApp) {
	// this.app = mainApp;
	//
	// audTable.setItems(mainApp.getAudData());
	//
	// }

}
