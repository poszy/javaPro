public class GameEntry {

private String name;   // name f the person earning this score

private int score;

// Constructs a game enttry with given parameters

public GameEntry(String n, int s){
        name  = n;
        score = s;

}   // end Game Entry

public String getName(){
        return name;
}
public int getScore(){
        return score;
}

public String toString() {

        return "(" + name +", " + score + ")";

}

}
