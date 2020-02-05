package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN"})
@Service("i18service")
public class i18nEnglish implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello babe";
    }
}
