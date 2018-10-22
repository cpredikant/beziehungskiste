package de.cpredikant.beziehungskiste.service.beziehungen;


import de.cpredikant.beziehungskiste.model.domain.beziehungen.ArbeitgeberArbeitnehmerBeziehung;
import org.springframework.stereotype.Service;

@Service
public class BeziehungenServiceImpl implements BeziehungenService {


    @Override
    public ArbeitgeberArbeitnehmerBeziehung createArbeitgeberArbeitnehmerBeziehung(final ArbeitgeberArbeitnehmerBeziehung arbeitgeberArbeitnehmerBeziehung) {
        return arbeitgeberArbeitnehmerBeziehung;
    }

    @Override
    public ArbeitgeberArbeitnehmerBeziehung readArbeitgeberArbeitnehmerBeziehung(final String arbeitgeberNr, final String arbeitnehmerNr) {
        return new ArbeitgeberArbeitnehmerBeziehung();
    }
}
