package espar3v.librarydatabase.LibraryConnection;

import java.sql.Date;
import java.util.Scanner;

/**
 *
 * @author jm_es
 */
public class LibraryService {
    static Scanner sc = new Scanner(System.in);
        
    public static void createBook() {
        System.out.print("TITLE: ");
        String title = sc.nextLine();
        
        System.out.print("AUTHOR: ");
        String author = sc.nextLine();

        System.out.print("EDITORIAL: ");
        String editorial = sc.nextLine();

        System.out.print("LANGUAGE: ");
        String language = sc.nextLine();
        
	System.out.print("CATEGORY: ");
	String category = sc.nextLine();

	System.out.print("FORMAT | ( DIGITAL | HARDCOVER | PAPERBACK ): ");
	String format = sc.nextLine();
        
        System.out.print("RELEASE DATE | (YYYY-MM-DD): ");
        String date = sc.nextLine();
        Date releaseDate = Date.valueOf(date);

	System.out.print("PAGES: ");
        int pages = sc.nextInt();

        System.out.print("CHAPTERS: ");
        int chapters = sc.nextInt();
        
        Book registerBook = new Book();
        registerBook.setTitle(title);
        registerBook.setAuthor(author);
        registerBook.setEditorial(editorial);
        registerBook.setLanguage(language);
        registerBook.setCategory(category);
        registerBook.setFormat(format);
        registerBook.setReleaseDate(releaseDate);
        registerBook.setPages(pages);
        registerBook.setChapters(chapters);
        LibraryDB.createBookDB(registerBook);
    }
    
    public static void createMagazine() {
        System.out.print("TITLE: ");
        String title = sc.nextLine();
        
        System.out.print("EDITORIAL: ");
        String editorial = sc.nextLine();
        
        System.out.print("LANGUAGE: ");
        String language = sc.nextLine();
        
        System.out.print("CATEGORY: ");
	String category = sc.nextLine();

	System.out.print("FORMAT | ( DIGITAL | HARDCOVER | PAPERBACK ): ");
	String format = sc.nextLine();
        
        System.out.print("PAGES: ");
        int pages = sc.nextInt();
        
        System.out.print("YEAR: ");
        int year = sc.nextInt();
        
        System.out.print("ISSUE: ");
        int issue = sc.nextInt();
        
        Magazine registerMagazine = new Magazine();
        registerMagazine.setTitle(title);
        registerMagazine.setEditorial(editorial);
        registerMagazine.setLanguage(language);
        registerMagazine.setCategory(category);
        registerMagazine.setFormat(format);
        registerMagazine.setPages(pages);
        registerMagazine.setYear(year);
        registerMagazine.setIssue(issue);
        LibraryDB.createMagazineDB(registerMagazine);
    }
    
    public static void createNewspaper() {
        System.out.print("TITLE: ");
        String title = sc.nextLine();
        
        System.out.print("EDITORIAL: ");
        String editorial = sc.nextLine();
        
        System.out.print("LANGUAGE: ");
        String language = sc.nextLine();
        
        System.out.print("CATEGORY: ");
	String category = sc.nextLine();

	System.out.print("FORMAT | ( DIGITAL | HARDCOVER | PAPERBACK ): ");
	String format = sc.nextLine();
        
        System.out.print("RELEASE DATE | (YYYY-MM-DD): ");
        String date = sc.nextLine();
        Date releaseDate = Date.valueOf(date);
        
        System.out.print("LOCATION: ");
        String location = sc.nextLine();
        
        System.out.print("PAGES: ");
        int pages = sc.nextInt();
        
        Newspaper registerNewspaper = new Newspaper();
        registerNewspaper.setTitle(title);
        registerNewspaper.setEditorial(editorial);
        registerNewspaper.setLanguage(language);
        registerNewspaper.setCategory(category);
        registerNewspaper.setFormat(format);
        registerNewspaper.setReleaseDate(releaseDate);
        registerNewspaper.setPages(pages);
        registerNewspaper.setLocation(location);
        LibraryDB.createNewspaperDB(registerNewspaper);
    }
    
