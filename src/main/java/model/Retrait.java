package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * La classe Retrait herite de la classe OperationBancaire
 * elle sera définie dans la BD comme type de la table OperationBancaire
 * @author Nawal et Gwennhaelle
 */
@Entity
@DiscriminatorValue("Retrait")
public class Retrait extends OperationBancaire {

	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retrait(Long idOperation, String operationDate, double montant) {
		super(idOperation, operationDate, montant);
		// TODO Auto-generated constructor stub
	}

}
