package de.cpredikant.beziehungskiste.model.partner;

import lombok.Data;

import java.io.Serializable;

@Data
public class Arbeitnehmer implements Serializable {

    private String arbeitnehmerNr;

    private String anrede;

    private String vorname;

    private String nachname;

    private String geburtsdatum;

    private String geburtsort;

    private String sozialversicherungsNr;

    private Adresse adresse;

    private Bankkonto bankkonto;

    private Kontaktdaten kontaktdaten;

    private Emailadresse emailadresse;

}
