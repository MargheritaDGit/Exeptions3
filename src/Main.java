//Scrivere una funzione che provi a dividere un
// numero per 0 e catturi l'eccezione leggendone il messaggio.

public class Main {
    public static void main(String[] args) {
        divisionNumber(5);
    }

    public static void divisionNumber(int numero1) { //funzione che divide due numeri
        try {
            int risultato = numero1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("L'errore è: " + e.getMessage());
        }
    }
}
