package de.cpredikant.beziehungskiste.model.persistence.bau;

import de.cpredikant.beziehungskiste.model.enums.bau.VerbandTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "VERBAND", schema = "BAU")
public class VerbandEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "VERBAND_GEN", sequenceName = "VERBAND_SEQ")
    @GeneratedValue(generator = "VERBAND_GEN")
    @Column(name = "ID")
    private Long id;

    @Version
    @Column(name = "VERSION")
    private Long version;

    @Column(name = "AG_NR", updatable = false, nullable = false, length = 50)
    private String arbeitgeberNr;

    @Column(name = "VERBAND_TYP", updatable = false, nullable = false, length = 200)
    private VerbandTyp verbandTyp;

    @Column(name = "BEGINN_DATUM", nullable = false)
    private LocalDate beginnDatum;

    @Column(name = "ENDE_DATUM")
    private LocalDate endeDatum;

}
