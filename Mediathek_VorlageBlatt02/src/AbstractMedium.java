/**
 * Ein Medium definiert Eigenschaften, die alle Medien unserer Mediathek
 * gemeinsam haben. Der Titel eines Mediums dient als eindeutige Identifikation.
 * Ein Medium kann ausgeliehen und zurückgegeben werden.
 * 
 * @author Emira Zorgati
 * @version SoSe 2017
 */
abstract class AbstractMedium
{
    /**
     * Ein Kommentar zum Medium
     */
    public String _kommentar;

    /**
     * Der Titel des Mediums
     */
    public String _titel;
    
    /**
     * Initialisiert ein neues abstractMedium.
     * 
     * @param titel Der Titel des Mediums
     * @param kommentar Ein Kommentar zum Medium
     * 
     * @require titel != null
     * @require kommentar != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     */
    public AbstractMedium(String titel, String kommentar)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        _titel = titel;
        _kommentar = kommentar;
    }
    
    /**
     * Gibt den Kommentar zu diesem Medium zurück.
     * 
     * @return Den Kommentar zu diesem Medium.
     * 
     * @ensure result != null
     */
    public String getKommentar()
    {
	return _kommentar;
    }

    /**
     * Ändert den Kommentar des Mediums
     * 
     * @param kommentar Ein Kommentar zu diesem Medium
     * 
     * @require kommentar != null
     * @ensure getKommentar() == kommentar
     */
    public void setKommentar(String kommentar)
    {
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        _kommentar = kommentar;
    }
    
    /**
     * Gibt den Titel des Mediums zurück.
     * 
     * @return Den Titel des Mediums
     * 
     * @ensure result != null
     */
    public String getTitel()
    {
        return _titel;
    }

    /**
     * Ändert den Titel des Mediums.
     * 
     * @param titel Der Titel des Mediums
     * 
     * @require titel != null
     * @ensure getTitel() == titel
     */
    public void setTitel(String titel)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        _titel = titel;
    }
    
    /**
     * Gibt einen formatierten Text mit allen Eigenschaften des Mediums zurück.
     * Jedes Attribute steht in einer eigenen Zeile mit der Form "Attributename:
     * Attributwert". Hinweis: Ein Zeilenumbruch wird durch den Character '\n'
     * dargestellt.
     * 
     * @return Eine Textrepräsentation des Mediums.
     * 
     * @ensure result != null
     */
    public String getFormatiertenString()
    {
	return ":\n" + "    " + "Titel: " + _titel
                + "\n" + "    " + "Kommentar: " + _kommentar;
    }
    
    /**
     * Berechnet die Mietgebühr in Eurocent für eine angegebene Mietdauer in Tagen
     * @param mietTag
     * 		Die Anzahl der Ausleihtage eines Mediums
     * @retrun Die Mitergebühr in Eurocent als Geldbetrag
     * 
     * @require miteTag > 0
     * 
     * @ensure result != null
     */
    public Geldbetrag berchneMietgebuehr(int mietTage)
    {
	assert mietTage > 0 : "Vorbedingung verletzt: mietTage > 0";
	return Geldbetrag.get(300*mietTage);
    }
    
    abstract public String getMedienBezeichnung();
}
