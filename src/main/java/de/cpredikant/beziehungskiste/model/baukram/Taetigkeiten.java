package de.cpredikant.beziehungskiste.model.baukram;

import lombok.Data;

import java.io.Serializable;

@Data
public class Taetigkeiten implements Serializable {

    private boolean bau;

    private Taetigkeit taetigkeit;

    private String prozentsatz;


}
