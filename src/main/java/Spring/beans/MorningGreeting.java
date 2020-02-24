package Spring.beans;

import Spring.services.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MorningGreeting implements Greeting {
    private HappyFortuneTeller fortuneTeller;

    @Autowired
    public MorningGreeting(HappyFortuneTeller theFortuneTeller){
        fortuneTeller = theFortuneTeller;
    }
    public String getGreeting() {
        return "Good morning!";
    }
    public String getFortune() {
        return fortuneTeller.getFortune();
    }
}
