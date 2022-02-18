package com.UD21.UD21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class TestGeometria {
	Geometria geo, geo1, geo2, geo3, geo4, geo5, geo6, geo7, geo8, geo9;

	@BeforeEach
	public void before() {
		System.out.println("before()");
		geo = new Geometria();
		geo1 = new Geometria(1);
		geo2 = new Geometria(2);
		geo3 = new Geometria(3);
		geo4 = new Geometria(4);
		geo5 = new Geometria(5);
		geo6 = new Geometria(6);
		geo7 = new Geometria(7);
		geo8 = new Geometria(8);
		geo9 = new Geometria(9);

	}

	@Test
	public void testareacuadrado() {
		System.out.println("testareacuadrado()");
		int result = geo1.areacuadrado(3);
		int esperado = 9;
		assertEquals(esperado, result);
	}

	@Test
	public void testareaCirculo() {
		System.out.println("testareaCirculo()");
		double result = geo1.areaCirculo(1);
		double esperado = 3.1416;
		assertEquals(esperado, result);
	}

	@Test
	public void testareatriangulo() {
		int result = geo1.areatriangulo(2, 2);
		int esperado = 2;
		assertEquals(esperado, result);
	}

	@Test
	public void testarearectangulo() {
		int result = geo1.arearectangulo(2, 2);
		int esperado = 4;
		assertEquals(esperado, result);
	}

	@Test
	public void testareapentagono() {
		int result = geo1.areapentagono(2, 2);
		int esperado = 2;
		assertEquals(esperado, result);
	}

	@Test
	public void testarearombo() {
		int result = geo1.arearombo(2, 2);
		int esperado = 2;
		assertEquals(esperado, result);
	}

	@Test
	public void testarearomboide() {
		int result = geo1.arearomboide(2, 2);
		int esperado = 4;
		assertEquals(esperado, result);
	}

	@Test
	public void testareatrapecio() {
		int result = geo1.areatrapecio(2, 2, 2);
		int esperado = 4;
		assertEquals(esperado, result);
	}

	@Test
	public void testsetId() {
		geo1.setId(1);
		int result = geo1.getId();
		int esperado = 1;
		assertEquals(esperado, result);
	}

	@Test
	public void testgetId() {
		int result = geo1.getId();
		int esperado = 1;
		assertEquals(esperado, result);
	}

	@Test
	public void testsetNom() {
		geo1.setNom("geo1");
		String result = geo1.getNom();
		String esperado = "geo1";
		assertEquals(esperado, result);
	}

	@Test
	public void testgetNom() {
		geo1.setNom("geo1");
		String result = geo1.getNom();
		String esperado = "geo1";
		assertEquals(esperado, result);
	}

	@Test
	public void testsetArea() {
		geo1.setArea(2);
		double result = geo1.getArea();
		double esperado = 2;
		assertEquals(esperado, result);
	}

	@Test
	public void testgetArea() {
		geo1.setArea(2);
		double result = geo1.getArea();
		double esperado = 2;
		assertEquals(esperado, result);
	}

	@Test
	public void testtoString() {
		geo2.setNom("Circulo");
		geo2.setArea(12.5664);
		String result = geo1.toString();
		String esperado = "Geometria [id=2, nom=Circulo, area=12.5664]";
	}

	@AfterEach()
	public void after() {
		System.out.println("before()");
		geo = null;
		geo1 = null;
		geo2 = null;
		geo3 = null;
		geo4 = null;
		geo5 = null;
		geo6 = null;
		geo7 = null;
		geo8 = null;
		geo9 = null;
	}

}
