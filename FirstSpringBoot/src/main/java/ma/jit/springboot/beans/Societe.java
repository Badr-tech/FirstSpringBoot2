package ma.jit.springboot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Societe {
	@Autowired
	private Personne dirigeant;
	private String status;

	/**
	 * @return the dirigeant
	 */
	public Personne getDirigeant() {
		return dirigeant;
	}

	/**
	 * @param dirigeant the dirigeant to set
	 */
	public void setDirigeant(Personne dirigeant) {
		this.dirigeant = dirigeant;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	public void info() {
		System.out.println("Statut :" + status + " " + "Drigeant :" + dirigeant.getNom());
	}
	public void modifierInfoDirigeant(String nom,String prenom) {
		dirigeant.setNom(nom);
		dirigeant.setPrenom(prenom);
	}
}
