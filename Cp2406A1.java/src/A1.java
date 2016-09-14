/**
 * Created by jc321013 on 15/09/16.
 */
public class A1 {
    public static void main(String[] args) {


        showWelcome();
        showMenu();
        int opt = getUserMenuChoice();
    }

    private static int getUserMenuChoice() {
        //todo: see prac how to get integer value
        return 1;
    }

    private static void showMenu() {
        System.out.println("1. Start Game");
        System.out.println("2. Exit");
    }

    private static void showWelcome() {
        System.out.println("Welcome");
    }
}
