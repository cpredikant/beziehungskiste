package de.cpredikant.beziehungskiste.model.partner;

import java.io.Serializable;
import java.util.List;

public class Arbeitgeber implements Serializable {

    private String arbeitgeberNr;

    private String firmenname;

    private String vorname;

    private String nachname;

    private String rechtsform;

    private List<Bankkonto> bankkonto;

    private Adresse adressen;

    private List<Vertreter> vertreter;

    private List<Kontaktdaten> kontaktdaten;

    private List<Kontaktperson> kontaktpersonen;

    private List<Verband> verband;


}
