package br.com.fit.collections;

import java.util.function.Function;

public class Functions {

    public static final String separator = "-->";
    private static final String defaultPrefix = "[prefix]";

    public static Function<String, String> loggerBuilder() {
        return loggerBuilder(defaultPrefix);
    }

    public static Function<String, String> loggerBuilder(String prefix) {
        return loggerBuilder(prefix, separator);
    }


    public static Function<String, String> loggerBuilder(String prefix, String sep) {
        return str -> {
            String txtFinal = String.format("%s %s %s", prefix, sep, str);
            System.out.println(txtFinal);
          
            return txtFinal;
        };
    }

    public static void doTry() {
        Function<String, String> log = Functions
            .loggerBuilder("[prx]", "==>");

        log.apply("Imprimir...");

        Functions
            .loggerBuilder()
            .apply("Imprimir...");
    }

}
