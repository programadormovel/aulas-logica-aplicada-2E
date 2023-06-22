public class Main {
    public static void main(String[] args) {
        // Aula introdutória de Orientação à Objetos
        Pessoa adao = new Pessoa();
        //Declaração de objeto
        Pessoa qualquer;
        // Instanciação de objeto
        qualquer = new Pessoa();
        // Definição do formato da pessoa qualquer
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        qualquer.falar();
        // Criar novos objetos
        // Declarar objetos
        Pessoa rainha;
        // Instanciar objetos
        rainha = new Pessoa();
        // Definir forma do objeto
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        // Definir comportamento do objeto
        rainha.falar();
        System.out.println(rainha.falar("alto"));
        rainha.comer();

        Produto p1 = new Produto(5.00);
        Produto p2 = new Produto();
        Produto p3;
        p3 = new Produto("bala", 2.00);
        p3 = new Produto("chiclete", 4.00);
        p1.preco = 10.0;
        //p1.nome = "chocolate";
        p1.setNome("chocolate");
        
    }
}