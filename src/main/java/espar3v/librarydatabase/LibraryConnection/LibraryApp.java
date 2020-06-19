package espar3v.librarydatabase.LibraryConnection;

import java.util.Scanner;

/**
 *
 * @author jm_es
 */
public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        
        do {
            System.out.println("\n=======================================");
            System.out.println("========== ESPAREV'S LIBRARY ==========");
            System.out.println("=======================================");
            System.out.println("1. Add a new Publication");
            System.out.println("2. Show Publications");
            System.out.println("3. Modify Publication");
            System.out.println("4. Delete Publication");
            System.out.println("0. Exit");
            System.out.print("\nChoose an option: ");
            option = sc.nextInt();

            switch(option) {
                case 1:
                    System.out.println("===== ADD =====");
                    showPublicationMenu();
                    System.out.print("\nChoose a Publication to add: ");
                    int addOption = sc.nextInt();
                    
                    switch(addOption) {
                        case 1:
                            sc.nextLine();
                            LibraryService.createBook();
                            break;
                        case 2:
                            sc.nextLine();
                            LibraryService.createMagazine();
                            break;
                        case 3:
                            sc.nextLine();
                            LibraryService.createNewspaper();
                            break;
                        case 4:
                            sc.nextLine();
                            LibraryService.createEncyclopedia();
                            break;
                        case 5:
                            sc.nextLine();
                            LibraryService.createComic();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("===== SHOW =====");
                    showPublicationMenu();
                    System.out.println("6. All");
                    System.out.print("\nChoose the Publication(s) to show: ");
                    int showOption = sc.nextInt();

                    switch(showOption) {
                        case 1:
                            LibraryService.readBook();
                            break;
                        case 2:
                            LibraryService.readMagazine();
                            break;
                        case 3:
                            LibraryService.readNewspaper();
                            break;
                        case 4:
                            LibraryService.readEncyclopedia();
                            break;
                        case 5:
                            LibraryService.readComic();
                            break;
                        case 6:
                            LibraryService.readBook();
                            LibraryService.readMagazine();
                            LibraryService.readNewspaper();
                            LibraryService.readEncyclopedia();
                            LibraryService.readComic();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("===== MODIFY =====");
                    showPublicationMenu();
                    System.out.print("\nChoose the Publication to modify: ");
                    int modifyOption = sc.nextInt();
                    
                    switch(modifyOption) {
                        case 1:
                            LibraryService.readBook();
                            LibraryService.updateBook();
                            break;
                        case 2:
                            LibraryService.readMagazine();
                            LibraryService.updateMagazine();
                            break;
                        case 3:
                            LibraryService.readNewspaper();
                            LibraryService.updateNewspaper();
                            break;
                        case 4:
                            LibraryService.readEncyclopedia();
                            LibraryService.updateEncyclopedia();
                            break;
                        case 5:
                            LibraryService.readComic();
                            LibraryService.updateComic();
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println("===== DELETE =====");
                    showPublicationMenu();
                    System.out.print("\nChoose the Publication to delete: ");
                    int deleteOption = sc.nextInt();

                    switch(deleteOption) {
                        case 1:
                            LibraryService.readBook();
                            LibraryService.deleteBook();
                            break;
                        case 2:
                            LibraryService.readMagazine();
                            LibraryService.deleteMagazine();
                            break;
                        case 3:
                            LibraryService.readNewspaper();
                            LibraryService.deleteNewspaper();
                            break;
                        case 4:
                            LibraryService.readEncyclopedia();
                            LibraryService.deleteEncyclopedia();
                            break;
                        case 5:
                            LibraryService.readComic();
                            LibraryService.deleteComic();
                            break;
                        default:
                            break;
                    }
                    break;
            }
        } while(option != 0);
        System.out.println("\nTHANK YOU FOR COMING!");
    }
    
    public static void showPublicationMenu() {
        System.out.println("1. Book");
        System.out.println("2. Magazine");
        System.out.println("3. Newspaper");
        System.out.println("4. Encyclopedia");
        System.out.println("5. Comic");
        System.out.println("0. Return");
    }
}
