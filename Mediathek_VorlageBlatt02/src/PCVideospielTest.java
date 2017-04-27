
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
		if(_medium1 instanceof PCVideospiel)
		{
			_videoSpiel = (PCVideospiel) _medium1;
		}
    }
    
    @Override
    protected AbstractMedium getMedium()
    {
        return new PCVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }
    /**
     * Testet die berechnete Mietgebuehr
     */
    @Test
    public void testBerechneMietGebuehr()
    {
    	assertEquals(Geldbetrag.get(200),_videoSpiel.berchneMietgebuehr(1));
    	assertEquals(Geldbetrag.get(200),_videoSpiel.berchneMietgebuehr(7));
	        
	assertEquals(Geldbetrag.get(700),_videoSpiel.berchneMietgebuehr(8));
        assertEquals(Geldbetrag.get(700),_videoSpiel.berchneMietgebuehr(12));
	        
        assertEquals(Geldbetrag.get(1200),_videoSpiel.berchneMietgebuehr(13));
        assertEquals(Geldbetrag.get(1200),_videoSpiel.berchneMietgebuehr(17));
	        
        assertEquals(Geldbetrag.get(1700),_videoSpiel.berchneMietgebuehr(18));
        assertEquals(Geldbetrag.get(1700),_videoSpiel.berchneMietgebuehr(22));
    }

}
