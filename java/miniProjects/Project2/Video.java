package miniProjects.Project2;

public class Video{

    String videoName;
    boolean checkOut;
    int rating;

    Video(String name){
        videoName = name;

    }

    public String getName() {
        return videoName;
    }

    void doCheckout(){
        checkOut = true;
    }

    void doReturn(){
        checkOut = false;
    }

    void receiveRating(int rating){
        this.rating = rating;
    }

    boolean getCheckout(){
        return checkOut;
    }
  
}