    public static void createEncyclopedia() {
        System.out.print("TITLE: ");
        String title = sc.nextLine();
        
        System.out.print("EDITORIAL: ");
        String editorial = sc.nextLine();
        
        System.out.print("LANGUAGE: ");
        String language = sc.nextLine();
        
        System.out.print("CATEGORY: ");
	String category = sc.nextLine();

	System.out.print("FORMAT | ( DIGITAL | HARDCOVER | PAPERBACK ): ");
	String format = sc.nextLine();
        
        System.out.print("PAGES: ");
        int pages = sc.nextInt();
        
        System.out.print("YEAR: ");
        int year = sc.nextInt();
        
        Encyclopedia registerEncyclopedia = new Encyclopedia();
        registerEncyclopedia.setTitle(title);
        registerEncyclopedia.setEditorial(editorial);
        registerEncyclopedia.setLanguage(language);
        registerEncyclopedia.setCategory(category);
        registerEncyclopedia.setFormat(format);
        registerEncyclopedia.setPages(pages);
        registerEncyclopedia.setYear(year);
        LibraryDB.createEncyclopediaDB(registerEncyclopedia);
    }
    
    public static void createComic() {
        System.out.print("TITLE: ");
        String title = sc.nextLine();
        
        System.out.print("AUTHOR: ");
        String author = sc.nextLine();

        System.out.print("EDITORIAL: ");
        String editorial = sc.nextLine();

        System.out.print("LANGUAGE: ");
        String language = sc.nextLine();
        
	System.out.print("CATEGORY: ");
	String category = sc.nextLine();

	System.out.print("FORMAT | ( DIGITAL | HARDCOVER | PAPERBACK ): ");
	String format = sc.nextLine();
        
        System.out.print("RELEASE DATE | (YYYY-MM-DD): ");
        String date = sc.nextLine();
        Date releaseDate = Date.valueOf(date);

	System.out.print("PAGES: ");
        int pages = sc.nextInt();
        
        System.out.print("ISSUE: ");
        int issue = sc.nextInt();
        
        Comic registerComic = new Comic();
        registerComic.setTitle(title);
        registerComic.setAuthor(author);
        registerComic.setEditorial(editorial);
        registerComic.setLanguage(language);
        registerComic.setCategory(category);
        registerComic.setFormat(format);
        registerComic.setPages(pages);
        registerComic.setReleaseDate(releaseDate);
        registerComic.setIssue(issue);
        LibraryDB.createComicDB(registerComic);
    }

    public static void readBook() {
        LibraryDB.readBookDB();
    }
    
    public static void readMagazine() {
        LibraryDB.readMagazineDB();
    }
    
    public static void readNewspaper() {
        LibraryDB.readNewspaperDB();
    }
    
    public static void readEncyclopedia() {
        LibraryDB.readEncyclopediaDB();
    }
    
    public static void readComic() {
        LibraryDB.readComicDB();
    }
    
    public static void updateBook() {
        Book updateBook = new Book();
        
        System.out.print("Choose the Book's ID to modify: ");
        int idBook = sc.nextInt();
        
        System.out.println("1. TITLE");
        System.out.println("2. AUTHOR");
        System.out.println("3. EDITORIAL");
        System.out.println("4. LANGUAGE");
        System.out.println("5. CATEGORY");
        System.out.println("6. FORMAT");
        System.out.println("7. PAGES");
        System.out.println("8. CHAPTERS");
        System.out.println("9. RELEASE DATE");
        System.out.print("\nChoose the option you want to modify: ");
        int option = sc.nextInt();
        sc.nextLine();
        
        switch(option) {
            case 1:
                System.out.print("Enter the TITLE: ");
                String title = sc.nextLine();
                
                updateBook.setIdBook(idBook);
                updateBook.setTitle(title);
                break;
            case 2:
                System.out.print("Enter the AUTHOR: ");
                String author = sc.nextLine();
                
                updateBook.setIdBook(idBook);
                updateBook.setAuthor(author);
                break;
            case 3:
                System.out.print("Enter the EDITORIAL: ");
                String editorial = sc.nextLine();
                
                updateBook.setIdBook(idBook);
                updateBook.setEditorial(editorial);
                break;
            case 4:
                System.out.print("Enter the LANGUAGE: ");
                String language = sc.nextLine();
                
                updateBook.setIdBook(idBook);
                updateBook.setLanguage(language);
                break;
            case 5:
                System.out.print("Enter the CATEGORY: ");
                String category = sc.nextLine();
                
                updateBook.setIdBook(idBook);
                updateBook.setCategory(category);
                break;
            case 6:
                System.out.print("Enter the FORMAT: ");
                String format = sc.nextLine();
                
                updateBook.setIdBook(idBook);
                updateBook.setFormat(format);
                break;
            case 7:
                System.out.print("Enter the PAGES: ");
                int pages = sc.nextInt();
                
                updateBook.setIdBook(idBook);
                updateBook.setPages(pages);
                break;
            case 8:
                System.out.print("Enter the CHAPTERS: ");
                int chapters = sc.nextInt();
                
                updateBook.setIdBook(idBook);
                updateBook.setChapters(chapters);
                break;
            case 9:
                System.out.print("Enter the RELEASE DATE: ");
                String date = sc.nextLine();
                Date releaseDate = Date.valueOf(date);

                updateBook.setIdBook(idBook);
                updateBook.setReleaseDate(releaseDate);
                break;
            default:
                break;
        }
        LibraryDB.updateBookDB(updateBook, option);
    }
    
