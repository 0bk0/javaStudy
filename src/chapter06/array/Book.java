package chapter06.array;

public class Book {
	private String bookName; //클래스 밖에서 접근불가~(멤버변수)
	private String author; //따라서 게터세터로 뭐시기 접근한다고함
	
	public Book() {}
	
	public Book(String bookName,String author) {
		this.bookName=bookName;
		this.author=author;
	}

	public String getBookName() {
		return bookName; //문자열 반환한다는 의미
	}

	public void setBookName(String bookName) { 
		this.bookName = bookName; //초기화 시키겠다는 의미
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookInfo() {
		System.out.println(bookName+", "+author);
	}
	

}
