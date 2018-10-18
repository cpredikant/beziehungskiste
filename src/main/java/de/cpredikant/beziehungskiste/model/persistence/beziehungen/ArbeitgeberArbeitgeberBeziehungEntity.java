package de.cpredikant.beziehungskiste.model.persistence.beziehungen;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "AG_AG_BEZ", schema = "BEZIEHUNGEN")
public class ArbeitgeberArbeitgeberBeziehungEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "AG_AG_BEZ_GEN", sequenceName = "AG_AG_BEZ_SEQ")
    @GeneratedValue(generator = "AG_AG_BEZ_GEN")
    @Column(name="ID")
    private Long id;

    @Version
    @Column(name="VERSION")
    private Long version;

    @Column(name = "VON_AG_NR", length = 50, nullable = false)
    private String vonArbeitgeberNr;

    @Column(name = "ZU_AG_NR", length = 50, nullable = false)
    private String zuArbeitgeberNr;

    @Column(name = "BEGINN_DATUM", nullable = false)
    private LocalDate beginnDatum;

    @Column(name = "ENDE_DATUM")
    private LocalDate endeDatum;

}
