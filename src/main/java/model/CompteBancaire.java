package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * La classe CompteBancaire est caracterisée par ses getters et setters et est canditate a etre persitée grace a entity
 * et grace a inheritence et discriminatorcolumn elle va recuperer ses classes filles afin de les regrouper dans sa table comme type
 * il en existe deux typeS courant et epargne
 * 
 * 
 * @author Nawal et Gwennhaelle
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_Compte", discriminatorType = DiscriminatorType.STRING)
public class CompteBancaire {

	/**
	 * On definit l'id comme clé primaire
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCompte;
	private double numeroCompte;
	private double sold;
	private String openDate;

	/**
	 * OnetoMany permet de definir qu'un compte bancaire peut etre lié à plusieurs operation
	 */
	@OneToMany(mappedBy = "compteBancaire")
	List<OperationBancaire> operation = new ArrayList<OperationBancaire>();

	/**
	 * ManyToOne permet de definir que plusieurs ccompte appartiennet à un seul
	 * client
	 */
	@ManyToOne
	@JoinColumn(name = "client_id") // on nomme la colonne FK
	private Client client;

	/**
	 * ManyToOne permet de definir que plusieurs comptes sont gerés par un seul
	 * conseiller
	 */
	@ManyToOne
	@JoinColumn(name = "conseiller_id")
	private Conseiller conseiller;

	public CompteBancaire() {
		super();
	}

	public CompteBancaire(String openDate) {
		super();
		this.openDate = openDate;
	}

	public CompteBancaire(Client client) {
		super();
		this.client = client;
	}

	public CompteBancaire(double numeroCompte) {
		super();
		this.numeroCompte = numeroCompte;
	}

	public CompteBancaire(Long idCompte, double sold, String openDate) {
		super();
		this.idCompte = idCompte;
		this.sold = sold;
		this.openDate = openDate;
	}

	public Long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}

	public double getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(double numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSold() {
		return sold;
	}

	public void setSold(double sold) {
		this.sold = sold;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public List<OperationBancaire> getOperation() {
		return operation;
	}

	public void setOperation(List<OperationBancaire> operation) {
		this.operation = operation;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "CompteBancaire [idCompte=" + idCompte + ", numeroCompte=" + numeroCompte + ", sold=" + sold
				+ ", openDate=" + openDate + ", operation=" + operation + ", client=" + client + ", conseiller="
				+ conseiller + "]";
	}

}
