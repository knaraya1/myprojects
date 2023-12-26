public class Movie implements Comparable<Movie> {

  int price;

  String title;

  public Movie(String title, int price){

    this.title = title;

    this.price = price;

  }

  public String getTitle(){

    return this.title;

  }

  public void setTitle(String newtitle){

    this.title = newtitle;

  }

  public int getPrice(){

    return this.price;

  }

  public void setPrice(int newprice){

    this.price = newprice;

  }

  public int compareTo(Movie o){

    int title_compare = this.title.compareTo(o.getTitle()) ;

    if (title_compare == 0)

        return this.price - o.getPrice();

    else

        return title_compare;

  }

  public static void swap(int a, int b) {

      int temp = a;

      a = b;

      b = temp;

  }

  public static void swap1(Movie a, Movie b) {

      Movie temp = a;

      a = b;

      b = temp;

  }

  public static void swap2(Movie a, Movie b) {

      Movie temp = new Movie(a.getTitle(), a.getPrice());

      a.setTitle(b.getTitle());

      a.setPrice(b.getPrice());

      b.setTitle(temp.getTitle());

      b.setPrice(temp.getPrice());

  }

  public static void main(String argv[]){

    Movie favorite1 = new Movie("Lion King", 19);

    Movie favorite2 = favorite1;

    Movie favorite3 = new Movie(favorite1.getTitle(), favorite1.getPrice());

    if (favorite2.equals(favorite1))

        System.out.println("Both variables refer to the same object!");

    else

        System.out.println("Both variables do not refer to the same object!");

  

    if (favorite3.equals(favorite1))

        System.out.println("Both variables refer to the same object!");   

    else

      if (favorite1.compareTo(favorite3) == 0)

        System.out.println("Same tickets");

      else

        System.out.println("Not same tickets");     

 

    int a = 7;

    int b = 35;

    System.out.println("Before swapping, we have " + a + " and " + b);

    swap(a, b);

    System.out.println("After swapping, we have " + a + " and " + b);

 

    Movie m1 = new Movie("Speakless", 10);

    Movie m2 = new Movie("The Matrix", 19);

    System.out.println("Before swapping, we have " + m1.getTitle() + " and " + m2.getTitle());

    swap1(m1, m2);

    System.out.println("After swapping, we have " + m1.getTitle() + " and " + m2.getTitle());

 

    System.out.println("Before swapping, we have " + m1.getTitle() + " and " + m2.getTitle());

    swap2(m1, m2);

    System.out.println("After swapping, we have " + m1.getTitle() + " and " + m2.getTitle());

 

    Movie movielist1[] = new Movie[2];

    movielist1[0] = new Movie("Lion King", 19);

    movielist1[1] = new Movie("The Matrix", 19);

 

    Movie movielist2[] = movielist1;

    

    return;

  }

}