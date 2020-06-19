package espar3v.librarydatabase.LibraryConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jm_es
 */
public class LibraryDB {
    static LibraryConnection libraryConnection = new LibraryConnection();
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    static String query = "";
    
    public static void createBookDB(Book book) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                query = "INSERT INTO book (`title`, `author`, `editorial`, `language`, `category`, `format`, `pages`, `chapters`, `release_date`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, book.getTitle());
                ps.setString(2, book.getAuthor());
                ps.setString(3, book.getEditorial());
                ps.setString(4, book.getLanguage());
                ps.setString(5, book.getCategory());
                ps.setString(6, book.getFormat());
                ps.setInt(7, book.getPages());
                ps.setInt(8, book.getChapters());
                ps.setDate(9, book.getReleaseDate());
                ps.executeUpdate();
                System.out.println("Book added");
            }
            catch(SQLException ex) {
                System.out.println(ex);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void createMagazineDB(Magazine magazine) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                query = "INSERT INTO `magazine` (`title`, `editorial`, `language`, `category`, `format`, `pages`, `year`, `issue`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, magazine.getTitle());
                ps.setString(2, magazine.getEditorial());
                ps.setString(3, magazine.getLanguage());
                ps.setString(4, magazine.getCategory());
                ps.setString(5, magazine.getFormat());
                ps.setInt(6, magazine.getPages());
                ps.setInt(7, magazine.getYear());
                ps.setInt(8, magazine.getIssue());
                ps.executeUpdate();
                System.out.println("Magazine added");
            }
            catch(SQLException ex) {
                System.out.println(ex);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void createNewspaperDB(Newspaper newspaper) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                query = "INSERT INTO `newspaper` (`title`, `editorial`, `language`, `category`, `format`, `pages`, `release_date`, `location`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, newspaper.getTitle());
                ps.setString(2, newspaper.getEditorial());
                ps.setString(3, newspaper.getLanguage());
                ps.setString(4, newspaper.getCategory());
                ps.setString(5, newspaper.getFormat());
                ps.setInt(6, newspaper.getPages());
                ps.setDate(7, newspaper.getReleaseDate());
                ps.setString(8, newspaper.getLocation());
                ps.executeUpdate();
                System.out.println("Magazine added");
            }
            catch(SQLException ex) {
                System.out.println(ex);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void createEncyclopediaDB(Encyclopedia encyclopedia) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                query = "INSERT INTO `encyclopedia` (`title`, `editorial`, `language`, `category`, `format`, `pages`, `year`) VALUES (?, ?, ?, ?, ?, ?, ?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, encyclopedia.getTitle());
                ps.setString(2, encyclopedia.getEditorial());
                ps.setString(3, encyclopedia.getLanguage());
                ps.setString(4, encyclopedia.getCategory());
                ps.setString(5, encyclopedia.getFormat());
                ps.setInt(6, encyclopedia.getPages());
                ps.setInt(7, encyclopedia.getYear());
                ps.executeUpdate();
                System.out.println("Encyclcopedia added");
            }
            catch(SQLException ex) {
                System.out.println(ex);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void createComicDB(Comic comic) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                query = "INSERT INTO `comic` (`title`, `author`, `editorial`, `language`, `category`, `format`, `pages`, `release_date`, `issue`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, comic.getTitle());
                ps.setString(2, comic.getAuthor());
                ps.setString(3, comic.getEditorial());
                ps.setString(4, comic.getLanguage());
                ps.setString(5, comic.getCategory());
                ps.setString(6, comic.getFormat());
                ps.setInt(7, comic.getPages());
                ps.setDate(8, comic.getReleaseDate());
                ps.setInt(9, comic.getIssue());
                ps.executeUpdate();
                System.out.println("Comic added");
            }
            catch(SQLException ex) {
                System.out.println(ex);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void readBookDB() {
        int i = 0;
        System.out.println("\n==================================");
        System.out.println("========== BOOK SECTION ==========");
        System.out.println("==================================");
        try(Connection connection = libraryConnection.getConnection()) {
            query = "SELECT * FROM book";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                i++;
                System.out.println("------------- BOOK #" + i + " ------------");
                System.out.println("ID:           " + rs.getInt("id_book"));
                System.out.println("TITLE:        " + rs.getString("title"));
                System.out.println("AUTHOR:       " + rs.getString("author"));
                System.out.println("EDITORIAL:    " + rs.getString("editorial"));
                System.out.println("LANGUAGE:     " + rs.getString("language"));
                System.out.println("CATEGORY:     " + rs.getString("category"));
                System.out.println("FORMAT:       " + rs.getString("format"));
                System.out.println("PAGES:        " + rs.getInt("pages"));
                System.out.println("CHAPTERS:     " + rs.getInt("chapters"));
                System.out.println("RELEASE DATE: " + rs.getDate("release_date"));
            }
        }
        catch(SQLException ex) {
            System.out.println("The books couldn't be reached");
            System.out.println(ex);
        }
    }
    
    public static void readMagazineDB() {
        int i = 0;
        System.out.println("\n======================================");
        System.out.println("========== MAGAZINE SECTION ==========");
        System.out.println("======================================");
        try(Connection connection = libraryConnection.getConnection()) {
            query = "SELECT * FROM magazine";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                i++;
                System.out.println("------------- MAGAZINE #" + i + " ------------");
                System.out.println("ID:        " + rs.getInt("id_magazine"));
                System.out.println("TITLE:     " + rs.getString("title"));
                System.out.println("EDITORIAL: " + rs.getString("editorial"));
                System.out.println("LANGUAGE:  " + rs.getString("language"));
                System.out.println("CATEGORY:  " + rs.getString("category"));
                System.out.println("FORMAT:    " + rs.getString("format"));
                System.out.println("PAGES:     " + rs.getInt("pages"));
                System.out.println("YEAR:      " + rs.getInt("year"));
                System.out.println("ISSUE:     " + rs.getInt("issue"));
            }
        }
        catch(SQLException ex) {
            System.out.println("The magazines couldn't be reached");
            System.out.println(ex);
        }
    }
    
    public static void readNewspaperDB() {
        int i = 0;
        System.out.println("\n=======================================");
        System.out.println("========== NEWSPAPER SECTION ==========");
        System.out.println("=======================================");
        try(Connection connection = libraryConnection.getConnection()) {
            query = "SELECT * FROM newspaper";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                i++;
                System.out.println("------------- NEWSPAPER #" + i + " ------------");
                System.out.println("ID:           " + rs.getInt("id_newspaper"));
                System.out.println("TITLE:        " + rs.getString("title"));
                System.out.println("EDITORIAL:    " + rs.getString("editorial"));
                System.out.println("LANGUAGE:     " + rs.getString("language"));
                System.out.println("CATEGORY:     " + rs.getString("category"));
                System.out.println("FORMAT:       " + rs.getString("format"));
                System.out.println("PAGES:        " + rs.getInt("pages"));
                System.out.println("RELEASE DATE: " + rs.getDate("release_date"));
                System.out.println("LOCATION:     " + rs.getString("location"));
            }
            
        }
        catch(SQLException ex) {
            System.out.println("The Newspapers could't be reached");
            System.out.println(ex);
        }
    }
    
    public static void readEncyclopediaDB() {
        int i = 0;
        System.out.println("\n==========================================");
        System.out.println("========== ENCYCLOPEDIA SECTION ==========");
        System.out.println("==========================================");
        try(Connection connection = libraryConnection.getConnection()) {
            query = "SELECT * FROM encyclopedia";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                i++;
                System.out.println("------------- ENCYCLOPEDIA #" + i + " ------------");
                System.out.println("ID:        " + rs.getInt("id_encyclopedia"));
                System.out.println("TITLE:     " + rs.getString("title"));
                System.out.println("EDITORIAL: " + rs.getString("editorial"));
                System.out.println("LANGUAGE:  " + rs.getString("language"));
                System.out.println("CATEGORY:  " + rs.getString("category"));
                System.out.println("FORMAT:    " + rs.getString("format"));
                System.out.println("PAGES:     " + rs.getInt("pages"));
                System.out.println("YEAR:      " + rs.getInt("year"));
            }
        }
        catch(SQLException ex) {
            System.out.println("The Encyclopedias couldn't be reached");
            System.out.println(ex);
        }
    }
    
    public static void readComicDB() {
        int i = 0;
        System.out.println("\n===================================");
        System.out.println("========== COMIC SECTION ==========");
        System.out.println("===================================");
        try(Connection connection = libraryConnection.getConnection()) {
            query = "SELECT * FROM comic";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                i++;
                System.out.println("------------- COMIC #" + i + " ------------");
                System.out.println("ID:           " + rs.getInt("id_comic"));
                System.out.println("TITLE:        " + rs.getString("title"));
                System.out.println("AUTHOR:       " + rs.getString("author"));
                System.out.println("EDITORIAL:    " + rs.getString("editorial"));
                System.out.println("LANGUAGE:     " + rs.getString("language"));
                System.out.println("CATEGORY:     " + rs.getString("category"));
                System.out.println("FORMAT:       " + rs.getString("format"));
                System.out.println("PAGES:        " + rs.getInt("pages"));
                System.out.println("RELEASE DATE: " + rs.getDate("release_date"));
                System.out.println("ISSUE:        " + rs.getInt("issue"));
            }
        }
        catch(SQLException ex) {
            System.out.println("The Comics couldn't be reached");
            System.out.println(ex);
        }
    }
    
    public static void updateBookDB(Book book, int option) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                switch(option) {
                    case 1:
                        query = "UPDATE `book` SET `title` = ? WHERE `book`.`id_book` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, book.getTitle());
                        ps.setInt(2, book.getIdBook());
                        ps.executeUpdate();
                        System.out.println("The TITLE was modified successfully");
                        break;
                    case 2:
                        query = "UPDATE `book` SET `author` = ? WHERE `book`.`id_book` = ?;";
                        ps = connection.prepareCall(query);
                        ps.setString(1, book.getAuthor());
                        ps.setInt(2, book.getIdBook());
                        ps.executeUpdate();
                        System.out.println("The AUTHOR was modified successfully");
                        break;
                    case 3:
                        query = "UPDATE `book` SET `editorial` = ? WHERE `book`.`id_book` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, book.getEditorial());
                        ps.setInt(2, book.getIdBook());
                        ps.executeUpdate();
                        System.out.println("The EDITORIAL was modified successfully");
                        break;
                    case 4:
                        query = "UPDATE `book` SET `language` = ? WHERE `book`.`id_book` = ?;";
                        ps = connection.prepareCall(query);
                        ps.setString(1, book.getLanguage());
                        ps.setInt(2, book.getIdBook());
                        ps.executeUpdate();
                        System.out.println("The LANGUAGE was modified successfully");
                        break;
                    case 5:
                        query = "UPDATE `book` SET `category` = ? WHERE `book`.`id_book` = ?;";
                        ps = connection.prepareCall(query);
                        ps.setString(1, book.getCategory());
                        ps.setInt(2, book.getIdBook());
                        ps.executeUpdate();
                        System.out.println("The CATEGORY was modified successfully");
                        break;
                    case 6:
                        query = "UPDATE `book` SET `format` = ? WHERE `book`.`id_book` = ?;";
                        ps = connection.prepareCall(query);
                        ps.setString(1, book.getFormat());
                        ps.setInt(2, book.getIdBook());
                        ps.executeUpdate();
                        System.out.println("The FORMAT was modified successfully");
                        break;
                    case 7:
                        query = "UPDATE `book` SET `pages` = ? WHERE `book`.`id_book` = ?;";
                        ps = connection.prepareCall(query);
                        ps.setInt(1, book.getPages());
                        ps.setInt(2, book.getIdBook());
                        ps.executeUpdate();
                        System.out.println("The PAGES were modified successfully");
                        break;
                    case 8:
                        query = "UPDATE `book` SET `chapters` = ? WHERE `book`.`id_book` = ?;";
                        ps = connection.prepareCall(query);
                        ps.setInt(1, book.getChapters());
                        ps.setInt(2, book.getIdBook());
                        ps.executeUpdate();
                        System.out.println("The CHAPTERS were modified successfully");
                        break;
                    case 9:
                        query = "UPDATE `book` SET `release_date` = ? WHERE `book`.`id_book` = ?";
                        ps = connection.prepareCall(query);
                        ps.setDate(1, book.getReleaseDate());
                        ps.setInt(2, book.getIdBook());
                        ps.executeUpdate();
                        System.out.println("The RELEASE DATE was modified successfully");
                        break;
                }
            }
            catch(SQLException ex) {
                System.out.println("The Book couldn't be modified");
                System.out.println(ex);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void updateMagazineDB(Magazine magazine, int option) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                switch(option) {
                    case 1:
                        query = "UPDATE `magazine` SET `title` = ? WHERE `magazine`.`id_magazine` = ?";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, magazine.getTitle());
                        ps.setInt(2, magazine.getIdMagazine());
                        ps.executeUpdate();
                        System.out.println("The TITLE was modified successfully");
                        break;
                    case 2:
                        query = "UPDATE `magazine` SET `editorial` = ? WHERE `magazine`.`id_magazine` = ?";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, magazine.getEditorial());
                        ps.setInt(2, magazine.getIdMagazine());
                        ps.executeUpdate();
                        System.out.println("The EDITORIAL was modified successfully");
                        break;
                    case 3:
                        query = "UDPATE `magazine` SET `language` = ? WHERE `magazine`.`id_magazine` = ?";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, magazine.getCategory());
                        ps.setInt(2, magazine.getIdMagazine());
                        ps.executeUpdate();
                        System.out.println("The LANGUAGE was modified successfully");
                        break;
                    case 4:
                        query = "UPDATE `magazine` SET `category` = ? WHERE `magazine`.`id_magazine` = ?";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, magazine.getCategory());
                        ps.setInt(2, magazine.getIdMagazine());
                        ps.executeUpdate();
                        System.out.println("The CATEGORY was modified successfully");
                        break;
                    case 5:
                        query = "UPDATE `magazine` SET `format` = ? WHERE `magazine`.`id_magazine` = ?";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, magazine.getFormat());
                        ps.setInt(2, magazine.getIdMagazine());
                        ps.executeUpdate();
                        System.out.println("The FORMAT was modified successfully");
                        break;
                    case 6:
                        query = "UPDATE `magazine` SET `pages` = ? WHERE `magazine`.`id_magazine` = ?";
                        ps = connection.prepareStatement(query);
                        ps.setInt(1, magazine.getPages());
                        ps.setInt(2, magazine.getIdMagazine());
                        ps.executeUpdate();
                        System.out.println("The PAGES were modified successfully");
                        break;
                    case 7:
                        query = "UPDATE `magazine` SET `year` = ? WHERE `magazine`.`id_magazine` = ?";
                        ps = connection.prepareStatement(query);
                        ps.setInt(1, magazine.getYear());
                        ps.setInt(2, magazine.getIdMagazine());
                        ps.executeUpdate();
                        System.out.println("The YEAR was modified successfully");
                        break;
                    case 8:
                        query = "UPDATE `magazine` SET `issue` = ? WHERE `magazine`.`id_magazine` = ?";
                        ps = connection.prepareStatement(query);
                        ps.setInt(1, magazine.getIssue());
                        ps.setInt(2, magazine.getIdMagazine());
                        ps.executeUpdate();
                        System.out.println("The ISSUE was modified successfully");
                        break;
                }
            }
            catch(SQLException ex) {
                System.out.println("The Magazine couldn't be modified");
                System.out.println(ex);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void updateNewspaperDB(Newspaper newspaper, int option) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                switch(option) {
                    case 1:
                        query = "UPDATE `newspaper` SET `title` = ? WHERE `newspaper`.`id_newspaper` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, newspaper.getTitle());
                        ps.setInt(1, newspaper.getIdNewspaper());
                        ps.executeUpdate();
                        System.out.println("The TITLE was modified successfully");
                        break;
                    case 2:
                        query = "UPDATE `newspaper` SET `editorial` = ? WHERE `newspaper`.`id_newspaper` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, newspaper.getEditorial());
                        ps.setInt(2, newspaper.getIdNewspaper());
                        ps.executeUpdate();
                        System.out.println("The EDITORIAL was modified successfully");
                        break;
                    case 3:
                        query = "UPDATE `newspaper` SET `langauge` = ? WHERE `newspaper`.`id_newspaper` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, newspaper.getLanguage());
                        ps.setInt(2, newspaper.getIdNewspaper());
                        ps.executeUpdate();
                        System.out.println("The LANGUAGE was modified successfully");
                        break;
                    case 4:
                        query = "UPDATE `newspaper` SET `category` = ? WHERE `newspaper`.`id_newspaper` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, newspaper.getCategory());
                        ps.setInt(2, newspaper.getIdNewspaper());
                        ps.executeUpdate();
                        System.out.println("The CATEGORY was modified successfully");
                        break;
                    case 5:
                        query = "UPDATE `newspaper` SET `format` = ? WHERE `newspaper`.`id_newspaper` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, newspaper.getFormat());
                        ps.setInt(2, newspaper.getIdNewspaper());
                        ps.executeUpdate();
                        System.out.println("The FORMAT was modified successfully");
                        break;
                    case 6:
                        query = "UPDATE `newspaper` SET `pages` = ? WHERE `newspaper`.`id_newspaper` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setInt(1, newspaper.getPages());
                        ps.setInt(2, newspaper.getIdNewspaper());
                        ps.executeUpdate();
                        System.out.println("The PAGES were modified successfully");
                        break;
                    case 7:
                        query = "UDPATE `newspaper` SET `release_date` = ? WHERE `newspaper`.`id_newspaper` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setDate(1, newspaper.getReleaseDate());
                        ps.setInt(2, newspaper.getIdNewspaper());
                        ps.executeUpdate();
                        System.out.println("The RELEASE DATE was modified successfully");
                        break;
                    case 8:
                        query = "UPDATE `newspaper` SET `location` = ? WHERE `newspaper`.`id_newspaper` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, newspaper.getLocation());
                        ps.setInt(2, newspaper.getIdNewspaper());
                        ps.executeUpdate();
                        System.out.println("The LOCATION was modified successfully");
                        break;
                }
            }
            catch(SQLException ex) {
                System.out.println("The Newspaper couldn't be modified");
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void updateEncyclopediaDB(Encyclopedia encyclopedia, int option) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                switch(option) {
                    case 1:
                        query = "UDPATE `encyclopedia` SET `title` = ? WHERE `encyclopedia`.`id_encyclopedia` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, encyclopedia.getTitle());
                        ps.setInt(2, encyclopedia.getIdEncyclopedia());
                        ps.executeUpdate();
                        System.out.println("The TITLE was modified successfully");
                        break;
                    case 2:
                        query = "UDPATE `encyclopedia` SET `editorial` = ? WHERE `encyclopedia`.`id_encyclopedia` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, encyclopedia.getEditorial());
                        ps.setInt(2, encyclopedia.getIdEncyclopedia());
                        ps.executeUpdate();
                        System.out.println("The EDITORIAL was modified successfully");
                        break;
                    case 3:
                        query = "UPDATE `encyclopedia` SET `language` = ? WHERE `encyclopedia`.`id_encyclopedia` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, encyclopedia.getLanguage());
                        ps.setInt(2, encyclopedia.getIdEncyclopedia());
                        ps.executeUpdate();
                        System.out.println("The LANGUAGE was modified successfully");
                        break;
                    case 4:
                        query = "UPDATE `encyclopedia` SET `category` = ? WHERE `encyclopedia`.`id_encyclopedia` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, encyclopedia.getCategory());
                        ps.setInt(2, encyclopedia.getIdEncyclopedia());
                        ps.executeUpdate();
                        System.out.println("The CATEGORY was modified successfully");
                        break;
                    case 5:
                        query = "UPDATE `encyclopedia` SET `format` = ? WHERE `encyclopedia`.`id_encyclopedia` = ?;";
                        ps = connection.prepareCall(query);
                        ps.setString(1, encyclopedia.getFormat());
                        ps.setInt(2, encyclopedia.getIdEncyclopedia());
                        ps.executeUpdate();
                        System.out.println("The FORMAT was modified successfully");
                        break;
                    case 6:
                        query = "UPDATE `encyclopedia` SET `pages` = ? WHERE `encyclopedia`.`id_encyclopedia` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setInt(1, encyclopedia.getPages());
                        ps.setInt(2, encyclopedia.getIdEncyclopedia());
                        ps.executeUpdate();
                        System.out.println("The PAGES were modified successfully");
                        break;
                    case 7:
                        query = "UPDATE `encyclopedia` SET `year` = ? WHERE `encyclopedia`.`id_encyclopedia` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setInt(1, encyclopedia.getYear());
                        ps.setInt(2, encyclopedia.getIdEncyclopedia());
                        ps.executeUpdate();
                        System.out.println("The YEAR was modified successfully");
                        break;
                }
            }
            catch(SQLException ex) {
                System.out.println("The Encyclopedia couldn't be modified");
                System.out.println(ex);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void updateComicDB(Comic comic, int option) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                switch(option) {
                    case 1:
                        query = "UPDATE `comic` SET `title` = ? WHERE `comic`.`id_comic` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, comic.getTitle());
                        ps.setInt(2, comic.getIdComic());
                        ps.executeUpdate();
                        System.out.println("The TITLE was modified successfully");
                        break;
                    case 2:
                        query = "UPDATE `comic` SET `author` = ? WHERE `comic`.`id_comic` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, comic.getAuthor());
                        ps.setInt(2, comic.getIdComic());
                        ps.executeUpdate();
                        System.out.println("The AUTHOR was modified successfully");
                        break;
                    case 3:
                        query = "UPDATE `comic` SET `editorial` = ? WHERE `comic`.`id_comic` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, comic.getEditorial());
                        ps.setInt(2, comic.getIdComic());
                        ps.executeUpdate();
                        System.out.println("The EDITORIAL was modified successfully");
                        break;
                    case 4:
                        query = "UPDATE `comic` SET `language` = ? WHERE `comic`.`id_comic` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, comic.getLanguage());
                        ps.setInt(2, comic.getIdComic());
                        ps.executeUpdate();
                        System.out.println("The LANGUAGE was modified successfully");
                        break;
                    case 5:
                        query = "UPDATE `comic` SET `category` = ? WHERE `comic`.`id_comic` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, comic.getCategory());
                        ps.setInt(2, comic.getIdComic());
                        ps.executeUpdate();
                        System.out.println("The CATEGORY was modified successfully");
                        break;
                    case 6:
                        query = "UPDATE `comic` SET `format` = ? WHERE `comic`.`id_comic` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setString(1, comic.getFormat());
                        ps.setInt(2, comic.getIdComic());
                        ps.executeUpdate();
                        System.out.println("The FORMAT was modified successfully");
                        break;
                    case 7:
                        query = "UPDATE `comic` SET `pages` = ? WHERE `comic`.`id_comic` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setInt(1, comic.getPages());
                        ps.setInt(2, comic.getIdComic());
                        ps.executeUpdate();
                        System.out.println("The PAGES were modified successfully");
                        break;
                    case 8:
                        query = "UPDATE `comic` SET `release_date` = ? WHERE `comic`.`id_comic` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setDate(1, comic.getReleaseDate());
                        ps.setInt(2, comic.getIdComic());
                        ps.executeUpdate();
                        System.out.println("The RELEASE DATE was modified successfully");
                        break;
                    case 9:
                        query = "UPDATE `comic` SET `issue` = ? WHERE `comic`.`id_comic` = ?;";
                        ps = connection.prepareStatement(query);
                        ps.setInt(1, comic.getIssue());
                        ps.setInt(2, comic.getIdComic());
                        ps.executeUpdate();
                        System.out.println("The ISSUE was modified successfully");
                        break;
                }
            }
            catch(SQLException ex) {
                System.out.println("The Comic couldn't be modified");
                System.out.println(ex);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void deleteBookDB(int idBook) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                query = "DELETE FROM book WHERE id_book = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, idBook);
                ps.executeUpdate();
                System.out.println("The Book has been deleted");
            }
            catch(SQLException ex) {
                System.out.println("The Book couldn't be deleted");
                System.out.println(ex);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void deleteMagazineDB(int idMagazine) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                query = "DELETE FROM magazine WHERE id_magazine = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, idMagazine);
                ps.executeUpdate();
                System.out.println("The Magazine has been deleted");
            }
            catch(SQLException ex) {
                System.out.println("The Magazine couldn't be deleted");
                System.out.println(ex);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void deleteNewspaperDB(int idNewspaper) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                query = "DELETE FROM newspaper WHERE id_newspaper = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, idNewspaper);
                ps.executeUpdate();
                System.out.println("The Newspaper has been deleted");
            }
            catch(SQLException ex) {
                System.out.println("The Newspaper couldn't be deleted");
                System.out.println(ex);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void deleteEncyclopediaDB(int idEncyclopedia) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                query = "DELETE FROM encyclopedia WHERE id_encyclopedia = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, idEncyclopedia);
                ps.executeUpdate();
                System.out.println("The Encyclopedia has been deleted");
            }
            catch(SQLException ex) {
                System.out.println("The Encyclopedia couldn't be deleted");
                System.out.println(ex);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void deleteComicDB(int idComic) {
        try(Connection connection = libraryConnection.getConnection()) {
            try {
                query = "DELETE FROM comic WHERE id_comic = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, idComic);
                ps.executeUpdate();
                System.out.println("The Comic has been deleted");
            }
            catch(SQLException ex) {
                System.out.println("The Comic couldn't be deleted");
                System.out.println(ex);
            }
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
}
