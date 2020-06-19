package espar3v.librarydatabase.LibraryConnection;

/**
 *
 * @author jm_es
 */
public class Magazine extends Publication {
    private int idMagazine;
    private int year;
    private int issue;
    
    public Magazine() { super(); }

    public Magazine(int year, int issue, String title, String editorial, String category, String language, String format, int pages) {
        super(title, editorial, category, language, format, pages);
        this.year = year;
        this.issue = issue;
    }

    public int getIdMagazine() {
        return idMagazine;
    }

    public void setIdMagazine(int idMagazine) {
        this.idMagazine = idMagazine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }
    
}
