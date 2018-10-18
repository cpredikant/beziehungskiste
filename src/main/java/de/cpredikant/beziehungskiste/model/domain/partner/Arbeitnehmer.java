package de.cpredikant.beziehungskiste.model.domain.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.GeschlechtTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.TitelTyp;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class Arbeitnehmer implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String arbeitnehmerNr;

    private final Long version;

    private AnredeTyp anredeTyp;

    private TitelTyp titelTyp;

    private GeschlechtTyp geschlechtTyp;

    private String vorname;

    private String nachname;

    private LocalDate geburtsdatum;

    private String geburtsort;

    private String sozialversicherungsNr;

    private Adresse adresse;

    private Bankkonto bankkonto;

    private Kontaktdaten kontaktdaten;

    private Emailadresse emailadresse;

}
