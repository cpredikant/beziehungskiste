package de.cpredikant.beziehungskiste.model.domain.partner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Adresse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long version;

    private String strasse;

    private String hausNr;

    private String plz;

    private String stadt;

    private String land;

    private String bundesland;

    private String postfach;

    private boolean hauptAdresse;

    private boolean ausland;

}
