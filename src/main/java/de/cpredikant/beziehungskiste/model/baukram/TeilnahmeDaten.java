package de.cpredikant.beziehungskiste.model.baukram;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
public class TeilnahmeDaten implements Serializable {

    private String arbeitgeberNr;

    private String teilnahmeStatus;

    private List<Taetigkeiten> taetigkeiten;

    private String tarifgebiet;

    private LocalDate beginn;

    private LocalDate ende;

    private String schliessgrund;



}
