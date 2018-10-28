package de.cpredikant.beziehungskiste.service.partner.arbeitgeber;

import de.cpredikant.beziehungskiste.model.domain.partner.*;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import de.cpredikant.beziehungskiste.model.persistence.partner.*;
import de.cpredikant.beziehungskiste.service.partner.adresse.AdresseMapper;
import de.cpredikant.beziehungskiste.service.partner.adresse.AdresseRepository;
import de.cpredikant.beziehungskiste.service.partner.bankkonto.BankkontoMapper;
import de.cpredikant.beziehungskiste.service.partner.bankkonto.BankkontoRepository;
import de.cpredikant.beziehungskiste.service.partner.emailadresse.EmailadresseMapper;
import de.cpredikant.beziehungskiste.service.partner.emailadresse.EmailadresseRepository;
import de.cpredikant.beziehungskiste.service.partner.kontaktdaten.KontaktdatenMapper;
import de.cpredikant.beziehungskiste.service.partner.kontaktdaten.KontaktdatenRepository;
import de.cpredikant.beziehungskiste.service.partner.kontaktperson.KontaktpersonMapper;
import de.cpredikant.beziehungskiste.service.partner.kontaktperson.KontaktpersonRepository;
import de.cpredikant.beziehungskiste.service.partner.vertreter.VertreterMapper;
import de.cpredikant.beziehungskiste.service.partner.vertreter.VertreterRepository;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Timed
public class ArbeitgeberServiceImpl implements ArbeitgeberService {

    @Autowired
    private ArbeitgeberRepository arbeitgeberRepository;

    @Autowired
    private AdresseRepository adresseRepository;

    @Autowired
    private KontaktdatenRepository kontaktdatenRepository;

    @Autowired
    private EmailadresseRepository emailadresseRepository;

    @Autowired
    private KontaktpersonRepository kontaktpersonRepository;

    @Autowired
    private BankkontoRepository bankkontoRepository;

    @Autowired
    private VertreterRepository vertreterRepository;

    @Override
    public Arbeitgeber createArbeitgeber(final Arbeitgeber arbeitgeber) {

        final AdresseEntity adresseEntity =
                adresseRepository.save(AdresseMapper.mappe(
                        arbeitgeber.getAdresse(),
                        PartnerTyp.ARBEITGEBER,
                        arbeitgeber.getArbeitgeberNr()
                ));

        final Iterable<KontaktdatenEntity> kontaktdatenEntities =
                kontaktdatenRepository.saveAll(KontaktdatenMapper.mappe(
                        arbeitgeber.getKontaktdaten(),
                        PartnerTyp.ARBEITGEBER,
                        arbeitgeber.getArbeitgeberNr()
                ));

        final Iterable<EmailadresseEntity> emailadresseEntities =
                emailadresseRepository.saveAll(EmailadresseMapper.mappe(
                        arbeitgeber.getEmailadressen(),
                        PartnerTyp.ARBEITGEBER,
                        arbeitgeber.getArbeitgeberNr()
                ));

        final Iterable<KontaktpersonEntity> kontaktpersonEntities =
                kontaktpersonRepository.saveAll(KontaktpersonMapper.mappe(
                        arbeitgeber.getKontaktpersonen(),
                        PartnerTyp.ARBEITGEBER,
                        arbeitgeber.getArbeitgeberNr()
                ));

        final Iterable<BankkontoEntity> bankkontoEntities =
                bankkontoRepository.saveAll(BankkontoMapper.mappe(
                        arbeitgeber.getBankkonten(),
                        PartnerTyp.ARBEITGEBER,
                        arbeitgeber.getArbeitgeberNr()
                ));

        final Iterable<VertreterEntity> vertreterEntities =
                vertreterRepository.saveAll(VertreterMapper.mappe(
                        arbeitgeber.getVertreter(),
                        PartnerTyp.ARBEITGEBER,
                        arbeitgeber.getArbeitgeberNr()
                ));

        final ArbeitgeberEntity arbeitgeberEntity = arbeitgeberRepository.save(ArbeitgeberMapper.mappe(arbeitgeber));

        final Adresse adresse = AdresseMapper.mappe(adresseEntity);
        final List<Kontaktdaten> kontaktdatenListe = KontaktdatenMapper.mappe(kontaktdatenEntities);
        final List<Emailadresse> emailadresseListe = EmailadresseMapper.mappe(emailadresseEntities);
        final List<Kontaktperson> kontaktpersonListe = KontaktpersonMapper.mappe(kontaktpersonEntities);
        final List<Bankkonto> bankkontoListe = BankkontoMapper.mappe(bankkontoEntities);
        final List<Vertreter> vertreterListe = VertreterMapper.mappe(vertreterEntities);

        return ArbeitgeberMapper.mappe(arbeitgeberEntity,
                adresse,
                kontaktdatenListe,
                emailadresseListe,
                kontaktpersonListe,
                bankkontoListe,
                vertreterListe
        );

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
