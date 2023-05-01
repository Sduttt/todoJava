import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static TodoFunction myTodoList = new TodoFunction();

    public static void main(String[] args) {
        int command = 0;
        boolean exit = false;

        printCommand();

        while (!exit) {
            System.out.println("Enter a command or press 1 to print the list of commands");
            command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1 -> printCommand();
                case 2 -> myTodoList.printTodolist();
                case 3 -> addItem();
                case 4 -> removeItem();
                case 5 -> searchItem();
                case 6 -> updateItem();
                case 7 -> exit = true;
                default -> System.out.println("Give a valid command");

            }

        }


    }

    public static void printCommand(){
        System.out.println("Commands: " + "\n Press 1 to Print Instructions" + "\n Press 2 to Print Todo List" + "\n Press 3 to add an Item in the list" + "\n Press 4 to remove an item from the list" + "\n Press 5 to search an item from the list" + "\n Press 6 to Update an Item in the list" + "\n Press 7 to exit from the Todo");
    }

    public static void addItem() {
        System.out.println("Enter item to add");
        myTodoList.addItem(scanner.nextLine());
    }

    public static void removeItem() {
        System.out.println("Enter the index of the item you want to delete");
        myTodoList.removeItem(scanner.nextInt()-1);
    }

    public static void searchItem() {

        System.out.println("What do you want to search?");
        String searchItm = scanner.nextLine();

        if(myTodoList.findItem(searchItm) == null) {
            System.out.println("Item not found in your todolist");
        } else System.out.println(searchItm + " was found");
    }

    public static void updateItem() {
        System.out.println("Enter the index of the Item to update: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the new item: ");
        String newItem = scanner.nextLine();

        myTodoList.updateItem(index-1, newItem);
    }

}