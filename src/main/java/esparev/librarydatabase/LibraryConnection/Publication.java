package esparev.librarydatabase.LibraryConnection;

/**
 *
 * @author esparev
 */
abstract class Publication {
	protected String title;
	protected String editorial;
	protected String category;
	protected String language;
	protected String format;
	protected int pages;

	Publication() {	}
	Publication(String title, String editorial, String category, String language, String format, int pages) {
		this.title = title;
		this.editorial = editorial;
		this.category = category;
		this.language = language;
		this.format = format;
		this.pages = pages;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	String getEditorial() {
		return editorial;
	}

	void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	String getCategory() {
		return category;
	}

	void setCategory(String category) {
		this.category = category;
	}

	String getLanguage() {
		return language;
	}

	void setLanguage(String language) {
		this.language = language;
	}

	String getFormat() {
		return format;
	}

	void setFormat(String format) {
		this.format = format;
	}

	int getPages() {
		return pages;
	}

	void setPages(int pages) {
		this.pages = pages;
	}
}