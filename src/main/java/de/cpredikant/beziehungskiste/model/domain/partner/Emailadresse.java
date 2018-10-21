package de.cpredikant.beziehungskiste.model.domain.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.EmailadresseTyp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emailadresse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long version;

    private String email;

    private EmailadresseTyp emailadresseTyp;

    private boolean hauptEmailadresse;
}
