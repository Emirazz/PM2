package de.hawhh.informatik.sml.materialien.medien;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.hawhh.informatik.sml.fachwerte.Geldbetrag;

public class CDTest extends AbstractMediumTest
{
    private static final String INTERPRET = "CD Interpret";
    private static final int LAENGE = 100;
    private CD _cd1;

    public CDTest()
    {
    	super();
        	_cd1 = getMedium();
      
        BEZEICHNUNG = "CD";
    }

    @Test
    public void testKonstruktor()
    {
    	super.testKonstruktor();
        assertEquals(LAENGE, _cd1.getSpiellaenge());
        assertEquals(INTERPRET, _cd1.getInterpret());
    }

    @Test
    public final void testSetter()
    {
    	super.testSetter();
        _cd1.setInterpret("Interpret2");
        assertEquals(_cd1.getInterpret(), "Interpret2");
        _cd1.setSpiellaenge(99);
        assertEquals(_cd1.getSpiellaenge(), 99);
    }

    @Override
    protected CD getMedium()
    {
        return new CD(TITEL, KOMMENTAR, INTERPRET, LAENGE);
    }
    
    @Test
    public void testBerechneMietGebuehr()
    {
        assertEquals(Geldbetrag.get(300),_cd1.berechneMietgebuehr(1));
        assertEquals(Geldbetrag.get(600),_cd1.berechneMietgebuehr(2));
        assertEquals(Geldbetrag.get(3000),_cd1.berechneMietgebuehr(10));
    }

}
