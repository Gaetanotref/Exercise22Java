/**
 * The class create two method that return a string
 * @author Gaetano Trefiletti
 */
public class WordGames {
    /**
     * The first method return a string and a parameter
     * @param word the parameter is a string we choose
     * @return the method return the concatenation of Hello and the param
     */
    public String addHelloWord(String word){
        return "Hello "+word;
    }

    /**
     * The second method return two parameter
     * @param name the first parameter is a string of name
     * @param surname the second parameter is a string of surname
     * @return the method return the concatenation of the parameters
     */
    public String getFullName(String name,String surname){
        return name +" "+surname;
    }

}
