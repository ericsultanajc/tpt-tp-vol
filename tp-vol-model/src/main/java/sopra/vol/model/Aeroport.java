package sopra.vol.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.UniqueConstraint;

@Entity
public class Aeroport {
	@Id
	@Column(length = 10)
	private String code;
	@Column(length = 100)
	private String nom;
	@ManyToMany
	@JoinTable(name = "aeroport_ville", joinColumns = @JoinColumn(name = "aeroport_code"), inverseJoinColumns = @JoinColumn(name = "ville_id"), uniqueConstraints = @UniqueConstraint(columnNames = {
			"aeroport_code", "ville_id" }))
	private List<Ville> villes = new ArrayList<Ville>();

	public Aeroport() {
		super();
	}

	public Aeroport(String code, String nom) {
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

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

}
