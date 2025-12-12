package md.maib.customer.ai.promotion.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Customer {

    private String creatioId;
    private int age;
    private String segment;
    private List<Fact> facts;

    @Getter
    @Setter
    @ToString
    @EqualsAndHashCode
    public static class Fact {
        private String name;
        private String icon;
    }
}
