package ro.esolutions.PopeIsComing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConectorExtern {

    @GetMapping("/churches")
    public String getAllChurches(){


        //de facut o biserica noua

        //in loc de return un text chior, return "... sunt" + numele bisericii;
        Biserica SfMaria = new Biserica();
        SfMaria.nume = "Biserica Sf Maria";
        SfMaria.lunaDeVizita = "iulie";
        SfMaria.tipReligie = "ortodoxa";

        return "Biserica mea este: " + SfMaria.nume;
    }

}

