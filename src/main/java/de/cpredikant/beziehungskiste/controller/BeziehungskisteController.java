package de.cpredikant.beziehungskiste.controller;

import de.cpredikant.beziehungskiste.model.domain.partner.Arbeitnehmer;
import de.cpredikant.beziehungskiste.model.domain.util.PartnerGenerator;
import de.cpredikant.beziehungskiste.model.domain.util.PartnerNrGenerator;
import de.cpredikant.beziehungskiste.service.arbeitnehmer.ArbeitnehmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BeziehungskisteController {

    @Autowired
    private ArbeitnehmerService arbeitnehmerService;


    @PostMapping("/arbeitnehmer")
    public Resource<Arbeitnehmer> erstelleArbeitnehmer(@RequestBody(required = false) final Arbeitnehmer arbeitnehmer) {

        final Arbeitnehmer an = PartnerGenerator.erzeugeArbeitnehmer(PartnerNrGenerator.generiereArbeitnehmerNummer());

        return new Resource<>(arbeitnehmerService.createArbeitnehmer(an),
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                BeziehungskisteController.class).leseArbeitnehmer(
                                an.getArbeitnehmerNr())).withRel("arbeitnehmer"));

    }

    @GetMapping("/arbeitnehmer/{arbeitnehmerNr}")
    public Resource<Arbeitnehmer> leseArbeitnehmer(@PathVariable final String arbeitnehmerNr) {

        return new Resource<>(arbeitnehmerService.readArbeitnehmer(arbeitnehmerNr),
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                BeziehungskisteController.class).leseArbeitnehmer(arbeitnehmerNr)).withRel("arbeitnehmer"));
    }

    @PutMapping("/arbeitnehmer")
    public Resource<Arbeitnehmer> aktualisiereArbeitnehmer(final Arbeitnehmer arbeitnehmer) {

        //TODO: Nullpointer Bugfixing.

        return new Resource<>(arbeitnehmerService.updateArbeitnehmer(arbeitnehmer),
                ControllerLinkBuilder.linkTo(
                        ControllerLinkBuilder.methodOn(
                                BeziehungskisteController.class).leseArbeitnehmer(arbeitnehmer.getArbeitnehmerNr())).withRel("arbeitnehmer"));
    }

    @DeleteMapping("/arbeitnehmer/{arbeitnehmerNr}")
    public ResponseEntity<?> loescheArbeitnehmer(@PathVariable final String arbeitnehmerNr) {
        //TODO: Implementieren
        return ResponseEntity.noContent().build();
    }


}
