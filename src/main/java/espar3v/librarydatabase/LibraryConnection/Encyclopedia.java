package espar3v.librarydatabase.LibraryConnection;

/**
 *
 * @author jm_es
 */
public class Encyclopedia extends Publication {
    private int idEncyclopedia;
    private int year;
    
    public Encyclopedia() { super(); }

    public Encyclopedia(int year, String title, String editorial, String category, String language, String format, int pages) {
        super(title, editorial, category, language, format, pages);
        this.year = year;
    }

    public int getIdEncyclopedia() {
        return idEncyclopedia;
    }

    public void setIdEncyclopedia(int idEncyclopedia) {
        this.idEncyclopedia = idEncyclopedia;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
