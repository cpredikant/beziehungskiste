package de.cpredikant.beziehungskiste.model.domain.partner;

import de.cpredikant.beziehungskiste.model.domain.bau.Verband;
import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.RechtsformTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
public class Arbeitgeber implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String arbeitgeberNr;

    private final Long version;

    private String firmenname;

    private AnredeTyp anredeTyp;

    private String vorname;

    private String nachname;

    private RechtsformTyp rechtsformTyp;

    private Adresse adressen;

    private List<Bankkonto> bankkonto;

    private List<Vertreter> vertreter;

    private List<Kontaktdaten> kontaktdaten;

    private List<Kontaktperson> kontaktpersonen;

    private List<Verband> verband;

}
