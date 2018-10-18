package de.cpredikant.beziehungskiste.model.persistence.partner;


import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.RechtsformTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.TitelTyp;
import de.cpredikant.beziehungskiste.model.enums.bau.VertreterTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "VERTRETER", schema = "PARTNER")
public class VertreterEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "VERTRETER_GEN", sequenceName = "VERTRETER_SEQ")
    @GeneratedValue(generator = "VERTRETER_GEN")
    @Column(name = "ID")
    private Long id;

    @Version
    @Column(name = "VERSION")
    private Long version;

    @Column(name="PARTNER_NR",updatable = false, nullable = false, length = 50)
    private String partnerNr;

    @Column(name="PARTNER_TYP",updatable = false, nullable = false, length = 20)
    private PartnerTyp partnerTyp;

    @Column(name = "VERTRETER_TYP",nullable = false, length = 20)
    private VertreterTyp vertreterTyp;

    @Column(name="RECHTSFORM_TYP", length = 20)
    private RechtsformTyp rechtsformTyp;

    @Column(name = "FIRMENNAME", length = 3000)
    private String firmenname;

    @Column(name = "ANREDE_TYP", length = 20)
    private AnredeTyp anredeTyp;

    @Column(name = "VERTRETER_TYP", length = 20)
    private TitelTyp titelTyp;

    @Column(name = "VORNAME", length = 100)
    private String vorname;

    @Column(name = "NACHNAME", length = 100)
    private String nachname;


}
