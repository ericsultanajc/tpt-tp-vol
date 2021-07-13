package sopra.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "compagnie_aerienne")
public class CompagnieAerienne {
	@Id
	@Column(length = 10)
	private String code;
	@Column(length = 100)
	private String nom;
	@OneToMany(mappedBy = "compagnieAerienne")
	private List<CompagnieAerienneVol> vols = new ArrayList<CompagnieAerienneVol>();

	public CompagnieAerienne() {
		super();
	}

	public CompagnieAerienne(String code, String nom) {
		super();
		this.code = code;
		this.nom = nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<CompagnieAerienneVol> getVols() {
		return vols;
	}

	public void setVols(List<CompagnieAerienneVol> vols) {
		this.vols = vols;
	}

}