    public static void updateMagazine() {
        Magazine updateMagazine = new Magazine();
        
        System.out.print("Choose the Magazine's ID to modify: ");
        int idMagazine = sc.nextInt();
        
        System.out.println("1. TITLE");
        System.out.println("2. EDITORIAL");
        System.out.println("3. LANGUAGE");
        System.out.println("4. CATEGORY");
        System.out.println("5. FORMAT");
        System.out.println("6. PAGES");
        System.out.println("7. YEAR");
        System.out.println("8. ISSUE");
        System.out.print("\nChoose the option you want to modify: ");
        int option = sc.nextInt();
        sc.nextLine();
        
        switch(option) {
            case 1:
                System.out.print("Enter the TITLE: ");
                String title = sc.nextLine();
                
                updateMagazine.setIdMagazine(idMagazine);
                updateMagazine.setTitle(title);
                break;
            case 2:
                System.out.print("Enter the EDITORIAL: ");
                String editorial = sc.nextLine();
                
                updateMagazine.setIdMagazine(idMagazine);
                updateMagazine.setEditorial(editorial);
                break;
            case 3:
                System.out.print("Enter the LANGUAGE: ");
                String language = sc.nextLine();
                
                updateMagazine.setIdMagazine(idMagazine);
                updateMagazine.setLanguage(language);
                break;
            case 4:
                System.out.print("Enter the CATEGORY: ");
                String category = sc.nextLine();
                
                updateMagazine.setIdMagazine(idMagazine);
                updateMagazine.setCategory(category);
                break;
            case 5:
                System.out.print("Enter the FORMAT: ");
                String format = sc.nextLine();
                
                updateMagazine.setIdMagazine(idMagazine);
                updateMagazine.setFormat(format);
                break;
            case 6:
                System.out.print("Enter the PAGES: ");
                int pages = sc.nextInt();
                
                updateMagazine.setIdMagazine(idMagazine);
                updateMagazine.setPages(pages);
                break;
            case 7:
                System.out.print("Enter the YEAR: ");
                int year = sc.nextInt();
                
                updateMagazine.setIdMagazine(idMagazine);
                updateMagazine.setYear(year);
                break;
            case 8:
                System.out.print("Enter the ISSUE: ");
                int issue = sc.nextInt();
                
                updateMagazine.setIdMagazine(idMagazine);
                updateMagazine.setIssue(issue);
                break;
            default:
                break;
        }
        LibraryDB.updateMagazineDB(updateMagazine, option);
    }
    
