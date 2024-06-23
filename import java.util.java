import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosty kalkulator");
        
        // Wczytaj pierwszą liczbę
        System.out.print("Podaj pierwszą liczbę: ");
        double firstNumber = scanner.nextDouble();
        
        // Wczytaj symbol operacji arytmetycznej
        System.out.print("Podaj symbol operacji (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        // Wczytaj drugą liczbę
        System.out.print("Podaj drugą liczbę: ");
        double secondNumber = scanner.nextDouble();
        
        // Zmienna do przechowywania wyniku
        double result;
        boolean validOperation = true;

        // Wykonanie odpowiedniej operacji na podstawie symbolu operacji
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Błąd: Nie można dzielić przez zero.");
                    validOperation = false;
                    result = 0;
                }
                break;
            default:
                System.out.println("Błąd: Nieznany symbol operacji.");
                validOperation = false;
                result = 0;
        }

        // Wyświetlenie wyniku lub komunikatu o błędzie
        if (validOperation) {
            System.out.println("Wynik: " + result);
        }

        // Zakończenie programu po naciśnięciu klawisza Enter
        System.out.println("Naciśnij Enter, aby zakończyć działanie programu.");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Zamknięcie skanera
        scanner.close();
    }
}
