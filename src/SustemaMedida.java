public class SustemaMedida {
    public static void main(String[] args) {
        String sigla = "A";
        
        // Condição com uso de if, elsif e else.
        /*
        if("P".equals(sigla)) 
            System.out.println("PEQUENO");

        else if("M".equals(sigla))
            System.out.println("MÉDIO");

        else if("G".equals(sigla))
            System.out.println("GRANDE");

        else
            System.out.println("TAMANHO DESCONHECIDO");
        
        */

        // Condição com uso de switch.
        switch(sigla) {
            case "P" -> System.out.println("PEQUENO");
            case "M" -> System.out.println("MÉDIO");
            case "G" -> System.out.println("GRANDE");
            default -> System.out.println("TAMANHO DESCONHECIDO");
        }   
        

    }
}
