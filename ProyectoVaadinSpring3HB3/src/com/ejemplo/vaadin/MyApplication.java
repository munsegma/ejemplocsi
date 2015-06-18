package com.ejemplo.vaadin;



import com.ejemplo.vaadin.admusuarios.UsuarioForm;
import com.ejemplo.vaadin.entidades.Usuario;
import com.ejemplo.vaadin.servicios.ServicioUsuarios;
import com.sun.nio.sctp.Notification;
import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

import org.hibernate.validator.util.GetAnnotationParameter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Marc
 * @version
 */
public class MyApplication extends Application implements ClickListener {

	private static final long serialVersionUID = 1539466153154709086L;
	private UsuarioForm formUser = null;
    private Button btnReset = null;
    private Button btnInsert = null;
    private String saludo = "Hola";
	
	@Autowired
    ServicioUsuarios servicioUsuarios;

    @Override
    public void init() {
        Window mainWindow = new Window("Aplicacion");
        Label label = new Label("<h2>Ejemplo de Vaadin, Hibernate y Spring MVC/REST</h2>", Label.CONTENT_XHTML);
        mainWindow.addComponent(label);
        
        formUser = new UsuarioForm();
        
        btnReset = formUser.getBtnReset();
        btnInsert = formUser.getBtnInsertar();
        //Asociamos el listener a los botones
        btnReset.addListener(this);
        btnInsert.addListener(this);

        
        mainWindow.addComponent(formUser);
        setMainWindow(mainWindow);
    }
    
	@Override
	public void buttonClick(ClickEvent event) {
		formUser.getWindow().showNotification("Bot�n pulsado ");
		
		if (event.getSource() == btnInsert && formUser.isValid()){
			Usuario usuario = formUser.formularioAEntidad();
			Integer respuesta = getServicioUsuarios().guardarUsuario(usuario);
			System.out.println("Respuesta:" + respuesta.intValue());
			switch(respuesta.intValue()){
			case 0:
				formUser.getWindow().showNotification("Se ha guardado el usuario ");
				//Si hay que borrar el formulario
				break;
			case 1:
				formUser.getWindow().showNotification("Usuario no existe");
				break;
			case 2:
				formUser.getWindow().showNotification("No dispone de los permisos necesarios ");
				break;
			case 4:
				formUser.getWindow().showNotification("El usuario ya existe");
				break;
			default:
				formUser.getWindow().showNotification("Error al guardar el usuario");
				break;
			}
		}else
			formUser.getWindow().showNotification("Rellene los datos del formulario");
			
	}
    

    /**
     * Metodo que retorna el objeto injectado para que otras clases de la
     * aplicacion puedan usarlo
     *
     * @return El objeto ServicioUsuario injectado
     */
    public ServicioUsuarios getServicioUsuarios() {
        return servicioUsuarios;
    }
}
