public class oops4 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        // Multiple Inheritance through interface
        Bear b = new Bear();
        b.wover();
        b.beat();
    }
}

interface Herbivore{
    void wover();
}
interface Carnivore{
    void beat();
}
class Bear implements Herbivore, Carnivore{ // Multiple Inheritance from above inheritance 
    public void wover(){
        System.out.println("wovwov");
    }
    public void beat(){
        System.out.println("Dangerous");
    }
}


// Interfaces
interface chessplayer{
    void moves(); // only a blueprint 
}
class Queen implements chessplayer{
    public void moves(){
        System.out.println("Up, down, left, right, diagonla in all 4 directions");

    }
}
class Rook implements chessplayer{
    public void moves(){
        System.out.println("Up, down, left, right");

    }
} 
class King implements chessplayer{
    public void moves(){
        System.out.println("Up, down, left, right, diagonla in all 4 directions by 1 step");

    }
}
