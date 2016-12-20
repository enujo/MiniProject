package book.db;

public class Books {
	private String books_no;
	private String books_name;
	private String books_writer;
	private String books_date;
	private Category category;
	private int books_count;
	private String books_state;
	private String books_publi;
	private String books_img;
	
	public String getBooks_state() {
		return books_state;
	}
	public void setBooks_state(String books_state) {
		this.books_state = books_state;
	}
	public String getBooks_no() {
		return books_no;
	}
	public void setBooks_no(String books_no) {
		this.books_no = books_no;
	}
	public String getBooks_name() {
		return books_name;
	}
	public void setBooks_name(String books_name) {
		this.books_name = books_name;
	}
	public String getBooks_writer() {
		return books_writer;
	}
	public void setBooks_writer(String books_writer) {
		this.books_writer = books_writer;
	}
	public String getBooks_date() {
		return books_date;
	}
	public void setBooks_date(String books_date) {
		this.books_date = books_date;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getBooks_count() {
		return books_count;
	}
	public void setBooks_count(int books_count) {
		this.books_count = books_count;
	}

	public String getBooks_publi() {
		return books_publi;
	}
	public void setBooks_publi(String books_publi) {
		this.books_publi = books_publi;
	}
	public String getBooks_img() {
		return books_img;
	}
	public void setBooks_img(String books_img) {
		this.books_img = books_img;
	}
	@Override
	public String toString() {
		return "Books [books_no=" + books_no + ", books_name=" + books_name + ", books_writer=" + books_writer
				+ ", books_date=" + books_date + ", category=" + category + ", books_count=" + books_count
				+ ", books_state=" + books_state + ", books_publi=" + books_publi + ", books_img=" + books_img + "]";
	}
	
	
}
