
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class PCVideospielTest extends AbstractVideospielTest
{
	private PCVideospiel _videoSpiel;
	
	
	
    public PCVideospielTest()
    {
	super();
	BEZEICHNUNG = "PCVideospiel";
			_videoSpiel = getMedium();
		
    }
    
    @Override
    protected PCVideospiel getMedium()
    {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }
    /**
     * Testet die berechnete Mietgebuehr
     */
    @Test
    public void testBerechneMietGebuehr()
    {
    	assertEquals(Geldbetrag.get(200),_videoSpiel.berechneMietgebuehr(1));
    	assertEquals(Geldbetrag.get(200),_videoSpiel.berechneMietgebuehr(7));
	        
    	assertEquals(Geldbetrag.get(700),_videoSpiel.berechneMietgebuehr(8));
        assertEquals(Geldbetrag.get(700),_videoSpiel.berechneMietgebuehr(12));
	        
        assertEquals(Geldbetrag.get(1200),_videoSpiel.berechneMietgebuehr(13));
        assertEquals(Geldbetrag.get(1200),_videoSpiel.berechneMietgebuehr(17));
	        
        assertEquals(Geldbetrag.get(1700),_videoSpiel.berechneMietgebuehr(18));
        assertEquals(Geldbetrag.get(1700),_videoSpiel.berechneMietgebuehr(22));
    }

}
