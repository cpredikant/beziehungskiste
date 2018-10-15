package de.cpredikant.beziehungskiste.model.baukram;

import lombok.Data;

import java.io.Serializable;

@Data
public class Taetigkeit implements Serializable {

    private String name;

    private String beschreibung;

    private boolean bau;

}
