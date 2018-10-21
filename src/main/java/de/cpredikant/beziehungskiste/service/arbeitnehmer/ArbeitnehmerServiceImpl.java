package de.cpredikant.beziehungskiste.service.arbeitnehmer;

import de.cpredikant.beziehungskiste.model.domain.partner.*;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import de.cpredikant.beziehungskiste.model.persistence.partner.*;
import de.cpredikant.beziehungskiste.service.adresse.AdresseMapper;
import de.cpredikant.beziehungskiste.service.adresse.AdresseRepository;
import de.cpredikant.beziehungskiste.service.bankkonto.BankkontoMapper;
import de.cpredikant.beziehungskiste.service.bankkonto.BankkontoRepository;
import de.cpredikant.beziehungskiste.service.emailadresse.EmailadresseMapper;
import de.cpredikant.beziehungskiste.service.emailadresse.EmailadresseRepository;
import de.cpredikant.beziehungskiste.service.kontaktdaten.KontaktdatenMapper;
import de.cpredikant.beziehungskiste.service.kontaktdaten.KontaktdatenRepository;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Timed
public class ArbeitnehmerServiceImpl implements ArbeitnehmerService {

    @Autowired
    private ArbeitnehmerRepository arbeitnehmerRepository;

    @Autowired
    private AdresseRepository adresseRepository;

    @Autowired
    private BankkontoRepository bankkontoRepository;

    @Autowired
    private EmailadresseRepository emailadresseRepository;

    @Autowired
    private KontaktdatenRepository kontaktdatenRepository;

    @Override
    public Arbeitnehmer createArbeitnehmer(final Arbeitnehmer arbeitnehmer) {


        final AdresseEntity adresseEntity = adresseRepository.save(AdresseMapper.mappe(arbeitnehmer.getAdresse(), PartnerTyp.ARBEITNEHMER, arbeitnehmer.getArbeitnehmerNr()));
        final BankkontoEntity bankkontoEntity = bankkontoRepository.save(BankkontoMapper.mappe(arbeitnehmer.getBankkonto(), PartnerTyp.ARBEITNEHMER, arbeitnehmer.getArbeitnehmerNr()));
        final EmailadresseEntity emailadresseEntity = emailadresseRepository.save(EmailadresseMapper.mappe(arbeitnehmer.getEmailadresse(), PartnerTyp.ARBEITNEHMER, arbeitnehmer.getArbeitnehmerNr()));
        final KontaktdatenEntity kontaktdatenEntity = kontaktdatenRepository.save(KontaktdatenMapper.mappe(arbeitnehmer.getKontaktdaten(), PartnerTyp.ARBEITNEHMER, arbeitnehmer.getArbeitnehmerNr()));
        final ArbeitnehmerEntity arbeitnehmerEntity = arbeitnehmerRepository.save(ArbeitnehmerMapper.mappe(arbeitnehmer));

        final Adresse adresse = AdresseMapper.mappe(adresseEntity);
        final Bankkonto bankkonto = BankkontoMapper.mappe(bankkontoEntity);
        final Emailadresse emailadresse = EmailadresseMapper.mappe(emailadresseEntity);
        final Kontaktdaten kontaktdaten = KontaktdatenMapper.mappe(kontaktdatenEntity);

        return ArbeitnehmerMapper.mappe(arbeitnehmerEntity, adresse, kontaktdaten, emailadresse, bankkonto);

    }

    @Override
    public Arbeitnehmer updateArbeitnehmer(final Arbeitnehmer arbeitnehmer) {
        return createArbeitnehmer(arbeitnehmer);
    }

    @Override
    public Arbeitnehmer readArbeitnehmer(final String arbeitnehmerNr) {

        final ArbeitnehmerEntity arbeitnehmerEntity = arbeitnehmerRepository.findById(arbeitnehmerNr).orElse(null);

        final Adresse adresse = AdresseMapper.mappe(adresseRepository.findByPartnerNr(arbeitnehmerNr).orElse(null));
        final Bankkonto bankkonto = BankkontoMapper.mappe(bankkontoRepository.findByPartnerNr(arbeitnehmerNr).orElse(null));
        final Emailadresse emailadresse = EmailadresseMapper.mappe(emailadresseRepository.findByPartnerNr(arbeitnehmerNr).orElse(null));
        final Kontaktdaten kontaktdaten = KontaktdatenMapper.mappe(kontaktdatenRepository.findByPartnerNr(arbeitnehmerNr).orElse(null));


        return ArbeitnehmerMapper.mappe(arbeitnehmerRepository.findById(arbeitnehmerNr).orElse(null), adresse, kontaktdaten, emailadresse, bankkonto);
    }

    @Override
    public void deleteArbeitnehmerById(final String arbeitnehmerNr) {

        final Arbeitnehmer arbeitnehmer = readArbeitnehmer(arbeitnehmerNr);
        deleteArbeitnehmer(arbeitnehmer);
    }

    @Override
    public void deleteArbeitnehmer(final Arbeitnehmer arbeitnehmer) {

        adresseRepository.deleteById(arbeitnehmer.getAdresse().getId());
        emailadresseRepository.deleteById(arbeitnehmer.getEmailadresse().getId());
        kontaktdatenRepository.deleteById(arbeitnehmer.getKontaktdaten().getId());
        bankkontoRepository.deleteById(arbeitnehmer.getBankkonto().getId());
        arbeitnehmerRepository.deleteById(arbeitnehmer.getArbeitnehmerNr());

    }

}
