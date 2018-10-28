package de.cpredikant.beziehungskiste.model.domain.partner;


import de.cpredikant.beziehungskiste.model.enums.bau.VertreterTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.RechtsformTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.TitelTyp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vertreter implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long version;

    private VertreterTyp vertreterTyp;

    private AnredeTyp anredeTyp;

    private TitelTyp titelTyp;

    private RechtsformTyp rechtsformTyp;

    private String firmenname;

    private String vorname;

    private String nachname;

    private Adresse adresse;

}
