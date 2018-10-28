package de.cpredikant.beziehungskiste.service.partner.emailadresse;

import de.cpredikant.beziehungskiste.model.domain.partner.Emailadresse;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import de.cpredikant.beziehungskiste.model.persistence.partner.EmailadresseEntity;

import java.util.ArrayList;
import java.util.List;

public final class EmailadresseMapper {

    private EmailadresseMapper() {
        // Mapper
    }

    public static EmailadresseEntity mappe(final Emailadresse emailadresse, final PartnerTyp partnerTyp, final String partnerNr) {

        final EmailadresseEntity ee = new EmailadresseEntity();

        ee.setId(emailadresse.getId());
        ee.setVersion(emailadresse.getVersion());
        ee.setPartnerTyp(partnerTyp);
        ee.setPartnerNr(partnerNr);

        ee.setEmail(emailadresse.getEmail());
        ee.setEmailadresseTyp(emailadresse.getEmailadresseTyp());
        ee.setHauptEmailadresse(emailadresse.isHauptEmailadresse());

        return ee;
    }

    public static List<EmailadresseEntity> mappe(final List<Emailadresse> emailadresseListe, final PartnerTyp partnerTyp, final String partnerNr) {
        final List<EmailadresseEntity> emailadresseEntities = new ArrayList<>();

        if (emailadresseListe != null) {
            for (final Emailadresse emailadresse : emailadresseListe) {
                emailadresseEntities.add(EmailadresseMapper.mappe(emailadresse, partnerTyp, partnerNr));
            }
        }

        return emailadresseEntities;
    }

    public static Emailadresse mappe(final EmailadresseEntity emailadresseEntity) {

        if (emailadresseEntity == null) {
            return null;
        }

        final Emailadresse e = new Emailadresse();

        e.setId(emailadresseEntity.getId());
        e.setVersion(emailadresseEntity.getVersion());

        e.setEmail(emailadresseEntity.getEmail());
        e.setEmailadresseTyp(emailadresseEntity.getEmailadresseTyp());
        e.setHauptEmailadresse(emailadresseEntity.isHauptEmailadresse());

        return e;
    }

    public static List<Emailadresse> mappe(final Iterable<EmailadresseEntity> emailadresseEntities) {
        final List<Emailadresse> emailadresseListe = new ArrayList<>();

        if (emailadresseEntities != null) {
            for (final EmailadresseEntity emailadresseEntity : emailadresseEntities) {
                emailadresseListe.add(EmailadresseMapper.mappe(emailadresseEntity));
            }
        }

        return emailadresseListe;
    }

}
