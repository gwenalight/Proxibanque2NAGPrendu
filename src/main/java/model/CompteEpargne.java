package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * La classe CompteEpargne herite de la classe CompteBancaire
 * elle sera définie dans la BD comme type de la table CompteBancaire
 * @author Nawal et Gwennhaelle
 */
@Entity
@DiscriminatorValue("CEpargne")
public class CompteEpargne extends CompteBancaire {
	public static final double TAUXREMUNERATION = 0.03;

	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(Long idCompte, double sold, String openDate) {
		super(idCompte, sold, openDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Long getIdCompte() {
		// TODO Auto-generated method stub
		return super.getIdCompte();
	}

	@Override
	public void setIdCompte(Long idCompte) {
		// TODO Auto-generated method stub
		super.setIdCompte(idCompte);
	}

	@Override
	public double getSold() {
		// TODO Auto-generated method stub
		return super.getSold();
	}

	@Override
	public void setSold(double sold) {
		// TODO Auto-generated method stub
		super.setSold(sold);
	}

	@Override
	public String getOpenDate() {
		// TODO Auto-generated method stub
		return super.getOpenDate();
	}

	@Override
	public void setOpenDate(String openDate) {
		// TODO Auto-generated method stub
		super.setOpenDate(openDate);
	}

	@Override
	public String toString() {
		return "CompteEpargne [getIdCompte()=" + getIdCompte() + ", getSold()=" + getSold() + ", getOpenDate()="
				+ getOpenDate() + "]";
	}

}
