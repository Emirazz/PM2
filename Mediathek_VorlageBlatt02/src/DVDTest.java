import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DVDTest extends AbstractMediumTest
{

    private static final int LAENGE = 100;
    private static final String REGISSEUR = "DVD Regisseur";
    private DVD _dvd;


    public DVDTest()
    {
        super();
        if(_medium1 instanceof DVD)
        {
        	_dvd = (DVD) _medium1;
        }
        BEZEICHNUNG = "DVD";
        
    }


    @Test
    public void testKonstruktor()
    {
    	super.testKonstruktor();
        assertEquals(LAENGE, _dvd.getLaufzeit());
        assertEquals(REGISSEUR, _dvd.getRegisseur());
    }

    @Test
    public void testSetter()
    {
    	super.testSetter();
    	_dvd.setLaufzeit(90);
        assertEquals(90, _dvd.getLaufzeit());
        _dvd.setRegisseur("Regisseur2");
        assertEquals("Regisseur2", _dvd.getRegisseur());
    }

    @Override
    protected AbstractMedium getMedium()
    {
        return new DVD(TITEL, KOMMENTAR, REGISSEUR, LAENGE);
    }
    @Test
    public void testBerechneMietGebuehr()
    {
        assertEquals(Geldbetrag.get(300),_medium1.berchneMietgebuehr(1));
        assertEquals(Geldbetrag.get(600),_medium1.berchneMietgebuehr(2));
        assertEquals(Geldbetrag.get(3000),_medium1.berchneMietgebuehr(10));
    }

}
