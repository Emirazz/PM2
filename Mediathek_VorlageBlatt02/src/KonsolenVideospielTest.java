
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public class KonsolenVideospielTest extends AbstractVideospielTest
{
	private KonsolenVideospiel _videoSpiel;
	
    public KonsolenVideospielTest()
    {
    	super();
		if(_medium1 instanceof KonsolenVideospiel)
		{
			_videoSpiel = (KonsolenVideospiel) _medium1;
		}
		BEZEICHNUNG = "KonsolenVideospiel";
    }
    
    @Override
    protected AbstractMedium getMedium()
    {
        return new KonsolenVideospiel(TITEL, KOMMENTAR, SYSTEM);
    }
    

   
    @Test
    public void testBerechneMietGebuehr()
    {
        assertEquals(Geldbetrag.get(200),_videoSpiel.berchneMietgebuehr(1));
        assertEquals(Geldbetrag.get(200),_videoSpiel.berchneMietgebuehr(2));
        
        assertEquals(Geldbetrag.get(900),_videoSpiel.berchneMietgebuehr(3));
        assertEquals(Geldbetrag.get(900),_videoSpiel.berchneMietgebuehr(5));
        
        assertEquals(Geldbetrag.get(1600),_videoSpiel.berchneMietgebuehr(6));
        assertEquals(Geldbetrag.get(1600),_videoSpiel.berchneMietgebuehr(8));
        
        assertEquals(Geldbetrag.get(2300),_videoSpiel.berchneMietgebuehr(9));
        assertEquals(Geldbetrag.get(2300),_videoSpiel.berchneMietgebuehr(11));
    }

}