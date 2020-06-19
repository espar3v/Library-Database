package espar3v.librarydatabase.LibraryConnection;

/**
 *
 * @author jm_es
 */
public abstract class Publication {
    protected String title;
    protected String editorial;
    protected String category;
    protected String language;
    protected String format;
    protected int pages;
    
    public Publication() { }

    public Publication(String title, String editorial, String category, String language, String format, int pages) {
        this.title = title;
        this.editorial = editorial;
        this.category = category;
        this.language = language;
        this.format = format;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getLanguage() {
        return language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
}
