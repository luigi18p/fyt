package businessLogic;

import java.sql.Date;

import dataBase.BigliettoDAO;
import domain.BigliettoTreno;

public class GestoreBiglietto {
	
	public BigliettoTreno ReadBigliettoTreno(String id) {
		
		BigliettoDAO bigliettoDAO = new BigliettoDAO();
		BigliettoTreno b = bigliettoDAO.readBigliettoTreno(id);

		return b;
		
	}
	
	public void DeleteBiglietto(int id) {
		
		BigliettoDAO bigliettoDAO = new BigliettoDAO();
		bigliettoDAO.deleteBiglietto(id);
		
	}

}
