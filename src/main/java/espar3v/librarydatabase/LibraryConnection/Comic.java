package espar3v.librarydatabase.LibraryConnection;

import java.sql.Date;

/**
 *
 * @author jm_es
 */
public class Comic extends Publication {
    private int idComic;
    private String author;
    private Date releaseDate;
    private int issue;
    
    public Comic() { super(); }

    public Comic(String author, Date releaseDate, int issue, String title, String editorial, String category, String language, String format, int pages) {
        super(title, editorial, category, language, format, pages);
        this.author = author;
        this.releaseDate = releaseDate;
        this.issue = issue;
    }

    public int getIdComic() {
        return idComic;
    }

    public void setIdComic(int idComic) {
        this.idComic = idComic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }
    
}
