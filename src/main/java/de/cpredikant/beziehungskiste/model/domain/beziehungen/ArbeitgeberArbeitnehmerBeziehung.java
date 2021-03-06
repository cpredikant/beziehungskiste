package de.cpredikant.beziehungskiste.model.domain.beziehungen;

import de.cpredikant.beziehungskiste.model.enums.beziehungen.BeziehungsTyp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArbeitgeberArbeitnehmerBeziehung implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long version;

    private String vonArbeitgeberNr;

    private String zuArbeitnehmerNr;

    private BeziehungsTyp beziehungsTyp;

    private LocalDate beginn;

    private LocalDate ende;

}
