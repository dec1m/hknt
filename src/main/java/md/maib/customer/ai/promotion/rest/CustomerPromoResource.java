package md.maib.customer.ai.promotion.rest;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import md.maib.customer.ai.promotion.model.Response;
import md.maib.customer.ai.promotion.model.Subject;
import md.maib.customer.ai.promotion.services.GenerationPromoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@AllArgsConstructor
public class CustomerPromoResource {

    private final GenerationPromoService generationPromoService;
    @SneakyThrows
    @GetMapping(path = "/customer/intel/", produces = APPLICATION_JSON_VALUE)
    Response find(@RequestParam String customerId, @RequestParam Subject theme) {
        return generationPromoService.generate(customerId, theme);
    }
}
