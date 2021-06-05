package esparev.librarydatabase.LibraryConnection;

/**
 *
 * @author esparev
 */
class Magazine extends Publication {
	private int idMagazine;
	private int year;
	private int issue;

	Magazine() {
		super();
	}
	Magazine(int year, int issue, String title, String editorial, String category, String language, String format, int pages) {
		super(title, editorial, category, language, format, pages);
		this.year = year;
		this.issue = issue;
	}

	int getIdMagazine() {
		return idMagazine;
	}

	void setIdMagazine(int idMagazine) {
		this.idMagazine = idMagazine;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}

	int getIssue() {
		return issue;
	}

	void setIssue(int issue) {
		this.issue = issue;
	}
}