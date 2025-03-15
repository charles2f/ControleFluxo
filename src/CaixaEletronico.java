public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 1000.0;
        double valorSolicitado = 1500.0;

        if (valorSolicitado < saldo) 
            saldo = saldo - valorSolicitado;
        
        System.out.println(saldo);
        
           
        
        //System.out.println("Bem-vindo ao Caixa Eletrônico!");
    }
}
