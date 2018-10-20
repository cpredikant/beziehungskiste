package de.cpredikant.beziehungskiste.model.domain.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.EmailadresseTyp;
import lombok.Data;

import java.io.Serializable;

@Data
public class Emailadresse implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long id;

    private final Long version;

    private String email;

    private EmailadresseTyp emailadresseTyp;

    private boolean hauptEmailadresse;
}
