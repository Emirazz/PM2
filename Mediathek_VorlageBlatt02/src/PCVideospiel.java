
public class PCVideospiel extends Videospiel
{
    /**
     * Initialisiert ein neues Videospiel.
     * 
     * @param titel Der Titel des Spiels
     * @param kommentar Ein Kommentar zum Spiel
     * @param system Die Bezeichnung des System
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getSystem() == system
     */
    public PCVideospiel(String titel, String kommentar, String system)
    {
        super(titel,kommentar,system,"PCVideospiel");
    }
    
    /**
     * liefert den Zeitabhängigen Preisanteil
     * @param tage Anzahl Ausleihtage
     * @retrun Der Geldbetrag
     * @require tage > 0
     */
    @Override
    protected int getPreisNachTagen(int tage)
    {
	if(tage <=7)
	{
	    return 0;
	}
	else
	{
	    tage = (tage-7);
	    return 500*(tage/5 + tage % 5);
	}
    }

}
