package de.cpredikant.beziehungskiste.model.persistence.partner;

import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "BANKKONTO", schema = "PARTNER")
public class BankkontoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "BANKKONTO_GEN", sequenceName = "BANKKONTO_SEQ")
    @GeneratedValue(generator = "BANKKONTO_GEN")
    @Column(name = "ID")
    private Long id;

    @Version
    @Column(name = "VERSION")
    private Long version;

    @Column(name = "PARTNER_NR",updatable = false, nullable = false, length = 50)
    private String partnerNr;

    @Column(name="PARTNER_TYP" ,updatable = false, nullable = false, length = 20)
    private PartnerTyp partnerTyp;

    @Column(name="BIC", length = 20)
    private String bic;

    @Column(name="IBAN", length = 50)
    private String iban;

    @Column(name="KONTO_NR", length = 50)
    private String kontoNr;

    @Column(name="BLZ", length = 20)
    private String blz;

    @Column(name="KONTOINHABER", nullable = false, length = 300)
    private String kontoinhaber;

    @Column(name="WINTERBAU", nullable = false)
    private boolean winterbau;

    @Column(name="EINZAHLUNG", nullable = false)
    private boolean einzahlung;

    @Column(name="AUSZAHLUNG", nullable = false)
    private boolean auszahlung;

    @Column(name="AUSLAND", nullable = false)
    private boolean ausland;

}
