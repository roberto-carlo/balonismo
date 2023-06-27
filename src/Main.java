public class Main {
    public static void main(String[] args) {
// Construindo balões
        balao b1 = new balao();
        // Chamando o método voar()
        String resultado = b1.voar(new Combustivel());
        // Exibindo resultado do voo
        System.out.println("Hello world!");
    }
}