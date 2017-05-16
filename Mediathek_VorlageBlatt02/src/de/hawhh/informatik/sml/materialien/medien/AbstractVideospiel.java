package de.hawhh.informatik.sml.materialien.medien;

import de.hawhh.informatik.sml.fachwerte.Geldbetrag;

/**
 * {@link AbstractVideospiel} ist ein {@link Medium} mit einer zusätzlichen
 * Informationen zum kompatiblen System.
 * 
 * @author SE2-Team, PR2-Team, PR2-Team
 * @version SoSe 2017
 */
public abstract class AbstractVideospiel extends AbstractMedium implements Medium
{
    /**
     * Das System, auf dem das Spiel lauffähig ist
     */
    private String _system;

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
    public AbstractVideospiel(String titel, String kommentar, String system, String bezeichner)
    {
        super(titel,kommentar, bezeichner);
        assert system != null : "Vorbedingung verletzt: system != null";
        _system = system;
    }

    /**
     * Gibt das System zurück, auf dem das Spiel lauffähig ist.
     * 
     * @return Das System, auf dem das Spiel ausgeführt werden kann.
     * 
     * @ensure result != null
     */
    public String getSystem()
    {
        return _system;
    }
    

    @Override
    public String toString()
    {
        return getFormatiertenString();
    }

    @Override
    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + super.getFormatiertenString() + "\n" + "    "
                + "System: " + _system + "\n";
    }
    
    @Override
    public Geldbetrag berechneMietgebuehr(int mietTage)
    {
    	return Geldbetrag.get(200+ getPreisNachTagen(mietTage));
    }
    
    /**
     * liefert den Zeitabhängigen Preisanteil
     * @param tage Anzahl Ausleihtage
     * @retrun Der Geldbetrag
     * @require tage > 0
     */
    protected abstract int getPreisNachTagen(int tage);
}
