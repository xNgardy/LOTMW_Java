import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Journey journey = new Journey();

        do{
            System.out.println("!!WELCOME TO THE STORY OF THE MIGHTY WARRIOR!!\n");
            journey.getProlog();
            System.out.println("Please enter 1 if you want to start over, -1 to exit: ");
            choice = scanner.nextInt();

        }while(choice != -1);
    }
}
