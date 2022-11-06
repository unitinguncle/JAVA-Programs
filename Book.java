package day06;

abstract class Book{
	public String title;
	public abstract void setTitle(String s);
	public abstract String getTitle();
}

class Mybook extends Book{

	@Override
	public void setTitle(String s) {
		super.title = s;
	}

	@Override
	public String getTitle() {
		return "The title of the book is: "+this.title;
	}
	
}

public class TakeHome {

	public static void main(String[] args) {
		Mybook book = new Mybook();
		book.setTitle("A tale of two cities");
		System.out.println(book.getTitle());
	}

}