    public static void updateNewspaper() {
        Newspaper updateNewspaper = new Newspaper();
        
        System.out.print("Choose the Newspaper's ID to modify: ");
        int idNewspaper = sc.nextInt();
        
        System.out.println("1. TITLE");
        System.out.println("2. EDITORIAL");
        System.out.println("3. LANGUAGE");
        System.out.println("4. CATEGORY");
        System.out.println("5. FORMAT");
        System.out.println("6. PAGES");
        System.out.println("7. RELEASE DATE");
        System.out.println("8. LOCATION");
        System.out.println("0. EXIT");
        System.out.print("\nChoose the option you want to modify: ");
        int option = sc.nextInt();
        sc.nextLine();
        
        switch(option) {
            case 1:
                System.out.print("Enter the TITLE: ");
                String title = sc.nextLine();
                
                updateNewspaper.setIdNewspaper(idNewspaper);
                updateNewspaper.setTitle(title);
                break;
            case 2:
                System.out.print("Enter the EDITORIAL: ");
                String editorial = sc.nextLine();
                
                updateNewspaper.setIdNewspaper(idNewspaper);
                updateNewspaper.setEditorial(editorial);
                break;
            case 3:
                System.out.print("Enter the LANGUAGE: ");
                String language = sc.nextLine();
                
                updateNewspaper.setIdNewspaper(idNewspaper);
                updateNewspaper.setLanguage(language);
                break;
            case 4:
                System.out.print("Enter the CATEGORY: ");
                String category = sc.nextLine();
                
                updateNewspaper.setIdNewspaper(idNewspaper);
                updateNewspaper.setCategory(category);
                break;
            case 5:
                System.out.print("Enter the FORMAT: ");
                String format = sc.nextLine();
                
                updateNewspaper.setIdNewspaper(idNewspaper);
                updateNewspaper.setFormat(format);
                break;
            case 6:
                System.out.print("Enter the PAGES: ");
                int pages = sc.nextInt();
                
                updateNewspaper.setIdNewspaper(idNewspaper);
                updateNewspaper.setPages(pages);
                break;
            case 7:
                System.out.print("Enter the RELEASE DATE: ");
                String date = sc.nextLine();
                Date releaseDate = Date.valueOf(date);
                
                updateNewspaper.setIdNewspaper(idNewspaper);
                updateNewspaper.setReleaseDate(releaseDate);
                break;
            case 8:
                System.out.print("Enter the LOCATION: ");
                String location = sc.nextLine();
                
                updateNewspaper.setIdNewspaper(idNewspaper);
                updateNewspaper.setLocation(location);
                break;
            default:
                break;
        }
        LibraryDB.updateNewspaperDB(updateNewspaper, option);
    }
    
    public static void updateEncyclopedia() {
        Encyclopedia updateEncyclopedia = new Encyclopedia();
        
        System.out.print("Choose the Encyclopedia's ID to modify: ");
        int idEncyclopedia = sc.nextInt();
        
        System.out.println("1. TITLE");
        System.out.println("2. EDITORIAL");
        System.out.println("3. LANGUAGE");
        System.out.println("4. CATEGORY");
        System.out.println("5. FORMAT");
        System.out.println("6. PAGES");
        System.out.println("7. YEAR");
        System.out.print("\nChoose the option you want to modify: ");
        int option = sc.nextInt();
        sc.nextLine();
        
        switch(option) {
            case 1:
                System.out.print("Enter the TITLE: ");
                String title = sc.nextLine();
                
                updateEncyclopedia.setIdEncyclopedia(idEncyclopedia);
                updateEncyclopedia.setTitle(title);
                break;
            case 2:
                System.out.print("Enter the EDITORIAL: ");
                String editorial = sc.nextLine();
                
                updateEncyclopedia.setIdEncyclopedia(idEncyclopedia);
                updateEncyclopedia.setEditorial(editorial);
                break;
            case 3:
                System.out.print("Enter the LANGUAGE: ");
                String language = sc.nextLine();
                
                updateEncyclopedia.setIdEncyclopedia(idEncyclopedia);
                updateEncyclopedia.setLanguage(language);
                break;
            case 4:
                System.out.print("Enter the CATEGORY: ");
                String category = sc.nextLine();
                
                updateEncyclopedia.setIdEncyclopedia(idEncyclopedia);
                updateEncyclopedia.setCategory(category);
                break;
            case 5:
                System.out.print("Enter the FORMAT: ");
                String format = sc.nextLine();
                
                updateEncyclopedia.setIdEncyclopedia(idEncyclopedia);
                updateEncyclopedia.setFormat(format);
                break;
            case 6:
                System.out.print("Enter the PAGES: ");
                int pages = sc.nextInt();
                
                updateEncyclopedia.setIdEncyclopedia(idEncyclopedia);
                updateEncyclopedia.setPages(pages);
                break;
            case 7:
                System.out.print("Enter the YEAR: ");
                int year = sc.nextInt();
                
                updateEncyclopedia.setIdEncyclopedia(idEncyclopedia);
                updateEncyclopedia.setYear(year);
                break;
            default:
                break;
        }
        LibraryDB.updateEncyclopediaDB(updateEncyclopedia, option);
    }
    
