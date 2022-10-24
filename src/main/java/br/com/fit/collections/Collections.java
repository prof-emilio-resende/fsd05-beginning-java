package br.com.fit.collections;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Collections {

    public static void doTry() {
        System.out.println("Collections initializing");
        String[] names = new String[] { "Emilio", "Murta" };
        System.out.println(names);

        Map<String, String> record = new LinkedHashMap() {{
            put("key1", "valor1");
            put("key2", "valor2");
        }};

        System.out.println(record);

        List<Map<String, String>> complexRecord = List.of(
            Map.of("complexKey",  "complexKeyValue"),
            Map.of("complexKey2",  "complexKeyValue2")
        );

        for (Map<String, String> rec : complexRecord) {
            System.out.println(rec.get("complexKey2"));

            for(Map.Entry<String, String> entry : rec.entrySet()) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }

    }
    
}
