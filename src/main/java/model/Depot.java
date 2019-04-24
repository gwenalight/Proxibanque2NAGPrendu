package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * La classe Depot herite de la classe OperationBancaire
 * elle sera définie dans la BD comme type de la table OperationBancaire
 * @author Nawal et Gwennhaelle
 */
@Entity
@DiscriminatorValue("Depot")
public class Depot extends CompteBancaire {

	public Depot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Depot(Long idCompte, double sold, String openDate) {
		super(idCompte, sold, openDate);
		// TODO Auto-generated constructor stub
	}

}
