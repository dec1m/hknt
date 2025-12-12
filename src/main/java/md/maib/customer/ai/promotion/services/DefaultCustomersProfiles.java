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
        Customer danTiger = new Customer();

        danTiger.setCreatioId("Dan V");
        danTiger.setAge(32);
        danTiger.setSegment("Mass");

        Customer.Fact danTigerFact1 = new Customer.Fact();
        danTigerFact1.setName("married");
        danTigerFact1.setIcon("🤵🏻👰🏻");

        Customer.Fact danTigerFact2 = new Customer.Fact();
        danTigerFact2.setName("has 2 children");
        danTigerFact2.setIcon("🧒");

        Customer.Fact danTigerFact3 = new Customer.Fact();
        danTigerFact3.setName("has vehicle");
        danTigerFact3.setIcon("🚗");

        Customer.Fact danTigerFact4 = new Customer.Fact();
        danTigerFact4.setName("maibank installed");
        danTigerFact4.setIcon("📱");

        Customer.Fact danTigerFact5 = new Customer.Fact();
        danTigerFact5.setName("scandalous");
        danTigerFact5.setIcon("⚠️");

        Customer.Fact danTigerFact6 = new Customer.Fact();
        danTigerFact6.setName("is employee");
        danTigerFact6.setIcon("👔");

        danTiger.setFacts(Arrays.asList(danTigerFact1, danTigerFact2, danTigerFact3, danTigerFact4, danTigerFact5, danTigerFact6));

        Customer lilianTiger = new Customer();

        lilianTiger.setCreatioId("Lilian M");
        lilianTiger.setAge(27);
        lilianTiger.setSegment("Mass");

        Customer.Fact lilianTigerFact1 = new Customer.Fact();
        lilianTigerFact1.setName("married");
        lilianTigerFact1.setIcon("🤵🏻👰🏻");

        Customer.Fact lilianTigerFact2 = new Customer.Fact();
        lilianTigerFact2.setName("has 2 children");
        lilianTigerFact2.setIcon("🧒");

        Customer.Fact lilianTigerFact3 = new Customer.Fact();
        lilianTigerFact3.setName("has vehicle");
        lilianTigerFact3.setIcon("🚗");

        Customer.Fact lilianTigerFact4 = new Customer.Fact();
        lilianTigerFact4.setName("maibank installed");
        lilianTigerFact4.setIcon("📱");

        Customer.Fact lilianTigerFact5 = new Customer.Fact();
        lilianTigerFact5.setName("scandalous");
        lilianTigerFact5.setIcon("⚠️");

        Customer.Fact lilianTigerFact6 = new Customer.Fact();
        lilianTigerFact6.setName("is employee");
        lilianTigerFact6.setIcon("👔");

        lilianTiger.setFacts(Arrays.asList(lilianTigerFact1, lilianTigerFact2, lilianTigerFact3, lilianTigerFact4, lilianTigerFact5, lilianTigerFact6));

        Customer viraliiTiger = new Customer();

        viraliiTiger.setCreatioId("Vitalii V");
        viraliiTiger.setAge(27);
        viraliiTiger.setSegment("Mass");

        Customer.Fact viraliiTigerFact1 = new Customer.Fact();
        viraliiTigerFact1.setName("married");
        viraliiTigerFact1.setIcon("🤵🏻👰🏻");

        Customer.Fact viraliiTigerFact2 = new Customer.Fact();
        viraliiTigerFact2.setName("has 2 children");
        viraliiTigerFact2.setIcon("🧒");

        Customer.Fact viraliiTigerFact3 = new Customer.Fact();
        viraliiTigerFact3.setName("has vehicle");
        viraliiTigerFact3.setIcon("🚗");

        Customer.Fact viraliiTigerFact4 = new Customer.Fact();
        viraliiTigerFact4.setName("maibank installed");
        viraliiTigerFact4.setIcon("📱");

        Customer.Fact viraliiTigerFact5 = new Customer.Fact();
        viraliiTigerFact5.setName("scandalous");
        viraliiTigerFact5.setIcon("⚠️");

        Customer.Fact viraliiTigerFact6 = new Customer.Fact();
        viraliiTigerFact6.setName("is employee");
        viraliiTigerFact6.setIcon("👔");

        viraliiTiger.setFacts(Arrays.asList(viraliiTigerFact1, viraliiTigerFact2, viraliiTigerFact3, viraliiTigerFact4, viraliiTigerFact5, viraliiTigerFact6));


        Customer viktorRazhev = new Customer();

        viktorRazhev.setCreatioId("Viktor R");
        viktorRazhev.setAge(34);
        viktorRazhev.setSegment("Mass");

        Customer.Fact vrFact1 = new Customer.Fact();
        vrFact1.setName("married");
        vrFact1.setIcon("🤵🏻👰🏻");

        Customer.Fact vrFact2 = new Customer.Fact();
        vrFact2.setName("has open cards");
        vrFact2.setIcon("💳");

        Customer.Fact vrFact3 = new Customer.Fact();
        vrFact3.setName("has deposits");
        vrFact3.setIcon("💰");

        Customer.Fact vrFact4 = new Customer.Fact();
        vrFact4.setName("has Credits");
        vrFact4.setIcon("💵");

        Customer.Fact vrFact5 = new Customer.Fact();
        vrFact5.setName("has vehicle");
        vrFact5.setIcon("🚗");

        Customer.Fact vrFact6 = new Customer.Fact();
        vrFact6.setName("maibank installed");
        vrFact6.setIcon("📱");

        viktorRazhev.setFacts(Arrays.asList(
                vrFact1,
                vrFact2,
                vrFact3,
                vrFact4,
                vrFact5,
                vrFact6
        ));

        Customer alionaStratan = new Customer();

        alionaStratan.setCreatioId("Aliona S");
        alionaStratan.setAge(27);
        alionaStratan.setSegment("Premium");

        Customer.Fact asFact1 = new Customer.Fact();
        asFact1.setName("married");
        asFact1.setIcon("🤵🏻👰🏻");

        Customer.Fact asFact2 = new Customer.Fact();
        asFact2.setName("has Credits");
        asFact2.setIcon("💵");

        Customer.Fact asFact3 = new Customer.Fact();
        asFact3.setName("has deposits");
        asFact3.setIcon("💰");

        Customer.Fact asFact4 = new Customer.Fact();
        asFact4.setName("has child");
        asFact4.setIcon("🧒");

        Customer.Fact asFact5 = new Customer.Fact();
        asFact5.setName("has vehicle");
        asFact5.setIcon("🚗");

        Customer.Fact asFact6 = new Customer.Fact();
        asFact6.setName("maibank installed");
        asFact6.setIcon("📱");

        alionaStratan.setFacts(Arrays.asList(
                asFact1,
                asFact2,
                asFact3,
                asFact4,
                asFact5,
                asFact6
        ));


        customerProfiles.put(danTiger.getCreatioId(), danTiger);
        customerProfiles.put(lilianTiger.getCreatioId(), lilianTiger);
        customerProfiles.put(viraliiTiger.getCreatioId(), viraliiTiger);
        customerProfiles.put(viktorRazhev.getCreatioId(), viktorRazhev);
        customerProfiles.put(alionaStratan.getCreatioId(), alionaStratan);
    }

    @Override
    public Customer find(String id) {
        return customerProfiles.get(id);
    }
}
