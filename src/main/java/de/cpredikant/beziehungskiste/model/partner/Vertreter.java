package de.cpredikant.beziehungskiste.model.partner;


import lombok.Data;

import java.io.Serializable;

@Data
public class Vertreter implements Serializable {

    private String vertreterTyp;

    private String anrede;

    private String titel;

    private String vorname;

    private String nachname;

    private Adresse adresse;

}
