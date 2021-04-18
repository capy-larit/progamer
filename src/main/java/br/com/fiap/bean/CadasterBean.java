package br.com.fiap.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.fiap.dao.CadasterDAO;
import br.com.fiap.model.Cadaster;


@Named
@RequestScoped
public class CadasterBean {
	
	private Cadaster cadaster = new Cadaster();
	
	public void save() {
		new CadasterDAO().save(this.cadaster);
		
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage("User successfully registered "));
		
	}
	
	public List<Cadaster> getCadasters() {
		return new CadasterDAO().getAll();
		
	}

	public Cadaster getCadaster() {
		return cadaster;
	}

	public void setCadaster(Cadaster cadaster) {
		this.cadaster = cadaster;
	}
	
	

}
