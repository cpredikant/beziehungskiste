package de.cpredikant.beziehungskiste.model.domain.bau;

import de.cpredikant.beziehungskiste.model.enums.bau.SchliessgrundTyp;
import de.cpredikant.beziehungskiste.model.enums.bau.TarifgebietTyp;
import de.cpredikant.beziehungskiste.model.enums.bau.TeilnahmestatusTyp;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class TeilnahmeDaten implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long id;

    private final Long version;

    private String arbeitgeberNr;

    private TeilnahmestatusTyp teilnahmestatusTyp;

    private TarifgebietTyp tarifgebietTyp;

    private LocalDate beginnDatum;

    private LocalDate endeDatum;

    private SchliessgrundTyp schliessgrundTyp;

    private String bemerkung;

}
