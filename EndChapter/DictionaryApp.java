package EndChapter;

import java.util.Scanner;

public class DictionaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DictionaryManager dictionaryManager = new DictionaryManager("dictionary.txt");

        System.out.println("Dictionary ");
        System.out.println("1. Add new word");
        System.out.println("2. Find word");
        System.out.println("3. Show word");
        System.out.println("4. Delete word");
        System.out.println("5. Exit");
        System.out.print("Selection option: ");

        String choice = scanner.nextLine().trim();

        switch (choice) {
            case "1" :
                System.out.print("Enter English word: ");
                String eng = scanner.nextLine().trim();

                System.out.print("Enter Vietnamese meaning: ");
                String vie = scanner.nextLine().trim();

                dictionaryManager.addWord(eng,vie);
                System.out.println("Added successfully.");
                break;

            case "2":
                System.out.print("Enter English word to find: " );
                String search = scanner.nextLine().trim();

                String meaning = dictionaryManager.findWord(search);
                if (meaning != null) {
                    System.out.print("Vietnamese: " + meaning);
                } else {
                    System.out.println("Word not found.");
                }
                break;

            case "3" :
                System.out.println("----Dictionary Content----");
                dictionaryManager.displayAllWords();
                break;

            case "4" :
                System.out.print("Enter English word to delete: ");
                String deleteWord = scanner.nextLine().trim();

                if (dictionaryManager.deleteWord(deleteWord)) {
                    System.out.println("Deleted successfully");
                } else {
                    System.out.println("Word not found.");
                }
                break;

            case "5" :
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid action. Please try agian.");
                break;
        }
        scanner.close();
    }
}
