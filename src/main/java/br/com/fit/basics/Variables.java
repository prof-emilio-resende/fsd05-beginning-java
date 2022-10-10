package br.com.fit.basics;

public class Variables {
    public static void doTry() {
        String name = "Emilio";
        int age = 33;
        double height = 1.77;
        
        Double heightObj = 1.77;
        double heightNonObj = heightObj;

        String naoRecomendado = name + "texto fixo";
        System.out.printf("%s %d %.2f %.2f texto fixo...", name, age, height, heightNonObj);
    }
}
