package de.hawhh.informatik.sml.medien;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

abstract public class AbstractMediumTest
{
    protected static final String KOMMENTAR = "Kommentar";
    protected static final String TITEL = "Titel";
    protected static String BEZEICHNUNG;
    private AbstractMedium _medium1;
    private AbstractMedium _medium2;

    public AbstractMediumTest()
    {
    	BEZEICHNUNG = "";
    	_medium1 = getMedium();
        _medium2 = getMedium();
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String Bezeichnung = BEZEICHNUNG;
        assertEquals(Bezeichnung, _medium1.getMedienBezeichnung());
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(TITEL, _medium1.getTitel());
        assertEquals(KOMMENTAR, _medium1.getKommentar());
    }

    @Test
    public void testSetter()
    {
    	_medium1.setKommentar("Kommentar2");
        assertEquals(_medium1.getKommentar(), "Kommentar2");
        _medium1.setTitel("Titel2");
        assertEquals(_medium1.getTitel(), "Titel2");
    }

    @Test
    /*
     * Von ein und der selben DVD kann es mehrere Exemplare geben, die von
     * unterschiedlichen Personen ausgeliehen werden können.
     */
    public void testEquals()
    {
        assertFalse("Mehrere Exemplare des gleichen Mediums sind gleich",
        		_medium1.equals(_medium2));
        assertTrue("Mehrere Exemplare des selben Mediums sind ungleich",
        		_medium1.equals(_medium1));
    }

    @Test
    public final void testGetFormatiertenString()
    {
        AbstractMedium medium = getMedium();
        assertNotNull(medium.getFormatiertenString());
    }

    abstract protected AbstractMedium getMedium();
    
    @Test
    abstract public void testBerechneMietGebuehr();

}