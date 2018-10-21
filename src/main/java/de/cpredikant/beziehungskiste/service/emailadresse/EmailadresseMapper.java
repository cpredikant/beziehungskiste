package de.cpredikant.beziehungskiste.service.emailadresse;

import de.cpredikant.beziehungskiste.model.domain.partner.Emailadresse;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import de.cpredikant.beziehungskiste.model.persistence.partner.EmailadresseEntity;

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
}
