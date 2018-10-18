package de.cpredikant.beziehungskiste.model.persistence.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.KontaktpersonTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.TitelTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "KONTAKTPERSON", schema = "PARTNER")
public class KontaktpersonEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "KONTAKTPERSON_GEN", sequenceName = "KONTAKTPERSON_SEQ")
    @GeneratedValue(generator = "KONTAKTPERSON_GEN")
    @Column(name = "ID")
    private Long id;

    @Version
    @Column(name = "VERSION")
    private Long version;

    @Column(name = "PARTNER_NR", updatable = false, nullable = false, length = 50)
    private String partnerNr;

    @Column(name = "PARTNER_TYP", updatable = false, nullable = false, length = 20)
    private PartnerTyp partnerTyp;

    @Column(name = "KONTAKTPERSON_TYP", nullable = false, length = 20)
    private KontaktpersonTyp kontaktPersonTyp;

    @Column(name = "ANREDE_TYP", nullable = false, length = 20)
    private AnredeTyp anredeTyp;

    @Column(name = "TITEL_TYP", length = 20)
    private TitelTyp titelTyp;

    @Column(name = "VORNAME", nullable = false, length = 100)
    private String vorname;

    @Column(name = "VORNAME", nullable = false, length = 100)
    private String nachname;

}
