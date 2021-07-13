package sopra.vol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Billet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 4)
	private String numeroPlace;
	@Column(length = 4)
	private String classe;
	private float prix;
	private int ordre;
	@ManyToOne
	@JoinColumn(name="reservation_id")
	private Reservation reservation;
	@ManyToOne
	@JoinColumn(name="vol_id")
	private Vol vol;

	public Billet() {
		super();
	}

	public Billet(String numeroPlace, String classe, float prix, int ordre) {
		super();
		this.numeroPlace = numeroPlace;
		this.classe = classe;
		this.prix = prix;
		this.ordre = ordre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroPlace() {
		return numeroPlace;
	}

	public void setNumeroPlace(String numeroPlace) {
		this.numeroPlace = numeroPlace;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

}
