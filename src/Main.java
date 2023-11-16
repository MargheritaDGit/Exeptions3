//Scrivere una funzione che provi a dividere un
// numero per 0 e catturi l'eccezione leggendone il messaggio.

public class Main {
    public static void main(String[] args) {

        try {
            System.out.print(divisionNumber(0, 15));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); //metodo che si usa per prendere il messaggio dell'eccezione
        }
    }

    public static int divisionNumber(int numero1, int numero2) { //funzione che divide due numeri
        if (numero1 == 0) {
            throw new ArithmeticException("Non divisibile per 0");
        } else {
            return numero2 / numero1;
        }
    }
}
