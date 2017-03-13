package br.jus.PjeMonitor.view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.jus.PjeMonitor.App;
import br.jus.PjeMonitor.dao.ClienteRepo;
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
public class MonitorPjeController {

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
	private Button BtnListaAuds = new Button();

	@FXML
	private Button BtnListarMaq;

	@FXML
	private Button BtnListaVara;

	@FXML
	private Button BtnInserirVara;

	@FXML
	private ObservableList<Client> myClientComboBoxData = FXCollections.observableArrayList();

	@FXML
	private ObservableList<Audiencia> audData = FXCollections.observableArrayList();

	@Autowired
	private ClienteRepo clienteRepo;

	@FXML
	private void initialize() {

		populaTabela();

		// sets the combobox options
		List<Client> maqClientes = new ArrayList<>();
		maqClientes.addAll(clienteRepo.findAllClients());

		List<Client> clientes = new ArrayList<>();

		Client cliente = new Client("123", "tenso");

		clientes.add(new Client("asdad", "tenso"));
		clientes.add(new Client("cta123", "18vt"));

		myClientComboBoxData.addAll(maqClientes);

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

	}

	//TODO inserir as audiências
	public void populaTabela() {
		
		audData.add(new Audiencia("12123123213213", LocalDate.now(), "sim"));
		audData.add(new Audiencia("22222222222222", LocalDate.now(), "nao"));
		audData.add(new Audiencia("22222222222222", LocalDate.now(), "nao"));
		audData.add(new Audiencia("55555555555555", LocalDate.now(), "sim"));
		audData.add(new Audiencia("6666666666666", LocalDate.now(), "nao"));
		audData.add(new Audiencia("7777777777777", LocalDate.now(), "nao"));
		audData.add(new Audiencia("8888888888888", LocalDate.now(), "sim"));
		audData.add(new Audiencia("99999999999999", LocalDate.now(), "nao"));
		audData.add(new Audiencia("100010110101001", LocalDate.now(), "nao"));

		audTable.setItems(getAudData());

		audId.setCellValueFactory(cellData -> cellData.getValue().processoProperty());
		dataId.setCellValueFactory(cellData -> cellData.getValue().dataProperty());
		assId.setCellValueFactory(cellData -> cellData.getValue().assinadoProperty());
	}

	public void carregaMaquinas() {
		// TODO carrega as maquinas que tem audiencias
		System.out.println("nao implementado ainda");

	}

	public ObservableList<Audiencia> getAudData() {
		return audData;
	}

	public void setAudData(ObservableList<Audiencia> audData) {
		this.audData = audData;
	}

	
	
}
