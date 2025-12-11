package md.maib.customer.ai.promotion.services;

import org.springframework.stereotype.Service;

@Service
public class DefaultPromptProvider implements PromptProvider {

    @Override
    public String prompt() {
        return """
                Ты AI-помощник кассира в банке.
                Твоя единственная задача — выбрать 2–3 предложения из списка доступных suggestions.

                ОТВЕТ ДОЛЖЕН БЫТЬ СТРОГО В ФОРМАТЕ JSON.
                Никакого текста. Никаких объяснений. Никаких комментариев.

                ==== СХЕМА ОТВЕТА =====

                {
                  "suggetions": [
                    {
                      "icon": "string | emoji | null",
                      "name": "string",
                      "causes": [
                        {
                          "name": "string",
                          "type": "string (optional)"
                        }
                      ]
                    }
                  ]
                }

                ТРЕБОВАНИЯ:
                - Вернуть ТОЛЬКО JSON.
                - Корневое поле ТОЛЬКО "suggetions".
                - Количество элементов: 2 или 3.
                - Использовать ТОЛЬКО предложения из списка.
                - НЕ писать текст вне JSON.
                """;
    }
}
