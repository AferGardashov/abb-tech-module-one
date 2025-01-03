package homeworks.homework11;

public class InvalidInputException extends Exception{

    @Override
    public String getMessage(){
        return "Input is not in the range.";
    }

}
