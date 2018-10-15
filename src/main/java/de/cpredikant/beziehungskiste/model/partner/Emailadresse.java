package de.cpredikant.beziehungskiste.model.partner;

import lombok.Data;

import java.io.Serializable;

@Data
public class Emailadresse implements Serializable {

    private String email;

    private String emailadressenTyp;

    private String hauptEmailadresse;
}
