package de.cpredikant.beziehungskiste.model.partner;

import java.io.Serializable;

public class Arbeitnehmer implements Serializable {

    private String arbeitnehmerNr;

    private String anrede;

    private String vorname;

    private String nachname;

    private String geburtsdatum;

    private Adresse adresse;

    private Bankkonto bankkonto;

    private Kontaktdaten kontaktdaten;

    private Emailadresse emailadresse;

}
