public class Main {
    public static void main(String[] args) {
        // laço enquanto - while
        int contador = 0;
        while(contador < 10){
            System.out.println("Contador = " + contador);
            // incremento
            contador = contador + 1;
        }
        // laço do para faça - for
        for(int x = 0; x < 10; x++){
            System.out.println("Contador = " + x);
        }
        // laço faça enquanto - do while
        int cont = 1;
        do {
            // processo
            System.out.println(cont);
            cont++; //incremento
        }while(cont <= 10);
    }
}