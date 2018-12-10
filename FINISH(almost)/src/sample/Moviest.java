package sample;

public class Moviest {

    public String title;
    public String director;
    public String actor;
    public int year;
    public double rating;
    public double viewers;

    Moviest (String title, String director, String actor, int year, double rating, double viewers) {
        this.title=title;
        this.director=director;
        this.actor=actor;
        this.year=year;
        this.rating=rating;
        this.viewers=viewers;
    }
    public String getInfoMovies () {
        String filx=("Фильм: " + title + "; Режисер: " + director + "; Актер: "+actor+"; Год: "+year+"; Рейтинг: "+rating+"; Просмотры: "+viewers);
        //System.out.println(filx);
        return filx;
    }
    public String getNewRating(double rating){
        this.rating=rating;
        String filn=("Фильм: " + title + "; Режисер: " + director + "; Актер: "+actor+"; Год: "+year+"; Рейтинг(Новый): "+rating+"; Просмотры: "+viewers);
        //System.out.println(filn);
        return filn;
    }
}

