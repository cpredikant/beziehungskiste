package de.cpredikant.beziehungskiste.model.persistence.bau;

import de.cpredikant.beziehungskiste.model.enums.bau.TaetigkeitTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "TAETIGKEITEN", schema = "BAU")
public class TaetigkeitenEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "TAETIGKEITEN_GEN", sequenceName = "TAETIGKEITEN_SEQ")
    @GeneratedValue(generator = "TAETIGKEITEN_GEN")
    @Column(name="ID")
    private Long id;

    @Version
    @Column(name="VERSION")
    private Long version;

    @Column(name = "AG_NR", updatable = false, nullable = false, length = 50)
    private String arbeitgeberNr;

    @Column(name = "TAETIGKEIT_TYP", updatable = false, nullable = false, length = 20)
    private TaetigkeitTyp taetigkeitTyp;

    @Column(name="PROZENTSATZ", nullable = false, precision = 5, scale = 2)
    private BigDecimal prozentsatz;

    @Column(name = "BEGINN_DATUM", nullable = false)
    private LocalDate beginnDatum;

    @Column(name = "ENDE_DATUM")
    private LocalDate endeDatum;


}
