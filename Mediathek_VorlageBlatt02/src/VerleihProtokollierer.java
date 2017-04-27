import java.io.IOException;
import java.io.FileWriter;
/**
 * Protokolliert alle Verleihvorgänge.
 * 
 * @author Emira Zorgati
 * 
 *
 */
public class VerleihProtokollierer
{
	/**
	 * Protokolliert alle Verleihvorgänge.
	 * @param ereignis Bei Rückgabe das Wort 'Rückgabe'. Bei Ausleih 'Verleih' 
	 * @param verleihkarte Die Verleihkarte die Protokolliert werden soll.
	 * @throws ProtokollierException
	 */
	public void protokolliere(VerleihEreignis ereignis, Verleihkarte verleihkarte) throws ProtokollierException
	{
		
		try(FileWriter writer = new FileWriter("./protokoll.txt", true))
		{
			writer.write(ereignis.toString() +":\n" + verleihkarte.getFormatiertenString());
		}
		catch(IOException e)
		{
			throw new ProtokollierException("IOException-Fehler");
		}
	}

}
