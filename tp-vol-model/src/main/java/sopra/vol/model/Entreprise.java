package sopra.vol.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("Entreprise")
public class Entreprise extends Client {
	@Column(length = 30)
	private String siret;
	@Column(length = 30)
	private String numeroTVA;
	@Column(length = 30)
	@Enumerated(EnumType.STRING)
	private StatutJuridique statutJuridique;

	public Entreprise() {
		super();
	}
	
	public Entreprise(String nom) {
		super(nom);
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getNumeroTVA() {
		return numeroTVA;
	}

	public void setNumeroTVA(String numeroTVA) {
		this.numeroTVA = numeroTVA;
	}

	public StatutJuridique getStatutJuridique() {
		return statutJuridique;
	}

	public void setStatutJuridique(StatutJuridique statutJuridique) {
		this.statutJuridique = statutJuridique;
	}

}
