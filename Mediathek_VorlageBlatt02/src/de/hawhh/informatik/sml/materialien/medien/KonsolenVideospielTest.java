package de.hawhh.informatik.sml.materialien.medien;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.hawhh.informatik.sml.fachwerte.Geldbetrag;

/**
 */
public class KonsolenVideospielTest extends AbstractVideospielTest
{
	private KonsolenVideospiel _videoSpiel;
	
    public KonsolenVideospielTest()
    {
    	super();
			_videoSpiel = getMedium();
		BEZEICHNUNG = "KonsolenVideospiel";
    }
    
    @Override
    protected KonsolenVideospiel getMedium()
    {
        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }
    

   
    @Test
    public void testBerechneMietGebuehr()
    {
        assertEquals(Geldbetrag.get(200),_videoSpiel.berechneMietgebuehr(1));
        assertEquals(Geldbetrag.get(200),_videoSpiel.berechneMietgebuehr(2));
        
        assertEquals(Geldbetrag.get(900),_videoSpiel.berechneMietgebuehr(3));
        assertEquals(Geldbetrag.get(900),_videoSpiel.berechneMietgebuehr(5));
        
        assertEquals(Geldbetrag.get(1600),_videoSpiel.berechneMietgebuehr(6));
        assertEquals(Geldbetrag.get(1600),_videoSpiel.berechneMietgebuehr(8));
        
        assertEquals(Geldbetrag.get(2300),_videoSpiel.berechneMietgebuehr(9));
        assertEquals(Geldbetrag.get(2300),_videoSpiel.berechneMietgebuehr(11));
    }

}