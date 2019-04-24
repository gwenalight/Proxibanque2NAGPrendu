package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * La classe Conseiller regroupe l'ensemble de ses attributs, getters, setters et constructeurs
 * elle est candidate a etre peristée grace a entity
 * 
 * @author Nawal et Gwennhaelle
 */
@Entity
public class Conseiller {

	// attribut

	/**
	 * On definit l'id comme clé primaire
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idConseiller;
	private String login;
	private String password;
	private String name;
	private String firstName;

	/**
	 * OnetoMany permet de definir qu'un conseiller peut gérer plusieurs comptes
	 */
	@OneToMany(mappedBy = "conseiller")
	private Set<CompteBancaire> compte = new HashSet<CompteBancaire>();

	/**
	 * OnetoMany permet de definir qu'un conseiller peut gérer plusieurs clients
	 */
	@OneToMany(mappedBy = "conseiller")
	private Set<Client> cli = new HashSet<Client>();

	/**
	 * OnetoMany permet de definir qu'un conseiller peut effectuer plusieurs
	 * operations
	 */
	@OneToMany(mappedBy = "conseiller")
	List<OperationBancaire> operation = new ArrayList<OperationBancaire>();

	// constructor

	public Conseiller() {
		super();
	}

	public Conseiller(Long idConseiller, String name, String firstName) {
		super();
		this.idConseiller = idConseiller;
		this.name = name;
		this.firstName = firstName;
	}

	public Conseiller(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	// getter&setter
	public Set<Client> getCli() {
		return cli;
	}

	public void setCli(Set<Client> cli) {
		this.cli = cli;
	}

	public Long getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(Long idConseiller) {
		this.idConseiller = idConseiller;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<CompteBancaire> getCompte() {
		return compte;
	}

	public void setCompte(Set<CompteBancaire> compte) {
		this.compte = compte;
	}

	public List<OperationBancaire> getOperation() {
		return operation;
	}

	public void setOperation(List<OperationBancaire> operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "Conseiller [idConseiller=" + idConseiller + ", login=" + login + ", password=" + password + ", name="
				+ name + ", firstName=" + firstName + ", compte=" + compte + ", cli=" + cli + ", operation=" + operation
				+ "]";
	}

}
