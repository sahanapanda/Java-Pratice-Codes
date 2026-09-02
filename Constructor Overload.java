class Book{
    String title;
    String author;
    double price;


    //Default
    Book(){
        this.title = "Java Book";
        this.author = "ABC";
        this.price = 500.0;
    }


    //One Parameter
    Book(String title){
        this.title = title;
        this.author = "ABC";
        this.price = 500.0;
    }


    //Two Parameters
    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.price = 500.0;
    }


    //Three Parameters
    Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }


    void display(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }
}


class Main{
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("Oops Book");
        Book b3 = new Book("Python Book", "DEF");
        Book b4 = new Book("C Book", "GHI", 700.0);
       
        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}
