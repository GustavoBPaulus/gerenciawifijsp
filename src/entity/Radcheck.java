package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "radcheck")
public class Radcheck implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "value")
	private String value;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "situacao")
	private String situacao;
	
	


	
	
	public int getId() {
		return id;
	}










	public void setId(int id) {
		this.id = id;
	}








	public String getUsername() {
		return username;
	}






	public void setUsername(String username) {
		this.username = username;
	}




	public String getValue() {
		return value;
	}










	public void setValue(String value) {
		this.value = value;
	}










	public String getTipo() {
		return tipo;
	}










	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getSituacao() {
		return situacao;
	}





	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}





	public Radcheck(){
		
		
	}



	public Radcheck(String username, String value, String tipo, String situacao) {
		super();
	
		this.username = username;
		this.value = value;
		this.tipo = tipo;
		this.situacao = situacao;
	}





	
	
	
}
