public class OperadoresLogicos {
    public static void main(String[] args) {
        // ! Negação
        // && E
        // || OU

        boolean teste = true;

        System.out.println(!teste);

        // SAIR > Tenho que ter dinheiro e não pode estar chovendo
        boolean tenhoDinheiro = true;
        boolean estaChovendo = false;

        System.out.println(tenhoDinheiro && !estaChovendo);

        // Quero pagar com cartao

        boolean pagamentoComDinheiro = true;
        boolean pagamentoComCartao = false;

        System.out.println(pagamentoComCartao || pagamentoComDinheiro);
    }
}
