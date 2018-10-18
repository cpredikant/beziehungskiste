package de.cpredikant.beziehungskiste.model.domain.partner;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "adresse")
public class Adresse implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "adresse_gen", sequenceName = "adresse_seq")
    @GeneratedValue(generator = "adresse_gen")
    private Long id;

    @Version
    private Long version;

    private String strasse;

    private String hausNr;

    private String plz;

    private String stadt;

    private String land;

    private String bundesland;

    private String postfach;

    private boolean hauptadresse;

    private boolean ausland;

}
