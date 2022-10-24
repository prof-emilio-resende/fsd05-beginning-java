package br.com.fit.basics;

public class FlowControl {

    public static final String MONDAY = "monday";
    public static final String TUESDAY = "tuesday";
    public static final String WEDNESDAY = "wednesday";

    public static void doTry(int numero) {
        boolean isEven = ((numero % 2) == 0);
        String texto = "";
        if (isEven) {
            System.out.println();
            switch(numero) {
                case(2):
                    System.out.println("dois...");
                    texto = "dois...";
                    break;
                case(3):
                    System.out.println("3 ... 9");
                    texto = "3...9...";
                case(9):
                    System.out.println("9...");
                    texto = "9...";
                    break;
                default: 
                    System.out.println("padrao ...");
            }
        }

        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
    }

}
