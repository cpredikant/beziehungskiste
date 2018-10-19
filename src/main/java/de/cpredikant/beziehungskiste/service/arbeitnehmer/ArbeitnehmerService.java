package de.cpredikant.beziehungskiste.service.arbeitnehmer;

import de.cpredikant.beziehungskiste.model.persistence.partner.ArbeitnehmerEntity;

public interface ArbeitnehmerService {

    ArbeitnehmerEntity createArbeitnehmer(ArbeitnehmerEntity arbeitnehmerEntity);

    ArbeitnehmerEntity readArbeitnehmer(String arbeitnehmerNr);

}
