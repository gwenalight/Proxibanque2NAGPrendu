package model;

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

/**
 * La classe OperationBancaire est caracterisée par ses getters et setters et est canditate a etre persitée grace a entity
 * et grace a inheritence et discriminatorcolumn elle va recuperer ses classes filles afin de les regrouper dans sa table comme type
 * il en existe deux typeS retrait et depot
 * 
 * 
 * @author Nawal et Gwennhaelle
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_Operation", discriminatorType = DiscriminatorType.STRING)
public class OperationBancaire {
	/**
	 * On definit l'id comme clé primaire
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idOperation;
	private String operationDate;
	private double montant;

	/**
	 * ManyToOne il peut y avoir plusieurs operations bancaire sur le meme comptes bancaire
	 */
	@ManyToOne
	@JoinColumn(name = "compteBancaire_id")
	private CompteBancaire compteBancaire;
	
	/**
	 * ManyToOne il peut y avoir plusieurs operations bancaire effectuées par un seul conseiller
	 */
	@ManyToOne
	@JoinColumn(name = "conseiller_id")
	private Conseiller conseiller;

	public OperationBancaire() {
		super();
	}

	public OperationBancaire(Long idOperation, String operationDate, double montant) {
		super();
		this.idOperation = idOperation;
		this.operationDate = operationDate;
		this.montant = montant;
	}

	public Long getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(Long idOperation) {
		this.idOperation = idOperation;
	}

	public String getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(String operationDate) {
		this.operationDate = operationDate;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public CompteBancaire getCompteBancaire() {
		return compteBancaire;
	}

	public void setCompteBancaire(CompteBancaire compteBancaire) {
		this.compteBancaire = compteBancaire;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	@Override
	public String toString() {
		return "OperationBancaire [idOperation=" + idOperation + ", operationDate=" + operationDate + ", montant="
				+ montant + ", compteBancaire=" + compteBancaire + ", conseiller=" + conseiller + "]";
	}

}
