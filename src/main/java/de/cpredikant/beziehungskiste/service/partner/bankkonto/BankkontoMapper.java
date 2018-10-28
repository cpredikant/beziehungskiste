package de.cpredikant.beziehungskiste.service.partner.bankkonto;

import de.cpredikant.beziehungskiste.model.domain.partner.Bankkonto;
import de.cpredikant.beziehungskiste.model.enums.partner.PartnerTyp;
import de.cpredikant.beziehungskiste.model.persistence.partner.BankkontoEntity;

import java.util.ArrayList;
import java.util.List;

public final class BankkontoMapper {

    private BankkontoMapper() {
        // Mapper
    }

    public static BankkontoEntity mappe(final Bankkonto bankkonto, final PartnerTyp partnerTyp, final String partnerNr) {

        final BankkontoEntity be = new BankkontoEntity();

        be.setId(bankkonto.getId());
        be.setVersion(bankkonto.getVersion());
        be.setPartnerTyp(partnerTyp);
        be.setPartnerNr(partnerNr);

        be.setKontoinhaber(bankkonto.getKontoinhaber());
        be.setBic(bankkonto.getBic());
        be.setIban(bankkonto.getIban());
        be.setBlz(bankkonto.getBlz());
        be.setKontoNr(bankkonto.getKontoNr());

        be.setAusland(bankkonto.isAusland());
        be.setAuszahlung(bankkonto.isAuszahlung());
        be.setEinzahlung(bankkonto.isEinzahlung());
        be.setWinterbau(bankkonto.isWinterbau());


        return be;
    }

    public static List<BankkontoEntity> mappe(final List<Bankkonto> bankkontoListe, final PartnerTyp partnerTyp, final String partnerNr) {

        final List<BankkontoEntity> bes = new ArrayList<>();

        if (bankkontoListe != null) {
            for (final Bankkonto bankkonto : bankkontoListe) {
                bes.add(BankkontoMapper.mappe(bankkonto, partnerTyp, partnerNr));
            }
        }

        return bes;

    }

    public static Bankkonto mappe(final BankkontoEntity bankkontoEntity) {

        if (bankkontoEntity == null) {
            return null;
        }

        final Bankkonto b = new Bankkonto();

        b.setId(bankkontoEntity.getId());
        b.setVersion(bankkontoEntity.getVersion());

        b.setKontoinhaber(bankkontoEntity.getKontoinhaber());
        b.setBic(bankkontoEntity.getBic());
        b.setIban(bankkontoEntity.getIban());
        b.setBlz(bankkontoEntity.getBlz());
        b.setKontoNr(bankkontoEntity.getKontoNr());

        b.setAusland(bankkontoEntity.isAusland());
        b.setAuszahlung(bankkontoEntity.isAuszahlung());
        b.setEinzahlung(bankkontoEntity.isEinzahlung());
        b.setWinterbau(bankkontoEntity.isWinterbau());

        return b;
    }

    public static List<Bankkonto> mappe(final Iterable<BankkontoEntity> bankkontoEntities) {
        final List<Bankkonto> bankkontoList = new ArrayList<>();

        if (bankkontoEntities != null) {
            for (final BankkontoEntity bankkontoEntity : bankkontoEntities) {
                bankkontoList.add(BankkontoMapper.mappe(bankkontoEntity));
            }
        }

        return bankkontoList;
    }
}
