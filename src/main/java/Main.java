import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velkommen til Delfinen Svømmerklubben");
        System.out.println("Skriv 'Ja',for at oprette et medlem");
        String jaNej = scanner.nextLine();
        
        while (true){
            String userInput = scanner.nextLine().toLowerCase();

            if(userInput.equals("Ja")){
                System.out.println("Indtast navn: ");
            }



        }



    }
}
