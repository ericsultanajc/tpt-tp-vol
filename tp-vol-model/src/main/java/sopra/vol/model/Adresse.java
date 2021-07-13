package sopra.vol.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Adresse {
	@Id
	private Long id;
	@Column(length = 255)
	private String rue;
	@Column(length = 255)
	private String complement;
	@Column(length = 10)
	private String codePostal;
	@Column(length = 100)
	private String ville;
	@Column(length = 100)
	private String pays;
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	public Adresse() {
		super();
	}

	public Adresse(String rue, String complement, String codePostal, String ville, String pays) {
		super();
		this.rue = rue;
		this.complement = complement;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
