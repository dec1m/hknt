package md.maib.customer.ai.promotion.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import md.maib.customer.ai.promotion.model.Response;
import md.maib.customer.ai.promotion.model.Subject;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class DefaultGenerationPromoService implements GenerationPromoService {

    private final CustomersProfiles profiles;
    private final ChatClient chatClient;
    private final SuggestionProvider suggestionProvider;
    private final PromptProvider promtProvider;
    private final ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public Response generate(String customerId, Subject theme) throws JsonProcessingException {
        var customerProfile = profiles.find(customerId);
        var suggestions = chatClient
                .prompt("%s   %s   %s".formatted(
                        "Вот данные клиента: %s".formatted(customerProfile),
                        promtProvider.prompt(),
                        "Доступные предложения: %s".formatted(suggestionProvider.suggestions())
                ))
                .call()
                .content();

        var result = objectMapper.readValue(suggestions, Response.class);
        result.setDetails(customerProfile);
        return result;
    }
}
