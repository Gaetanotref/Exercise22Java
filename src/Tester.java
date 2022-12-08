/**
 * The tester class have the main method and call the method inside WordGames
 * @author Gaetano Trefiletti
 */
public class Tester {
    public static void main(String[] args) {
        WordGames wordGames=new WordGames();
        System.out.println(wordGames.addHelloWord("World"));
        System.out.println(wordGames.getFullName("Gaetano","Trefiletti"));
    }
}
