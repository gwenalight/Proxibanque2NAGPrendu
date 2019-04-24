package service;

import java.util.List;
import java.util.Set;

import model.Client;
import model.CompteBancaire;
import model.CompteCourant;
import model.CompteEpargne;

import persistance.PersistanceDAO;


/**
 * Cette classe d'implémentation permettra de faire le lien entre les
 * contrats(méthodes) situé dans l'interface ConseillerSrvice et
 * l'utilisation des méthodes dans la classe PersitanceDAo.
 *
 * @author Nawal et Gwennhaelle
 */
public class ServiceImplementation implements ConseillerService {

	private PersistanceDAO daop = new PersistanceDAO();

	@Override
	public void creerClient(Client c) {
		// TODO Auto-generated method stub
		if (c != null) {
			daop.save(c);
		}
	}

	@Override
	public void supprimerClient(Client c) {
		// TODO Auto-generated method stub
		daop.delete(c);
	}

	@Override
	public void consulterCompte(Client c) {
		// TODO Auto-generated method stub
		daop.readinfoClient(c);
	}

	@Override
	public void creerCompte(CompteBancaire c) {
		// TODO Auto-generated method stub
		daop.createAccompte(c);
	}

	@Override
	public void virement(CompteEpargne cbe, CompteCourant cbc, double i) {
		// TODO Auto-generated method stub
		double a = cbc.getSold();
		a = a - i;
		cbc.setSold(a);
		double b = cbe.getSold();
		b = b + i;
		cbe.setSold(b);

	}

	@Override
	public void virement(CompteCourant cbc, CompteEpargne cbe, double i) {
		// TODO Auto-generated method stub
		double a = cbc.getSold();
		a = a - i;
		cbc.setSold(a);
		double b = cbe.getSold();
		b = b + i;
		cbe.setSold(b);
	}

	@Override
	public void modifClient(Client c, String number) {
		// TODO Auto-generated method stub
		c.setNumber(number);
	}

	@Override
	public void modifClient(Client c, String firstname, String surname) {
		// TODO Auto-generated method stub
		daop.modiFN(c, "name", "firstName");
	}

	@Override
	public void modifClient(Client c, String adress, String city, String postalCode) {
		// TODO Auto-generated method stub
		c.setAdress(adress);
		c.setCity(city);
		c.setPostalCode(postalCode);
	}

	@Override
	public void modifClient(Client c, String firstname, String surname, String adress, String city, String postalCode,
			String number) {
		// TODO Auto-generated method stub
		c.setFirstName(firstname);
		c.setName(surname);
		c.setAdress(adress);
		c.setCity(city);
		c.setPostalCode(postalCode);
		c.setNumber(number);
	}

	@Override
	public void retire(CompteBancaire c, double i) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deposer(CompteBancaire c, double i) {
		// TODO Auto-generated method stub

	}

}
