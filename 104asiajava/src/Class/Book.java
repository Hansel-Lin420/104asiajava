package Class;


public class Book {
	private String name, isbn, price, category, publisher, totalPages;

	public Book() {
	}

	public Book(String name1, String isbn1) {
		name = name1;
		isbn = isbn1;
	}

	public Book(String name1, String isbn1, String price1, String category1, String publisher1, String totalPages1) {
		name = name1;
		isbn = isbn1;
		price = price1;
		category = category1;
		publisher = publisher1;
		totalPages = totalPages1;
	}

	public void setName(String name2) {
		name = name2;
	}

	public String getName() {
		return name;
	}

	public void setISBN(String isbn2) {
		isbn = isbn2;
	}

	public String getISBN() {
		return isbn;
	}

	public void setPrice(String price2) {
		price = price2;
	}

	public String getPrice() {
		return price;
	}

	public void setCategory(String category2) {
		category = category2;
	}

	public String getCategory() {
		return category;
	}

	public void setPublisher(String publisher2) {
		publisher = publisher2;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setTotalPages(String totalPages2) {
		totalPages = totalPages2;
	}

	public String getTotalPages() {
		return totalPages;
	}

	public void showInfo() {
		System.out.println("---------------------------------------------------------------");
		System.out.println(this.getName()+","+this.getPublisher()+"(ISBN:"+this.getISBN()+",$"+this.getPrice()+")");
		System.out.println("---------------------------------------------------------------");
	}
}
