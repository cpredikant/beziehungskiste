package de.cpredikant.beziehungskiste.model.persistence.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "KONTAKTDATEN", schema = "PARTNER")
public class KontaktdatenEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "KONTAKTDATEN_GEN", sequenceName = "KONTAKTDATEN_SEQ")
    @GeneratedValue(generator = "KONTAKTDATEN_GEN")
    @Column(name = "ID")
    private Long id;

    @Version
    @Column(name = "VERSION")
    private Long version;

    @Column(name = "PARTNER_NR", updatable = false, nullable = false, length = 50)
    private String partnerNr;

    @Column(name = "PARTNER_TYP", updatable = false, nullable = false, length = 20)
    private PartnerTyp partnerTyp;

    @Column(name = "TELEFON_NR", length = 50)
    private String telefonNr;

    @Column(name = "TFAX_NR", length = 50)
    private String faxNr;

    @Column(name = "MOBIL_NR", length = 50)
    private String mobilNr;

    @Column(name = "HAUPT_KONTAKTDATEN", nullable = false)
    private boolean hauptKontaktdaten;

}
