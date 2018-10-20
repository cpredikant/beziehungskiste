package de.cpredikant.beziehungskiste.service.arbeitnehmer;

import de.cpredikant.beziehungskiste.model.domain.partner.Arbeitnehmer;

public interface ArbeitnehmerService {

    Arbeitnehmer createArbeitnehmer(Arbeitnehmer arbeitnehmer);

    Arbeitnehmer updateArbeitnehmer(Arbeitnehmer arbeitnehmer);

    Arbeitnehmer readArbeitnehmer(String arbeitnehmerNr);

}
