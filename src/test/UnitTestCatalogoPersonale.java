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

public class UnitTestCatalogoPersonale {   	

	
	@BeforeClass
	public static void setupGeneral() {
		System.out.println("BeforeClass");

	}
	
	@Before
	public void setupMethod() {
		System.out.println("\n ");

						
	}
	
	@Test
	public void test_SetElencoAnn() {

		Annuncio ann0 = new Annuncio (0, "gioa", null, 0, null);
		Annuncio ann1 = new Annuncio (1, "lui", null, 0, null);
		Annuncio ann2 = new Annuncio (2, "guest", null, 0, null);
		List<Annuncio> lista = new ArrayList<Annuncio>();
		lista.add(ann0);
		lista.add(ann1);
		lista.add(ann2);
		CatalogoPersonale cp = new CatalogoPersonale();
		
		cp.setElencoAnnunci(lista);
		assertEquals(lista, cp.getElencoAnnunci());
		
		
	}
	
	@After
	public void TeardownMethod() {
		System.out.println(" ");
		
	}
	
	@AfterClass	
	public static void TeardownGeneral() {
		System.out.println("\n  " );
		
		
	}
}
