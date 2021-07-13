package sopra.vol.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 20)
	@Enumerated(EnumType.STRING)
	private StatutVol statutVol;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtDepart;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtArrivee;
	@ManyToOne
	@JoinColumn(name = "depart_code")
	private Aeroport depart;
	@ManyToOne
	@JoinColumn(name = "arrivee_code")
	private Aeroport arrivee;
	private int nbPlaceDispo;
	@OneToMany(mappedBy = "vol")
	private List<Billet> billets = new ArrayList<>();
	@OneToMany(mappedBy = "vol")
	private List<CompagnieAerienneVol> compagnieAeriennes = new ArrayList<CompagnieAerienneVol>();

	public Vol() {
		super();
	}

	public Vol(StatutVol statutVol, Date dtDepart, Date dtArrivee, int nbPlaceDispo) {
		super();
		this.statutVol = statutVol;
		this.dtDepart = dtDepart;
		this.dtArrivee = dtArrivee;
		this.nbPlaceDispo = nbPlaceDispo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StatutVol getStatutVol() {
		return statutVol;
	}

	public void setStatutVol(StatutVol statutVol) {
		this.statutVol = statutVol;
	}

	public List<Billet> getBillets() {
		return billets;
	}

	public void setBillets(List<Billet> billets) {
		this.billets = billets;
	}

	public Date getDtDepart() {
		return dtDepart;
	}

	public void setDtDepart(Date dtDepart) {
		this.dtDepart = dtDepart;
	}

	public Date getDtArrivee() {
		return dtArrivee;
	}

	public void setDtArrivee(Date dtArrivee) {
		this.dtArrivee = dtArrivee;
	}

	public Aeroport getDepart() {
		return depart;
	}

	public void setDepart(Aeroport depart) {
		this.depart = depart;
	}

	public Aeroport getArrivee() {
		return arrivee;
	}

	public int getNbPlaceDispo() {
		return nbPlaceDispo;
	}

	public void setNbPlaceDispo(int nbPlaceDispo) {
		this.nbPlaceDispo = nbPlaceDispo;
	}

	public void setArrivee(Aeroport arrivee) {
		this.arrivee = arrivee;
	}

	public List<CompagnieAerienneVol> getCompagnieAeriennes() {
		return compagnieAeriennes;
	}

	public void setCompagnieAeriennes(List<CompagnieAerienneVol> compagnieAeriennes) {
		this.compagnieAeriennes = compagnieAeriennes;
	}

}
