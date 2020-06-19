package espar3v.librarydatabase.LibraryConnection;

import java.sql.Date;

/**
 *
 * @author jm_es
 */
public class Newspaper extends Publication {
    private int idNewspaper;
    private Date releaseDate;
    private String location;
    
    public Newspaper() { super(); }

    public Newspaper(Date releaseDate, String location, String title, String editorial, String category, String language, String format, int pages) {
        super(title, editorial, category, language, format, pages);
        this.releaseDate = releaseDate;
        this.location = location;
    }


    public int getIdNewspaper() {
        return idNewspaper;
    }

    public void setIdNewspaper(int idNewspaper) {
        this.idNewspaper = idNewspaper;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
