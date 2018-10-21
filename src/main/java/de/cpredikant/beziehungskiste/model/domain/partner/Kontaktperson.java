package de.cpredikant.beziehungskiste.model.domain.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.KontaktpersonTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.TitelTyp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kontaktperson implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long version;

    private KontaktpersonTyp kontaktPersonTyp;

    private AnredeTyp anredeTyp;

    private TitelTyp titelTyp;

    private String vorname;

    private String nachname;

    private Adresse adresse;

    private List<Kontaktdaten> kontaktdaten;

    private List<Emailadresse> emailadresse;

}
