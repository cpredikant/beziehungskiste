package de.cpredikant.beziehungskiste.model.domain.partner;


import de.cpredikant.beziehungskiste.model.enums.bau.VertreterTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.AnredeTyp;
import de.cpredikant.beziehungskiste.model.enums.partner.TitelTyp;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "vertreter")
public class Vertreter implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "vertreter_gen", sequenceName = "vertreter_seq")
    @GeneratedValue(generator = "vertreter_gen")
    @Column(name = "id")
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "vertreter_typ")
    private VertreterTyp vertreterTyp;

    @Column(name = "anrede_typ")
    private AnredeTyp anredeTyp;

    @Column(name = "vertreter_typ")
    private TitelTyp titelTyp;

    private String vorname;

    private String nachname;

    @OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "vertreter")
    private Adresse adresse;

}
