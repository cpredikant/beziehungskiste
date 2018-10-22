package de.cpredikant.beziehungskiste.service.partner.arbeitgeber;

import de.cpredikant.beziehungskiste.model.domain.partner.Arbeitgeber;
import de.cpredikant.beziehungskiste.service.partner.adresse.AdresseRepository;
import de.cpredikant.beziehungskiste.service.partner.bankkonto.BankkontoRepository;
import de.cpredikant.beziehungskiste.service.partner.emailadresse.EmailadresseRepository;
import de.cpredikant.beziehungskiste.service.partner.kontaktdaten.KontaktdatenRepository;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Timed
public class ArbeitgeberServiceImpl implements ArbeitgeberService {

    @Autowired
    private ArbeitgeberRepository arbeitgeberRepository;

    @Autowired
    private AdresseRepository adresseRepository;

    @Autowired
    private BankkontoRepository bankkontoRepository;

    @Autowired
    private EmailadresseRepository emailadresseRepository;

    @Autowired
    private KontaktdatenRepository kontaktdatenRepository;

    @Override
    public Arbeitgeber createArbeitgeber(final Arbeitgeber arbeitgeber) {

        return ArbeitgeberMapper.mappe(arbeitgeberRepository.save(ArbeitgeberMapper.mappe(arbeitgeber)));

    }

    @Override
    public Arbeitgeber updateArbeitgeber(final Arbeitgeber arbeitgeber) {
        return createArbeitgeber(arbeitgeber);
    }

    @Override
    public Arbeitgeber readArbeitgeber(final String arbeitgeberNr) {

        return ArbeitgeberMapper.mappe(arbeitgeberRepository.findById(arbeitgeberNr).orElse(null));
    }

    @Override
    public void deleteArbeitgeberById(final String arbeitgeberNr) {

        final Arbeitgeber arbeitgeber = readArbeitgeber(arbeitgeberNr);
        deleteArbeitgeber(arbeitgeber);
    }

    @Override
    public void deleteArbeitgeber(final Arbeitgeber arbeitgeber) {

        arbeitgeberRepository.deleteById(arbeitgeber.getArbeitgeberNr());

    }

}
