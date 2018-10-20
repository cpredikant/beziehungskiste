package de.cpredikant.beziehungskiste.model.domain.util;

import java.util.Random;

public final class PartnerNrGenerator {

    private static final String ARBEITNEHMER_PREFIX = "AN";

    private static final String ARBEITGEBER_PREFIX = "AG";

    private static final String DIENSTLEISTER_PREFIX = "DL";


    private PartnerNrGenerator() {
        // Utils Class
    }

    public static String generiereArbeitnehmerNummer() {

        return PartnerNrGenerator.zufallsZeichenkette(PartnerNrGenerator.ARBEITNEHMER_PREFIX).toString();
    }

    public static String generiereArbeitgeberNummer() {

        return PartnerNrGenerator.zufallsZeichenkette(PartnerNrGenerator.ARBEITGEBER_PREFIX).toString();
    }

    public static String generiereDienstleisterNummer() {

        return PartnerNrGenerator.zufallsZeichenkette(PartnerNrGenerator.DIENSTLEISTER_PREFIX).toString();
    }

    private static StringBuilder zufallsZeichenkette(final String prefix) {

        final StringBuilder sb = new StringBuilder(20);
        sb.append(prefix);

        final String alphabet = "0123456789";
        final Random random = new Random();

        for (int i = 0; i < 18; i++) {
            final char c = alphabet.charAt(random.nextInt(10));
            sb.append(c);
        }

        return sb;
    }
}
