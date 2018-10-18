package de.cpredikant.beziehungskiste.model.domain.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.DienstleisterTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.RechtsformTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
public class Dienstleister implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String dienstleisterNr;

    private final Long version;

    private DienstleisterTyp dienstleisterTyp;

    private String frimenname;

    private AnredeTyp anredeTyp;

    private String vorname;

    private String nachname;

    private RechtsformTyp rechtsformTyp;

    private Adresse adresse;

    private List<Kontaktdaten> kontaktdaten;

    private List<Kontaktperson> kontaktPersonen;

    private List<Emailadresse> emailAdressesen;



}
