package de.cpredikant.beziehungskiste.model.persistence.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.EmailadresseTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "EMAILADRESSE", schema = "PARTNER")
public class EmailadresseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "EMAILADRESSE_GEN", sequenceName = "EMAILADRESSE_SEQ")
    @GeneratedValue(generator = "EMAILADRESSE_GEN")
    @Column(name = "ID")
    private Long id;

    @Version
    @Column(name = "VERSION")
    private Long version;

    @Column(name = "PARTNER_NR", updatable = false, nullable = false, length = 50)
    private String partnerNr;

    @Column(name = "PARTNER_TYP", updatable = false, nullable = false, length = 20)
    private PartnerTyp partnerTyp;

    @Column(name = "EMAIL", nullable = false, length = 1000)
    private String email;

    @Column(name = "EMAILADRESSE_TYP", nullable = false, length = 20)
    private EmailadresseTyp emailadresseTyp;

    @Column(name = "HAUPT_EMAILADRESSE", nullable = false)
    private boolean hauptEmailadresse;
}
