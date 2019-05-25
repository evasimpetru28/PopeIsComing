package ro.esolutions.PopeIsComing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ConectorExtern {

    @GetMapping("/churches/{month}")
    public String getAllChurches(@PathVariable String month){

        String raspuns = "Bisericile mele sunt: ";

        List<Biserica> biserici = new ArrayList<>(); // <Biserica> este clasa obiectelor din lista, biserici este numele listei


        Biserica SfMaria = new Biserica();
        SfMaria.nume = "Biserica Sf Maria";
        SfMaria.lunaDeVizita = "iulie";
        SfMaria.tipReligie = "ortodoxa";

        biserici.add(SfMaria);

        Biserica treiSfinti = new Biserica();
        treiSfinti.nume = "Biserica Trei Sfinti";
        treiSfinti.lunaDeVizita = "octombrie";
        treiSfinti.tipReligie = "catolica";

        biserici.add(treiSfinti);

        Biserica sfintiiApostoli = new Biserica();
        sfintiiApostoli.nume = "Catedrala Sfintii Aposotli";
        sfintiiApostoli.lunaDeVizita = "aprilie";
        sfintiiApostoli.tipReligie = "ortodoxa";

        biserici.add(sfintiiApostoli);

        Biserica constantinSiElena = new Biserica();
        constantinSiElena.nume = "Biserica Sfintii Constantin si Elena";
        constantinSiElena.tipReligie = "ortodoxa";
        constantinSiElena.lunaDeVizita = "martie";

        biserici.add(constantinSiElena);

        Biserica SfAndrei = new Biserica();
        SfAndrei.nume = "Biserica Sfantul Andrei";
        SfAndrei.tipReligie = "catolica";
        SfAndrei.lunaDeVizita = "aprilie";

        biserici.add(SfAndrei);

        for (int i = 0; i < biserici.size(); i ++) {
            if (biserici.get(i).lunaDeVizita == month)
                raspuns += biserici.get(i).nume + ", ";
        }


        return raspuns;
    }

}
