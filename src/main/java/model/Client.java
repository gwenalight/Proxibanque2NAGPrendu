package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * La classe Client regroupe toutes les informations d'un nouveau ou ancien
 * client qu'on va persister dans la BD
 * 
 * @author Nawal et Gwennhaelle
 */
@Entity
public class Client {

	/**
	 * On definit l'id comme clé primaire
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idClient;

	private String name;
	private String firstName;
	private String email;
	private String adress;
	private String postalCode;
	private String city;
	private String number;

	/**
	 * OnetoMany permet de definir qu'un client peut avoir plusieurs comptes
	 */
	@OneToMany(mappedBy = "client")
	private Set<CompteBancaire> compte = new HashSet<CompteBancaire>();

	/**
	 * ManyToOne permet de definir que plusieurs clients appartiennet à un seul
	 * conseiller
	 */
	@ManyToOne
	@JoinColumn(name = "conseiller_id")
	private Conseiller conseiller;

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public Client() {
		super();
	}

	public Client(String name, String firstName) {
		super();
		this.name = name;
		this.firstName = firstName;
	}

	public Client(Set<CompteBancaire> compte) {
		super();
		this.compte = compte;
	}

	public Client(String name, String firstName, String email, String adress, String postalCode, String city,
			String number, Set<CompteBancaire> compte, Conseiller conseiller) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.email = email;
		this.adress = adress;
		this.postalCode = postalCode;
		this.city = city;
		this.number = number;
		this.compte = compte;
		this.conseiller = conseiller;
	}

	public Client(Long idClient, String name, String firstName, String email, String adress, String postalCode,
			String city, String number) {
		super();
		this.idClient = idClient;
		this.name = name;
		this.firstName = firstName;
		this.email = email;
		this.adress = adress;
		this.postalCode = postalCode;
		this.city = city;
		this.number = number;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public Set<CompteBancaire> getCompte() {
		return compte;
	}

	public void setCompte(Set<CompteBancaire> compte) {
		this.compte = compte;
	}

	public Client(String name, String firstName, String email, String adress, String postalCode, String city,
			String number) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.email = email;
		this.adress = adress;
		this.postalCode = postalCode;
		this.city = city;
		this.number = number;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", name=" + name + ", firstName=" + firstName + ", email=" + email
				+ ", adress=" + adress + ", postalCode=" + postalCode + ", city=" + city + ", number=" + number + "]";
	}

}
