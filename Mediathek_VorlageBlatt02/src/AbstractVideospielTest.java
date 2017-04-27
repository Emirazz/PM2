
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 */
public abstract class AbstractVideospielTest extends AbstractMediumTest
{
    protected static final String SYSTEM = "System";
    private Videospiel _videoSpiel;
    
    public AbstractVideospielTest()
    {
    	super();
    	if(_medium1 instanceof Videospiel)
        {
    		_videoSpiel = (Videospiel) _medium1;
        }
    }

    @Test
    public void testKonstrutor()
    {
    	super.testKonstruktor();
        assertEquals(SYSTEM, _videoSpiel.getSystem());
    }

    
}
