package Task2;
// допишите код UserInputException
class UserInputException extends Exception {
    public UserInputException(){

    }
    public UserInputException(final String message){
        super(message);
    }
 

} 
 public class Practicum {
     public static void main(final String[] args) {
        final UserInputException userInputException = new UserInputException("Ошибка ввода!");
        System.out.println(userInputException.getMessage());
     }
}

