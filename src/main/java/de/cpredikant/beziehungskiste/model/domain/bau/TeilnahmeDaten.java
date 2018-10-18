package de.cpredikant.beziehungskiste.model.domain.bau;

import de.cpredikant.beziehungskiste.model.enums.bau.SchliessgrundTyp;
import de.cpredikant.beziehungskiste.model.enums.bau.TarifgebietTyp;
import de.cpredikant.beziehungskiste.model.enums.bau.TeilnahmestatusTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "teilnahme_daten")
public class TeilnahmeDaten implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long version;

    private String arbeitgeberNr;

    private TeilnahmestatusTyp teilnahmestatusTyp;

    private List<Taetigkeiten> taetigkeiten;

    private TarifgebietTyp tarifgebietTyp;

    private LocalDate beginn;

    private LocalDate ende;

    private SchliessgrundTyp schliessgrundTyp;



}
