package esparev.librarydatabase.LibraryConnection;

/**
 *
 * @author esparev
 */
class Encyclopedia extends Publication {
	private int idEncyclopedia;
	private int year;

	Encyclopedia() {
		super();
	}
	Encyclopedia(int year, String title, String editorial, String category, String language, String format, int pages) {
		super(title, editorial, category, language, format, pages);
		this.year = year;
	}

	int getIdEncyclopedia() {
		return idEncyclopedia;
	}

	void setIdEncyclopedia(int idEncyclopedia) {
		this.idEncyclopedia = idEncyclopedia;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}
}