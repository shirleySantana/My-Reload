package view;

import control.MyMain;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Controlador de la clase MyMain.
 * @author Shirley Santana
 * @version 1.0
 */
public class MyController {
	MyMain myMain;
	private Stage dialogStage;
   

		
	
	@FXML
    private BorderPane mainBorderPane;
	
	@FXML
    private ImageView imagenPerfil;
	
	
	@FXML
    private void initialize() {

    }
	
	/**
	 * Abre una nueva ventana con la información del perfil antes de ser enviada
	 *  
	 */
 
	@FXML
    private void handleSend() {
        myMain.showProfileDetails();      
    }


	/**
	 * Permite al controlador acceder a elementos de la IU
	 * @param myGitHub nuestra clase que contiene los elementos de la ui
	 */
	public void setMyMain(MyMain myReload) {
		this.myMain= myReload;
	}
	/**
	 * Carga la escena en la stage generada
	 * @param dialogStage
	 */
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
        this.dialogStage.centerOnScreen();
        this.dialogStage.setResizable(false);
        
    }
}