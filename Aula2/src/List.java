public class List {
    public static void main(String[] args) {
        numeros();
        System.out.println("  ");
        nomes();
        System.out.println(" ");
        media();


    }

    public static void numeros() {
        int[] numeros = {8, 12, 28, 39, 50};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(" Posição " + i + ": " + numeros[i]);
        }
    }

    public static void nomes() {
        String[] nomes = {"luiz", "joao", "pedro", "carlos", "davi"};
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(" Posição " + i + ": " + nomes[i]);
        }
    }


    public static void nome() {
        String[] nome = {"Ana", "zedbilu", "bilulas"};
        for (int cont = 0; cont < nome.length; cont++) {
            System.out.println(nome[cont]);

        }
    }


    public static void media() {
        double[] notas = {9.9, 0.1, 9.4, 2.0,};

        double some = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[1];
        }
        System.out.println(soma);

        }
}











