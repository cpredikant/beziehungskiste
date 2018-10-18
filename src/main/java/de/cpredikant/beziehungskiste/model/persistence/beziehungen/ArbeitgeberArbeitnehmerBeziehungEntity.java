package de.cpredikant.beziehungskiste.model.persistence.beziehungen;

import de.cpredikant.beziehungskiste.model.enums.beziehungen.BeziehungsTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "ag_an_bez", schema = "BEZIEHUNGEN")
public class ArbeitgeberArbeitnehmerBeziehungEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "ag_an_bez_gen", sequenceName = "ag_an_bez_seq")
    @GeneratedValue(generator = "ag_an_bez_gen")
    @Column(name="ID")
    private Long id;

    @Version
    @Column(name="VERSION")
    private Long version;

    @Column(name = "VON_AG_NR", length = 50, nullable = false)
    private String vonArbeitgeberNr;

    @Column(name = "VON_AN_NR", length = 50, nullable = false)
    private String zuArbeitnehmerNr;

    @Column(name="BEZIEHUNGS_TYP", nullable = false, length = 20)
    private BeziehungsTyp beziehungsTyp;

    @Column(name = "BEGINN_DATUM", nullable = false)
    private LocalDate beginnDatum;

    @Column(name = "ENDE_DATUM")
    private LocalDate endeDatum;

}
