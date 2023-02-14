package Aggregation;

public class Book {
	String bookname;
	int price;
	Author author;
	

	public Book(String bookname, int price, Author author) {
		super();
		this.bookname = bookname;
		this.price = price;
		this.author = author;
	}
	
	void display()
	{
		System.out.println("......Book Details......");
		System.out.println(" Book Name      = " + bookname);
		System.out.println(" Book Price     = " + price);
		System.out.println(" Author Name    = " + author.name);
		System.out.println(" Author Age     = " + author.age);
		System.out.println(" Author Place   = " + author.place);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author a=new Author("Chetan Bhagat ",50,"Delhi");
		Book b=new Book("One Indian Girl",350,a);
		b.display();

	}

}
