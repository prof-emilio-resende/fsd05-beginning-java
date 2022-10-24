package br.com.fit.collections;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void doTry() {
        System.out.println("streams !!!!");

        List.of("One", "TWO", "Three")
            .stream()
            .map(x -> {
                System.out.println("processando...");
                return x.toLowerCase();
            })
            .forEach(System.out::println);

        System.out.println("parallel");

        List.of("One", "TWO", "Three")
            .parallelStream()
            .map(x -> {
                System.out.println("processando...");
                return x.toLowerCase();
            })
            .collect(Collectors.toList())
            .forEach(System.out::println);

        List.of("One", "TWO", "Three")
            .parallelStream()
            .map(x -> {
                System.out.println("processando com tipo de dados diferente...");
                return x.length();
            })
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }

}
