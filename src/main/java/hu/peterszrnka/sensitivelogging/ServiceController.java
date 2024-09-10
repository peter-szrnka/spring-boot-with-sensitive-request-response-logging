package hu.peterszrnka.sensitivelogging;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ServiceController {

    @PostMapping("/service")
    public @ResponseBody ServiceResponse service(@RequestBody ServiceRequest request) {
        ServiceResponse response = new ServiceResponse();
        response.setMessage("Welcome to the sensitive logging demo, " + request.getName() + "!");
        response.setRequestId(UUID.randomUUID().toString());
        return response;
    }
}
