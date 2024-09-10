package hu.peterszrnka.sensitivelogging;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceResponse {
    private String message;
    @Sensitive
    private String requestId;
}