    public static void updateComic() {
        Comic updateComic = new Comic();
        
        System.out.print("Choose the Comic's ID to modify: ");
        int idComic = sc.nextInt();
        
        System.out.println("1. TITLE");
        System.out.println("2. AUTHOR");
        System.out.println("3. EDITORIAL");
        System.out.println("4. LANGUAGE");
        System.out.println("5. CATEGORY");
        System.out.println("6. FORMAT");
        System.out.println("7. PAGES");
        System.out.println("8. RELEASE DATE");
        System.out.println("9. ISSUE");
        System.out.print("\nChoose the option to modify: ");
        int option = sc.nextInt();
        sc.nextLine();
        
        switch(option) {
            case 1:
                System.out.print("Enter the TITLE: ");
                String title = sc.nextLine();
                
                updateComic.setIdComic(idComic);
                updateComic.setTitle(title);
                break;
            case 2:
                System.out.print("Enter the AUTHOR: ");
                String author = sc.nextLine();
                
                updateComic.setIdComic(idComic);
                updateComic.setAuthor(author);
                break;
            case 3:
                System.out.print("Enter the EDITORIAL: ");
                String editorial = sc.nextLine();
                
                updateComic.setIdComic(idComic);
                updateComic.setEditorial(editorial);
                break;
            case 4:
                System.out.print("Enter the LANGUAGE: ");
                String language = sc.nextLine();
                
                updateComic.setIdComic(idComic);
                updateComic.setLanguage(language);
                break;
            case 5:
                System.out.print("Enter the CATEGORY: ");
                String category = sc.nextLine();
                
                updateComic.setIdComic(idComic);
                updateComic.setCategory(category);
                break;
            case 6:
                System.out.print("Enter the FORMAT: ");
                String format = sc.nextLine();
                
                updateComic.setIdComic(idComic);
                updateComic.setFormat(format);
                break;
            case 7:
                System.out.print("Enter the PAGES: ");
                int pages = sc.nextInt();
                
                updateComic.setIdComic(idComic);
                updateComic.setPages(pages);
                break;
            case 8:
                System.out.print("Enter the RELEASE DATE: ");
                String date = sc.nextLine();
                Date releaseDate = Date.valueOf(date);
                
                updateComic.setIdComic(idComic);
                updateComic.setReleaseDate(releaseDate);
                break;
            case 9:
                System.out.print("Enter the ISSUE: ");
                int issue = sc.nextInt();
                
                updateComic.setIdComic(idComic);
                updateComic.setIssue(issue);
                break;
            default:
                break;
        }
        LibraryDB.updateComicDB(updateComic, option);
    }
    
    public static void deleteBook() {
        System.out.print("Choose the Book's ID to delete: ");
        int idBook = sc.nextInt();
        LibraryDB.deleteBookDB(idBook);
    }
    
    public static void deleteMagazine() {
        System.out.print("Choose the Magazine's ID to delete: ");
        int idMagazine = sc.nextInt();
        LibraryDB.deleteMagazineDB(idMagazine);
    }
    
    public static void deleteNewspaper() {
        System.out.print("Choose the Newspaper's ID to delete: ");
        int idNewspaper = sc.nextInt();
        LibraryDB.deleteNewspaperDB(idNewspaper);
    }
    
    public static void deleteEncyclopedia() {
        System.out.print("Choose the Encyclopedia's ID to delete: ");
        int idEncyclopedia = sc.nextInt();
        LibraryDB.deleteEncyclopediaDB(idEncyclopedia);
    }
    
    public static void deleteComic() {
        System.out.print("Choose the Comic's ID to delete: ");
        int idComic = sc.nextInt();
        LibraryDB.deleteComicDB(idComic);
    }

}
