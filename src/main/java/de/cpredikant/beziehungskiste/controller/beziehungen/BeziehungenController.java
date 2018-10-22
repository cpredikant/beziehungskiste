package de.cpredikant.beziehungskiste.controller.beziehungen;

import de.cpredikant.beziehungskiste.model.domain.beziehungen.ArbeitgeberArbeitnehmerBeziehung;
import de.cpredikant.beziehungskiste.service.beziehungen.BeziehungenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
public class BeziehungenController {

    @Autowired
    private BeziehungenService beziehungenService;


    @PostMapping("/arbeitgeber/arbeitnehmer")
    public Resource<ArbeitgeberArbeitnehmerBeziehung> erstelleArbeitgeberArbeitnehmerBeziehung(@RequestBody(required = false) final ArbeitgeberArbeitnehmerBeziehung arbeitgeberArbeitnehmerBeziehung) {

        return new Resource<>(beziehungenService.createArbeitgeberArbeitnehmerBeziehung(arbeitgeberArbeitnehmerBeziehung));

    }

    @GetMapping("/arbeitgeber/{arbeitgeberNr}/arbeitnehmer/{arbeitnehmerNr}")
    public Resource<ArbeitgeberArbeitnehmerBeziehung> leseArbeitgeberArbeitnehmerBeziehung(@PathVariable final String arbeitgeberNr, @PathVariable final String arbeitnehmerNr) {

        return new Resource<>(beziehungenService.readArbeitgeberArbeitnehmerBeziehung(arbeitgeberNr, arbeitnehmerNr));

    }

}
