package persistance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Client;
import model.CompteBancaire;
import model.Conseiller;
import model.OperationBancaire;

/**
 * La classe PersistanceDao permet de faire le lien entre la BD et la couche service à travers le driver
 * @author Nawal et Gwennhaelle
 */
public class PersistanceDAO {
	Set<CompteBancaire> compte = new HashSet<CompteBancaire>();

	CompteBancaire cp = new CompteBancaire();
	Client c = new Client();
	List<OperationBancaire> operation = new ArrayList<OperationBancaire>();
	OperationBancaire op1 = new OperationBancaire();
	OperationBancaire op = new OperationBancaire();
	Set<Client> cli = new HashSet<Client>();
	Conseiller cons = new Conseiller();
	Client c1 = new Client();

	/**
	 * C'est le driver
	 */
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");

	public void save(Client c) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			// Client c = new Client();
			// c.setName("loic");

			cp.setSold(1500000);

			compte.add(cp);
			// cp.setClient(c);//on associe le compte au client

			// em.persist(c);
			// em.persist(cp);

			c.setName("loic");
			c1.setName("claire");
			cli.add(c);
			cli.add(c1);

			cons.setName("Ali");
			c.setConseiller(cons);// on associe le client au conseiller
			c1.setConseiller(cons);

			// em.persist(c);
			// em.persist(c1);
			// em.persist(cons);
			op1.setMontant(336);
			operation.add(op);
			op.setMontant(251);
			operation.add(op1);
			op.setCompteBancaire(cp);// on associe l operation au compte
			op1.setCompteBancaire(cp);
			op.setConseiller(cons);
			op1.setConseiller(cons);
			em.persist(op);
			em.persist(op1);
			em.persist(cp);
			em.persist(cons);

			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}

	public void delete(Client C) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
	}

	public void readinfoClient(Client C) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
	}

	public void readinfoCompte(CompteBancaire C) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
	}

	public void deleteAccompte(CompteBancaire C) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
	}

	public void createAccompte(CompteBancaire C) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
	}

	public void modiFN(Client C, String name, String firstName) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		try {
			txn.begin();
			c.setName(name);
			c.setFirstName(firstName);
			txn.commit();
		} catch (Exception e) {
			if (txn != null) {
				txn.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em != null) {
				em.close();
			}
			if (emf != null) {
				emf.close();
			}

		}
	}

}
