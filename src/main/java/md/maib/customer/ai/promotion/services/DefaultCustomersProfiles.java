package md.maib.customer.ai.promotion.services;

import md.maib.customer.ai.promotion.model.Customer;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class DefaultCustomersProfiles implements CustomersProfiles {

    public static final Map<String, Customer> CUSTOMERS = new HashMap<>();

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

        Customer vitaliiTiger = new Customer();

        vitaliiTiger.setCreatioId("Vitalii V");
        vitaliiTiger.setAge(27);
        vitaliiTiger.setSegment("Mass");

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

     Customer.Fact vitaliiTigerFact7 = new Customer.Fact();
        vitaliiTigerFact7.setName("has many transactions outside of the country");
        vitaliiTigerFact7.setIcon("💳");
        vitaliiTiger.setFacts(Arrays.asList(viraliiTigerFact1, viraliiTigerFact2,vitaliiTigerFact7, viraliiTigerFact3, viraliiTigerFact4, viraliiTigerFact5, viraliiTigerFact6));


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
        vrFact4.setName("Has monthly transactions more than 20000 lei");
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
        asFact5.setName("Bigger Cashback");
        asFact5.setIcon("💳");

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

        Customer macar = new Customer();

        macar.setCreatioId("Macar S");
        macar.setAge(39);
        macar.setSegment("Premium");

        Customer.Fact macarFact1 = new Customer.Fact();
        macarFact1.setName("married");
        macarFact1.setIcon("🤵🏻👰🏻");

        Customer.Fact macarFact2 = new Customer.Fact();
        macarFact2.setName("has deposits");
        macarFact2.setIcon("💰");

        Customer.Fact macarFact3 = new Customer.Fact();
        macarFact3.setName("has child");
        macarFact3.setIcon("🧒");

        Customer.Fact macarFact4 = new Customer.Fact();
        macarFact4.setName("has vehicle");
        macarFact4.setIcon("🚗");

        Customer.Fact macarFact5 = new Customer.Fact();
        macarFact5.setName("15% reducere la călătoriile cu Letz Taxi");
        macarFact5.setIcon("📱");

        macar.setFacts(Arrays.asList(
                macarFact1,
                macarFact2,
                macarFact3,
                macarFact4,
                macarFact5
        ));


        Customer svetlana = new Customer();

        svetlana.setCreatioId("Svetlana B");
        svetlana.setAge(19);
        svetlana.setSegment("Premium");

        Customer.Fact svetlanaFact1 = new Customer.Fact();
        svetlanaFact1.setName("married");
        svetlanaFact1.setIcon("🤵🏻👰🏻");

        Customer.Fact svetlanaFact2 = new Customer.Fact();
        svetlanaFact2.setName("has deposits");
        svetlanaFact2.setIcon("💰");

        Customer.Fact svetlanaFact3 = new Customer.Fact();
        svetlanaFact3.setName("has child");
        svetlanaFact3.setIcon("🧒");

        Customer.Fact svetlanaFact4 = new Customer.Fact();
        svetlanaFact4.setName("has vehicle");
        svetlanaFact4.setIcon("🚗");

        Customer.Fact svetlanaFact5 = new Customer.Fact();
        svetlanaFact5.setName("has netflix subscription");
        svetlanaFact5.setIcon("📱");

        svetlana.setFacts(Arrays.asList(
                svetlanaFact1,
                svetlanaFact2,
                svetlanaFact3,
                svetlanaFact4,
                svetlanaFact5
        ));

        Customer doina = new Customer();

        doina.setCreatioId("Doina F");
        doina.setAge(21);
        doina.setSegment("Premium");

        Customer.Fact doinaFact1 = new Customer.Fact();
        doinaFact1.setName("married");
        doinaFact1.setIcon("🤵🏻👰🏻");

        Customer.Fact doinaFact2 = new Customer.Fact();
        doinaFact2.setName("has deposits");
        doinaFact2.setIcon("💰");

        Customer.Fact doinaFact3 = new Customer.Fact();
        doinaFact3.setName("Has monthly transactions more than 20000 lei");
        doinaFact3.setIcon("🧒");

        Customer.Fact doinaFact4 = new Customer.Fact();
        doinaFact4.setName("has vehicle");
        doinaFact4.setIcon("🚗");

        Customer.Fact doinaFact5 = new Customer.Fact();
        doinaFact5.setName("maibank installed");
        doinaFact5.setIcon("📱");

        doina.setFacts(Arrays.asList(
                doinaFact1,
                doinaFact2,
                doinaFact3,
                doinaFact4,
                doinaFact5
        ));

        Customer marcel = new Customer();

        marcel.setCreatioId("Marcel T");
        marcel.setAge(33);
        marcel.setSegment("Premium");

        Customer.Fact marcelFact1 = new Customer.Fact();
        marcelFact1.setName("has netflix subscription");
        marcelFact1.setIcon("📱");

        Customer.Fact marcelFact2 = new Customer.Fact();
        marcelFact2.setName("has deposits");
        marcelFact2.setIcon("💰");

        Customer.Fact marcelFact3 = new Customer.Fact();
        marcelFact3.setName("has child");
        marcelFact3.setIcon("🧒");


        marcel.setFacts(Arrays.asList(
                marcelFact1,
                marcelFact2,
                marcelFact3
        ));

        Customer andrii = new Customer();

        andrii.setCreatioId("Andrii G");
        andrii.setAge(34);
        andrii.setSegment("Premium");

        Customer.Fact andriiFact1 = new Customer.Fact();
        andriiFact1.setName("married");
        andriiFact1.setIcon("🤵🏻👰🏻");

        Customer.Fact andriiFact3 = new Customer.Fact();
        andriiFact3.setName("has child");
        andriiFact3.setIcon("🧒");

        Customer.Fact andriiFact2 = new Customer.Fact();
        andriiFact2.setName("Not Alto client");
        andriiFact2.setIcon("🧒");



        andrii.setFacts(Arrays.asList(
                andriiFact1,
                andriiFact2,
                andriiFact3
        ));

        Customer alexandru = new Customer();

        alexandru.setCreatioId("Alexandru S");
        alexandru.setAge(35);
        alexandru.setSegment("Premium");

        Customer.Fact alexandruFact1 = new Customer.Fact();
        alexandruFact1.setName("married");
        alexandruFact1.setIcon("🤵🏻👰🏻");

        Customer.Fact alexandruFact2 = new Customer.Fact();
        alexandruFact2.setName("has salary at maib");
        alexandruFact2.setIcon("💰");

        Customer.Fact alexandruFact4 = new Customer.Fact();
        alexandruFact4.setName("has vehicle");
        alexandruFact4.setIcon("🚗");

        Customer.Fact alexandruFact5 = new Customer.Fact();
        alexandruFact5.setName("maibank installed");
        alexandruFact5.setIcon("📱");

        alexandru.setFacts(Arrays.asList(
                alexandruFact1,
                alexandruFact2,
                alexandruFact4,
                alexandruFact5
        ));


        Customer stas = new Customer();

        stas.setCreatioId("Stanislav D");
        stas.setAge(31);
        stas.setSegment("Premium");

        Customer.Fact stasFact1 = new Customer.Fact();
        stasFact1.setName("married");
        stasFact1.setIcon("🤵🏻👰🏻");

        Customer.Fact stasFact2 = new Customer.Fact();
        stasFact2.setName("has deposits");
        stasFact2.setIcon("💰");

        Customer.Fact stasFact3 = new Customer.Fact();
        stasFact3.setName("has child");
        stasFact3.setIcon("🧒");


        Customer.Fact stasFact5 = new Customer.Fact();
        stasFact5.setName("Not Alto client");
        stasFact5.setIcon("💰");

        stas.setFacts(Arrays.asList(
                stasFact1,
                stasFact2,
                stasFact3,
                stasFact5
        ));

        CUSTOMERS.put(danTiger.getCreatioId(), danTiger);
        CUSTOMERS.put(lilianTiger.getCreatioId(), lilianTiger);
        CUSTOMERS.put(vitaliiTiger.getCreatioId(), vitaliiTiger);
        CUSTOMERS.put(viktorRazhev.getCreatioId(), viktorRazhev);
        CUSTOMERS.put(alionaStratan.getCreatioId(), alionaStratan);
        CUSTOMERS.put(macar.getCreatioId(), macar);
        CUSTOMERS.put(svetlana.getCreatioId(), svetlana);
        CUSTOMERS.put(doina.getCreatioId(), doina);
        CUSTOMERS.put(marcel.getCreatioId(), marcel);
        CUSTOMERS.put(andrii.getCreatioId(), andrii);
        CUSTOMERS.put(alexandru.getCreatioId(), alexandru);
        CUSTOMERS.put(stas.getCreatioId(), stas);

        for (Map.Entry<String, Customer> stringCustomerEntry : CUSTOMERS.entrySet()) {
            System.out.println(stringCustomerEntry.getKey() + " : " + stringCustomerEntry.getValue());
        }

    }

    @Override
    public Customer find(String id) {
        return CUSTOMERS.get(id);
    }
}
