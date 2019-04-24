package service;

import java.util.List;
import java.util.Set;

import model.Client;
import model.CompteBancaire;
import model.CompteCourant;
import model.CompteEpargne;

public interface ConseillerService {
	/**
	 * Methode pour créer un client
	 */
	public void creerClient(Client c); // mettre la variable pour tous les autres???

	/**
	 * Methode pour supprimer un client
	 */
	public void supprimerClient(Client c);

	/**
	 * Methode pour lire les informations d'un client
	 */
	public void consulterCompte(Client c);

	/**
	 * Methode pour créer un compte bancaire client
	 */
	public void creerCompte(CompteBancaire c);

	/**
	 * Methode pour effectuer un virement de l'argent d'un compte epargne sur un
	 * compte courant
	 */
	public void virement(CompteEpargne cbe, CompteCourant cbc, double i);

	/**
	 * Methode pour effectuer un virement de l'argent d'un compte courant sur un
	 * compte epargne
	 */
	public void virement(CompteCourant cbc, CompteEpargne cbe, double i);

	/**
	 * Methode pour modifier le numero de telephone d'un client
	 */
	public void modifClient(Client c, String number);

	/**
	 * Methode pour modifier le nom et prénom d'un client
	 */
	public void modifClient(Client c, String firstname, String surname);

	/**
	 * Methode pour modifier l'adresse, la ville, le code postale d'un client
	 */
	public void modifClient(Client c, String adress, String city, String postalCode);

	/**
	 * Methode pour modifier l'ensmeble des informations d'un client
	 */
	public void modifClient(Client c, String firstname, String surname, String adress, String city, String postalCode,
			String number);

	public void retire(CompteBancaire c, double i);

	public void deposer(CompteBancaire c, double i);

}
