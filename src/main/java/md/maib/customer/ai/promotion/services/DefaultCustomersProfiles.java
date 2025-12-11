package md.maib.customer.ai.promotion.services;

import md.maib.customer.ai.promotion.model.Customer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class DefaultCustomersProfiles implements CustomersProfiles {

    public static final Map<String, Customer> customerProfiles = new HashMap<>();

    static {
        Customer customer = new Customer();

        customer.setCreatioId(123);
        customer.setAge(32);
        customer.setSegment("Mass");

        customer.setFullName("Martin Fowler");

        Customer.Fact fact1 = new Customer.Fact();
        fact1.setName("married");
        fact1.setIcon("🤵🏻👰🏻");

        Customer.Fact fact2 = new Customer.Fact();
        fact2.setName("has 2 children");
        fact2.setIcon("🧒");

        Customer.Fact fact3 = new Customer.Fact();
        fact3.setName("has vehicle");
        fact3.setIcon("🚗");

        Customer.Fact fact4 = new Customer.Fact();
        fact4.setName("maibank installed");
        fact4.setIcon("📱");

        Customer.Fact fact5 = new Customer.Fact();
        fact5.setName("scandalous");
        fact5.setIcon("⚠️");

        Customer.Fact fact6 = new Customer.Fact();
        fact6.setName("is employee");
        fact6.setIcon("👔");

        customer.setFacts(Arrays.asList(fact1, fact2, fact3, fact4, fact5, fact6));

        customerProfiles.put(customer.getFullName(), customer);
    }

    @Override
    public Customer find(String id) {
        return customerProfiles.get(id);
    }
}
