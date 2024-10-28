public class Book {
    private String name;
    private String author;
    private int numberOfCopies;

    public Book(){
        this("Unknow", "Unknow", 0);
    }

    public Book(String name, String author, int numberOfCopies){
        this.name = name;
        this.author = author;
        this. numberOfCopies = numberOfCopies;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getNum(){
        return numberOfCopies;
    }

    public void setNum(int numberOfCopies){
        this.numberOfCopies = numberOfCopies;
    }
}
