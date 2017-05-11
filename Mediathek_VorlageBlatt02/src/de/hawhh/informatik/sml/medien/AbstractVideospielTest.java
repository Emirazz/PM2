package de.hawhh.informatik.sml.medien;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public abstract class AbstractVideospielTest extends AbstractMediumTest
{
    protected static final String SYSTEM = "System";
    private AbstractVideospiel _videoSpiel;
    
    public AbstractVideospielTest()
    {
    	super();
    	_videoSpiel = getMedium();
    }
    
    abstract protected AbstractVideospiel getMedium();

    @Test
    public void testKonstruktor()
    {
    	super.testKonstruktor();
        assertEquals(SYSTEM, _videoSpiel.getSystem());
    }

    
}
