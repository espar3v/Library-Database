package esparev.librarydatabase.LibraryConnection;

import java.sql.Date;

/**
 *
 * @author esparev
 */
class Book extends Publication {
	private int idBook;
	private String author;
	private int chapters;
	private Date releaseDate;

	Book() {
		super();
	}
	Book(String author, int chapters, Date releaseDate, String title, String editorial, String category, String language, String format, int pages) {
		super(title, editorial, category, language, format, pages);
		this.author = author;
		this.chapters = chapters;
		this.releaseDate = releaseDate;
	}

	int getIdBook() {
		return idBook;
	}

	void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	String getAuthor() {
		return author;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	int getChapters() {
		return chapters;
	}

	void setChapters(int chapters) {
		this.chapters = chapters;
	}

	Date getReleaseDate() {
		return releaseDate;
	}

	void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
}