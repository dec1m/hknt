package md.maib.customer.ai.promotion.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import md.maib.customer.ai.promotion.model.Response;
import md.maib.customer.ai.promotion.model.Subject;

public interface GenerationPromoService {

    Response generate(String customerId, Subject theme) throws JsonProcessingException;
}
