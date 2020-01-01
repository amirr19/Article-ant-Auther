import ir.maktab.java32.homework8.article.domain.Author;
import ir.maktab.java32.homework8.article.repositories.UserRepo;

import java.util.Scanner;

public class MainApp {
    private static UserRepo authorRepo = UserRepo.getInstance();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cmd = 1;
        while (cmd != 0) {

            System.out.println("______________________________________________");
            System.out.println("Here is the Menu! \nPlease choose the number: ");
            System.out.println("1.Log in");
            System.out.println("2.Sing up");
            System.out.println("3.Visit all Article");

            cmd = scanner.nextInt();
            //login
            if (cmd == 1) {
                System.out.println("please insert your user name:");
                String userName = scanner.nextLine();
                System.out.println("please insert your password:");
                long password = scanner.nextLong();
            }
            // sign in
            if (cmd == 2) {
                System.out.println("Username : ");
                String nothing = scanner.nextLine();
                String userName = scanner.nextLine();
                System.out.println("Birth date: ");
                String birthday = scanner.nextLine();
                System.out.println("National Code (is your default password) : ");
                long nationalCode = scanner.nextLong();

                Author user = authorRepo.save(
                        new Author(
                                userName,
                                nationalCode,
                                birthday
                        )
                );
                System.out.println("WELCOME "+user.getUsername()+" !");
            }
            if (cmd == 3) {
                System.out.println("Here is the title of articles.");
                System.out.println("You can choose the number to see all data about the specific article");
            }

        }

    }
}
