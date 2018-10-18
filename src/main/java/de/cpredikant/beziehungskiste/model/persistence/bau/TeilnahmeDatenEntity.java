package de.cpredikant.beziehungskiste.model.persistence.bau;

import de.cpredikant.beziehungskiste.model.enums.bau.SchliessgrundTyp;
import de.cpredikant.beziehungskiste.model.enums.bau.TarifgebietTyp;
import de.cpredikant.beziehungskiste.model.enums.bau.TeilnahmestatusTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "TEILNAHME_DATEN", schema = "BAU")
public class TeilnahmeDatenEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "TEILNAHME_DATEN_GEN", sequenceName = "TEILNAHME_DATEN_SEQ")
    @GeneratedValue(generator = "TEILNAHME_DATEN_GEN")
    @Column(name = "ID")
    private Long id;

    @Version
    @Column(name = "VERSION")
    private Long version;

    @Column(name = "AG_NR", updatable = false, nullable = false, length = 50)
    private String arbeitgeberNr;

    @Column(name = "TEILNAHMESTATUS_TYP", nullable = false, length = 20)
    private TeilnahmestatusTyp teilnahmestatusTyp;

    @Column(name = "TARIFGEBIET_TYP", nullable = false, length = 20)
    private TarifgebietTyp tarifgebietTyp;

    @Column(name = "BEGINN_DATUM", nullable = false)
    private LocalDate beginnDatum;

    @Column(name = "ENDE_DATUM")
    private LocalDate endeDatum;

    @Column(name = "SCHLIESSGRUND_TYP", length = 20)
    private SchliessgrundTyp schliessgrundTyp;

    @Column(name = "BEMERKUNG", length = 3000)
    private String bemerkung;
    
}
