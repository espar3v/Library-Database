package esparev.librarydatabase.LibraryConnection;

import java.sql.Date;

/**
 *
 * @author esparev
 */
class Newspaper extends Publication {
	private int idNewspaper;
	private Date releaseDate;
	private String location;

	Newspaper() {
		super();
	}
	Newspaper(Date releaseDate, String location, String title, String editorial, String category, String language, String format, int pages) {
		super(title, editorial, category, language, format, pages);
		this.releaseDate = releaseDate;
		this.location = location;
	}

	int getIdNewspaper() {
		return idNewspaper;
	}

	void setIdNewspaper(int idNewspaper) {
		this.idNewspaper = idNewspaper;
	}

	Date getReleaseDate() {
		return releaseDate;
	}

	void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	String getLocation() {
		return location;
	}

	void setLocation(String location) {
		this.location = location;
	}
}