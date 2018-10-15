package de.cpredikant.beziehungskiste.model.partner;

import java.io.Serializable;
import java.util.List;

public class Dienstleister implements Serializable {

    private String dienstleisterTyp;

    private String frimenname;

    private String anredeTyp;

    private String vorname;

    private String nachname;

    private String rechtsform;

    private Adresse adresse;

    private List<Kontaktdaten> kontaktdaten;

    private List<Kontaktperson> kontaktPersonen;

    private List<Emailadresse> emailAdressesen;



}
