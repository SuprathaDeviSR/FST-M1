package activities;


abstract class Book {
    protected String title;

    public abstract void setTitle(String s);

    public String getTitle() {
        return title;
    }
}


class MyBook extends Book {
    public void setTitle(String s) {
        title = s;
    }
}


public class activity5 {
    public static void main(String[] args) {
        MyBook newNovel = new MyBook();       
        String title = "The Invisible Journey";  

       
        newNovel.setTitle(title);

        
        System.out.println("The title is: " + newNovel.getTitle());
    }
}