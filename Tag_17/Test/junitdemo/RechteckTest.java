/**
 * Daniel Schirmer
 *
 * 17.12.2020
 * Project : Tag_17
 * ©2020
 *
 */

package junitdemo;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import rechteck.Rechteck;

public class RechteckTest {
	public static Rechteck myRechteck;
	
	@BeforeClass
	public static void create() {
		myRechteck = new Rechteck(10,20);
	}
	
	@Test
	public void rechteckTesten() {
		Assert.assertTrue("UmfangTest",65 == myRechteck.berechneUmfang());
	}
	
	@Test
	public void testen2() {
		Assert.assertFalse("Inhalt", 400 == myRechteck.berechneInhalt());
	}
	
	@Test
	public void nullTest() {
		Assert.assertNotNull("Not null", myRechteck.berechneInhalt());
	}

}
