package Spring.beans;

import Spring.services.FortuneTeller;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneTeller implements FortuneTeller {
    public String getFortune() {
        return "Something nice will happen today.";
    }
}
