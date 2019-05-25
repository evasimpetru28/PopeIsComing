package ro.esolutions.PopeIsComing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConectorExtern {

    @GetMapping("/churches")
    public String getAllChurches(){
        return "Bisericile mele sunt: ";
    }
}
