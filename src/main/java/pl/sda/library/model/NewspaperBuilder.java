package pl.sda.library.model;

public class NewspaperBuilder {
    private String title;
    private int number;
    private int pageCount;

    public NewspaperBuilder title(String title){
        this.title=title;
        return this;
    }
    public NewspaperBuilder number(int number){
        this.number=number;
        return this;
    }
    public NewspaperBuilder pageCount (int pageCount){
        this.pageCount=pageCount;
        return this;
    }

    public Newspaper build(){

        Newspaper newspaper= new Newspaper();
        newspaper.setTitle(title);
        newspaper.setNumber(number);
        newspaper.setPageCount(pageCount);
        newspaper.setState(new ReturnedState());
        return newspaper;
    }
}
