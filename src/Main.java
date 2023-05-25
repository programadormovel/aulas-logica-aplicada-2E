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

    }
}