package com.ejemplo.vaadin.admusuarios;

import com.ejemplo.vaadin.entidades.Usuario;
import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.validator.EmailValidator;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Form;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class UsuarioForm extends Form {
	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	//@AutoGenerated
	//private AbsoluteLayout mainLayout;

	@AutoGenerated
	private Button btnInsertar;

	@AutoGenerated
	private Button btnReset;

	@AutoGenerated
	private TextField txtClave;

	@AutoGenerated
	private TextField txtEmail;

	@AutoGenerated
	private TextField txtApellidos;

	@AutoGenerated
	private TextField txtNombre;

	@AutoGenerated
	private Label label_1;

	private static final long serialVersionUID = 1L;

	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public UsuarioForm() {
	
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// label_1
		label_1 = new Label();
		label_1.setImmediate(false);
		label_1.setWidth("-1px");
		label_1.setHeight("-1px");
		label_1.setValue("Mant. de Usuarios");
		//mainLayout.addComponent(label_1, "top:20.0px;left:70.0px;");
		
		// txtNombre
		txtNombre = new TextField();
		txtNombre.setCaption("Nombre:");
		txtNombre.setImmediate(false);
		txtNombre.setWidth("160px");
		txtNombre.setHeight("-1px");
		txtNombre.setRequired(true);
		txtNombre.setRequiredError("Debes escribir un nombre");
		//mainLayout.addComponent(txtNombre, "top:100.0px;left:40.0px;");
		
		// txtApellidos
		txtApellidos = new TextField();
		txtApellidos.setCaption("Apellidos:");
		txtApellidos.setImmediate(false);
		txtApellidos.setWidth("337px");
		txtApellidos.setHeight("-1px");
		txtApellidos.setRequired(true);
		txtApellidos.setRequiredError("Debes escribir los apellidos");
		//mainLayout.addComponent(txtApellidos, "top:100.0px;left:223.0px;");
		
		// txtEmail
		txtEmail = new TextField();
		txtEmail.setCaption("Email:");
		txtEmail.setImmediate(false);
		txtEmail.setWidth("320px");
		txtEmail.setHeight("-1px");
		txtEmail.setRequired(true);
		txtEmail.addValidator(new EmailValidator("El email es obligatorio"));
		//mainLayout.addComponent(txtEmail, "top:160.0px;left:40.0px;");
		
		// txtClave
		txtClave = new TextField();
		txtClave.setCaption("Clave:");
		txtClave.setImmediate(false);
		txtClave.setWidth("177px");
		txtClave.setHeight("-1px");
		txtClave.setRequired(true);
		txtClave.setRequiredError("Debes escribir una clave");
		//mainLayout.addComponent(txtClave, "top:160.0px;left:383.0px;");
		
		// btnReset
		btnReset = new Button();
		btnReset.setCaption("Limpiar");
		btnReset.setImmediate(true);
		btnReset.setWidth("180px");
		btnReset.setHeight("-1px");
		//mainLayout.addComponent(btnReset, "top:220.0px;left:40.0px;");
		
		// btnInsertar
		btnInsertar = new Button();
		btnInsertar.setCaption("Insertar Usuario");
		btnInsertar.setImmediate(true);
		btnInsertar.setWidth("183px");
		btnInsertar.setHeight("-1px");
		//mainLayout.addComponent(btnInsertar, "top:214.0px;left:383.0px;");
		
		
		addField("txtNombre", txtNombre);
		addField("txtApellidos", txtApellidos);
		addField("txtEmail", txtEmail);
		addField("txtClave", txtClave);
		addField("btnReset", btnReset);
		addField("btnInsertar", btnInsertar);
		
		
		//return mainLayout;
	}

	public void entidadAFormulario(Usuario usuario){
		txtNombre.setValue(usuario.getNombres());
		txtApellidos.setValue(usuario.getApellidos());
		txtEmail.setValue(usuario.getCorreo());
		txtClave.setValue(usuario.getClave());
	}
	
	public Usuario formularioAEntidad(){
		Usuario u = new Usuario();
		
		u.setNombres(txtNombre.getValue().toString());
		u.setApellidos(txtApellidos.getValue().toString());
		u.setCorreo(txtEmail.getValue().toString());
		u.setClave(txtClave.getValue().toString());
		return u;
	}

	public Button getBtnInsertar() {
		return btnInsertar;
	}

	public void setBtnInsertar(Button btnInsertar) {
		this.btnInsertar = btnInsertar;
	}

	public Button getBtnReset() {
		return btnReset;
	}

	public void setBtnReset(Button btnReset) {
		this.btnReset = btnReset;
	}

	public TextField getTxtClave() {
		return txtClave;
	}

	public void setTxtClave(TextField txtClave) {
		this.txtClave = txtClave;
	}

	public TextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(TextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public TextField getTxtApellidos() {
		return txtApellidos;
	}

	public void setTxtApellidos(TextField txtApellidos) {
		this.txtApellidos = txtApellidos;
	}

	public TextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(TextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public Label getLabel_1() {
		return label_1;
	}

	public void setLabel_1(Label label_1) {
		this.label_1 = label_1;
	}
	
	
	

}
