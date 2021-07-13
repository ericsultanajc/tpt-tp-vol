package sopra.vol.test;

import sopra.vol.Application;
import sopra.vol.repository.IAdresseRepository;
import sopra.vol.repository.IAeroportRepository;
import sopra.vol.repository.IBilletRepository;
import sopra.vol.repository.IClientRepository;
import sopra.vol.repository.ICompagnieAerienneRepository;
import sopra.vol.repository.ICompagnieAerienneVolRepository;
import sopra.vol.repository.IPassagerRepository;
import sopra.vol.repository.IReservationRepository;
import sopra.vol.repository.IVilleRepository;
import sopra.vol.repository.IVolRepository;

public class TestVolData {

	public static void main(String[] args) {
		IAdresseRepository adresseRepo = Application.getInstance().getAdresseRepo();
		IAeroportRepository aeroportRepo = Application.getInstance().getAeroportRepo();
		IBilletRepository billetRepo = Application.getInstance().getBilletRepo();
		IClientRepository clientRepo = Application.getInstance().getClientRepo();
		ICompagnieAerienneRepository compagnieAerienneRepo = Application.getInstance().getCompagnieAerienneRepo();
		ICompagnieAerienneVolRepository compagnieAerienneVolRepo = Application.getInstance().getCompagnieAerienneVolRepo();
		IPassagerRepository passagerRepo = Application.getInstance().getPassagerRepo();
		IReservationRepository reservationRepo = Application.getInstance().getReservationRepo();
		IVilleRepository villeRepo = Application.getInstance().getVilleRepo();
		IVolRepository volRepo = Application.getInstance().getVolRepo();
		
		

	}

}
