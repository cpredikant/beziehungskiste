package de.cpredikant.beziehungskiste.model.domain.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.RechtsformTyp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Arbeitgeber implements Serializable {

    private static final long serialVersionUID = 1L;

    private String arbeitgeberNr;

    private Long version;

    private String firmenname;

    private AnredeTyp anredeTyp;

    private String vorname;

    private String nachname;

    private RechtsformTyp rechtsformTyp;

    private Adresse adresse;

    private List<Kontaktdaten> kontaktdaten;

    private List<Emailadresse> emailadressen;

    private List<Kontaktperson> kontaktpersonen;

    private List<Bankkonto> bankkonten;

    private List<Vertreter> vertreter;

}
