// 2. Declare a class called book having author_name as private data member. Extend book class to have two sub classes called book_publication & paper_publication. Each of these classes have private member called title. Write a complete program to show usage of dynamic method dispatch (dynamic polymorphism) to display book or paper publications of given author.Use command line arguments for input data. [A]

import java.util.*;
class Book{
    private String author;
    void setAuthor(String author){
        this.author=author;
    }
    String getAuthor(){
        return author;
    }
}

class BookPublication extends Book{
    private String title;
    void setTitle(String title){
        this.title=title;
    }
    String getTitle(){
        return title;
    }
}

class PaperPublication extends Book{
    private String title;
    void setTitle(String title){
        this.title=title;
    }
    String getTitle(){
        return title;
    }   
}

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        BookPublication bp = new BookPublication();
        System.out.println("Enter Book Author:");
        String bookauthor = sc.nextLine();
        bp.setAuthor(bookauthor);
        System.out.println("Enter Book Title:");
        String booktitle = sc.nextLine();
        bp.setTitle(booktitle);
        PaperPublication pp = new PaperPublication();
        System.out.println("Enter Paper Author:");
        String paperauthor = sc.nextLine();
        pp.setAuthor(paperauthor);
        System.out.println("Enter Paper Title:");
        String papertitle = sc.nextLine();
        pp.setTitle(papertitle);

        System.out.println("-----Book Detail-----");
        System.out.println("Book Author is:"+bp.getAuthor());
        System.out.println("Book Title is:"+bp.getTitle());
        System.out.println("-----Paper Detail-----");
        System.out.println("Paper Author is:"+pp.getAuthor());
        System.out.println("Paper Title is:"+pp.getTitle());
    }
}

