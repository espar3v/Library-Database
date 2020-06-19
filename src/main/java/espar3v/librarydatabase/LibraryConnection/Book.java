package espar3v.librarydatabase.LibraryConnection;

import java.sql.Date;

/**
 *
 * @author jm_es
 */
public class Book extends Publication {
    private int idBook;
    private String author;
    private int chapters;
    private Date releaseDate;
    
    public Book() { super(); }

    public Book(String author, int chapters, Date releaseDate, String title, String editorial, String category, String language, String format, int pages) {
        super(title, editorial, category, language, format, pages);
        this.author = author;
        this.chapters = chapters;
        this.releaseDate = releaseDate;
    }
    
    public int getIdBook() {
        return idBook;
    }
    
    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    
}
