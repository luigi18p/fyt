/*
package test;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import domain.Annuncio;
import domain.CatalogoPersonale;



public class UnitTestGestoreAnnuncio {   	
	List<Annuncio> lista = new ArrayList<Annuncio>();
	CatalogoPersonale cp = new CatalogoPersonale();
	
	@BeforeClass
	public static void setupGeneral() {
		System.out.println(" ");
	
	}
	
	@Before
	public void setupMethod() {
		System.out.println("\n ");

						
	}
	
	@Test
	public void test_getAllAnnunciPersonali(String username) {
		Annuncio ann0 = new Annuncio (0, "gioa", null, 0, null);
		Annuncio ann1 = new Annuncio (1, "lui", null, 0, null);
		Annuncio ann2 = new Annuncio (2, "guest", null, 0, null);
		
		lista.add(ann0);
		lista.add(ann1);
		lista.add(ann2);
		
		
		cp.setElencoAnnunci(lista);
		cp.getAllAnnunciPersonali(username);
		
		assertEquals(lista, cp.getElencoAnnunci());
		
	}
	
	@Test
	public void test_deletePerVendita() {
		
		//boolean check = stubs.deletePerVendita(1)
		//assertEquals(true,check);
				
	}
	
	@Test
	public void test3_fail() {
		
		int z = 0;
		assertEquals(0,z);
		
			
	}
	
	@After
	public void TeardownMethod() {
		System.out.println(" ");
		
	}
	
	@AfterClass							//FONDAMENTALE: I METODI BEFORECLASS e AFTERCLASS DEVONO ESSERE STATIC!!!
	public static void TeardownGeneral() {
		System.out.println("\n  " );
		
		
	}
}
*/