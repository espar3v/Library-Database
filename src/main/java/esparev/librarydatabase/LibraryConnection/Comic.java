package esparev.librarydatabase.LibraryConnection;

import java.sql.Date;

/**
 *
 * @author esparev
 */
class Comic extends Publication {
	private int idComic;
	private String author;
	private Date releaseDate;
	private int issue;

	Comic() {
		super();
	}

	Comic(String author, Date releaseDate, int issue, String title, String editorial, String category, String language, String format, int pages) {
		super(title, editorial, category, language, format, pages);
		this.author = author;
		this.releaseDate = releaseDate;
		this.issue = issue;
	}

	int getIdComic() {
		return idComic;
	}

	void setIdComic(int idComic) {
		this.idComic = idComic;
	}

	String getAuthor() {
		return author;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	Date getReleaseDate() {
		return releaseDate;
	}

	void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	int getIssue() {
		return issue;
	}

	void setIssue(int issue) {
		this.issue = issue;
	}
}