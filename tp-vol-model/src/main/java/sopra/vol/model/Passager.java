package sopra.vol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passager {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 100)
	private String nom;
	@Column(length = 100)
	private String prenom;
	@Column(length = 20)
	private String numeroIdentite;
	@Column(length = 20)
	@Enumerated(EnumType.STRING)
	private TypeIdentite typeIdentite;
	@OneToOne(mappedBy = "passager")
	private Reservation reservation;

	public Passager() {
		super();
	}

	public Passager(String nom, String prenom, String numeroIdentite, TypeIdentite typeIdentite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroIdentite = numeroIdentite;
		this.typeIdentite = typeIdentite;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroIdentite() {
		return numeroIdentite;
	}

	public void setNumeroIdentite(String numeroIdentite) {
		this.numeroIdentite = numeroIdentite;
	}

	public TypeIdentite getTypeIdentite() {
		return typeIdentite;
	}

	public void setTypeIdentite(TypeIdentite typeIdentite) {
		this.typeIdentite = typeIdentite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

}
