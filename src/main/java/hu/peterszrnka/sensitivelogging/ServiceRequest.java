package hu.peterszrnka.sensitivelogging;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceRequest {
    @Sensitive
    private String name;
}
