package de.cpredikant.beziehungskiste.model.persistence.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "ADRESSE", schema = "PARTNER")
public class AdresseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "ADRESSE_GEN", sequenceName = "ADRESSE_SEQ")
    @GeneratedValue(generator = "ADRESSE_GEN")
    @Column(name = "ID")
    private Long id;

    @Version
    @Column(name = "VERSION")
    private Long version;

    @Column(name = "PARNTER_NR", updatable = false, nullable = false, length = 50)
    private String partnerNr;

    @Column(name = "PARTNER_TYP", updatable = false, nullable = false, length = 20)
    private PartnerTyp partnerTyp;

    @Column(name = "STRASSE", length = 300)
    private String strasse;

    @Column(name = "HAUS_NR", length = 20)
    private String hausNr;

    @Column(name = "PLZ", length = 20)
    private String plz;

    @Column(name = "POSTFACH", length = 20)
    private String postfach;

    @Column(name = "STADT", length = 100)
    private String stadt;

    @Column(name = "BUNDSLAND", length = 100)
    private String bundesland;

    @Column(name = "LAND", length = 100)
    private String land;

    @Column(name="HAUPT_ADRESSE", nullable = false)
    private boolean hauptAdresse;

    @Column(name="AUSLAND", nullable = false)
    private boolean ausland;

}
