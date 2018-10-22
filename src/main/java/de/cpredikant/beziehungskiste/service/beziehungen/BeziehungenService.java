package de.cpredikant.beziehungskiste.service.beziehungen;

import de.cpredikant.beziehungskiste.model.domain.beziehungen.ArbeitgeberArbeitnehmerBeziehung;

public interface BeziehungenService {

    ArbeitgeberArbeitnehmerBeziehung createArbeitgeberArbeitnehmerBeziehung(ArbeitgeberArbeitnehmerBeziehung arbeitgeberArbeitnehmerBeziehung);

    ArbeitgeberArbeitnehmerBeziehung readArbeitgeberArbeitnehmerBeziehung(String arbeitgeberNr, String arbeitnehmerNr);


}
