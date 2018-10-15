package de.cpredikant.beziehungskiste.model.partner;

import lombok.Data;

@Data
public class Kontaktperson {

    private String kontaktPersonTyp;

    private String anredeTyp;

    private String titelTyp;

    private String vorname;

    private String nachname;

    private Adresse adresse;

    private Kontaktdaten kontaktdaten;

    private Emailadresse emailadresse;

}
