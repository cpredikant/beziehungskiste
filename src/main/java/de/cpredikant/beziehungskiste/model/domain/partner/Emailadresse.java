package de.cpredikant.beziehungskiste.model.domain.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.EmailadresseTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "emailadresse")
public class Emailadresse implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "emailadresse_gen", sequenceName = "emailadresse_seq")
    @GeneratedValue(generator = "emailadresse_gen")
    private Long id;

    @Version
    private Long version;

    private String email;

    private EmailadresseTyp emailadresseTyp;

    private String hauptEmailadresse;
}
