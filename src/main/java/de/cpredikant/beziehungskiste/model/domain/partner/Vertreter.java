package de.cpredikant.beziehungskiste.model.domain.partner;


import de.cpredikant.beziehungskiste.model.enums.bau.VertreterTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.TitelTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
public class Vertreter implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long version;

    private VertreterTyp vertreterTyp;

    private AnredeTyp anredeTyp;

    private TitelTyp titelTyp;

    private String vorname;

    private String nachname;

    private Adresse adresse;

}
