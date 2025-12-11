package md.maib.customer.ai.promotion.services;

import org.springframework.stereotype.Service;

@Service
public class DefaultSuggestionProvider implements SuggestionProvider {

    @Override
    public String suggestions() {
        return
                "[\n" +
                        "  {\n" +
                        "    \"icon\": \"\uD83D\uDCB3\",\n" +
                        "    \"name\": \"Gama premium\",\n" +
                        "    \"causes\": [\n" +
                        "      { \"type\": \"cause\",\"name\": \"has many transactions outside of the country\" },\n" +
                        "      { \"type\": \"promotion\", \"name\": \"Cashback majorat\" }\n" +
                        "    ]\n" +
                        "  },\n" +
                        "  {\n" +
                        "    \"icon\": \"\uD83D\uDCB5\",\n" +
                        "    \"name\": \"Credit offer\",\n" +
                        "    \"causes\": [\n" +
                        "      { \"type\": \"cause\",\"name\": \"is employee\" },\n" +
                        "      { \"type\": \"cause\",\"name\": \"has salary at maib\" }\n" +
                        "    ]\n" +
                        "  },\n" +
                        "  {\n" +
                        "    \"icon\": \"\uD83D\uDC8E\",\n" +
                        "    \"name\": \"Become Alto\",\n" +
                        "    \"causes\": [\n" +
                        "      { \"type\": \"cause\",\"name\": \"has deposit with balance greater than 1.5 mln lei\" },\n" +
                        "      { \"type\": \"cause\",\"name\": \"has credit greater than 1.7 mln lei\" },\n" +
                        "      { \"type\": \"cause\",\"name\": \"Not Alto client\" },\n" +
                        "      { \"type\": \"cause\",\"name\": \"Has monthly transactions more than 20000 lei\" }\n" +
                        "    ]\n" +
                        "  },\n" +
                        "  {\n" +
                        "    \"icon\": \"\uD83D\uDE97\",\n" +
                        "    \"name\": \"car assurance\",\n" +
                        "    \"causes\": [\n" +
                        "      { \"type\": \"cause\",\"name\": \"has vehicle\" },\n" +
                        "      { \"type\": \"cause\",\"name\": \"current assurance is expiring\" }\n" +
                        "    ]\n" +
                        "  },\n" +
                        "  {\n" +
                        "    \"icon\": \"\uD83D\uDCB3\",\n" +
                        "    \"name\": \"Gama Card\",\n" +
                        "    \"causes\": [\n" +
                        "      { \"type\": \"cause\",\"name\": \"Bigger Cashback\" },\n" +
                        "      { \"type\": \"promotion\", \"name\": \"O iarnă plină de surprise cu maib și Mastercard\" }\n" +
                        "    ]\n" +
                        "  },\n" +
                        "  {\n" +
                        "    \"name\": \"Visa Card\",\n" +
                        "    \"causes\": [\n" +
                        "      { \"type\": \"promotion\", \"name\": \"15% reducere la călătoriile cu Letz Taxi\" }\n" +
                        "    ]\n" +
                        "  },\n" +
                        "  {\n" +
                        "    \"icon\": \"\uD83D\uDCB3\",\n" +
                        "    \"name\": \"Card red\",\n" +
                        "    \"causes\": [\n" +
                        "      { \"type\": \"cause\",\"name\": \"has netflix subscription\" }\n" +
                        "    ]\n" +
                        "  },\n" +
                        "  {\n" +
                        "    \"icon\": \"\uD83D\uDCB0\",\n" +
                        "    \"name\": \"Open deposit\",\n" +
                        "    \"causes\": [\n" +
                        "      { \"type\": \"cause\",\"name\": \"has non used transaction balance\" }\n" +
                        "    ]\n" +
                        "  }\n" +
                        "]\n";
    }
}
