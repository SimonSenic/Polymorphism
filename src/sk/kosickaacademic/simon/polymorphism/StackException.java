package sk.kosickaacademic.simon.polymorphism;

public class StackException extends Exception{
    public StackException(String message){
        super(message);
    }

    @Override
    public String getMessage(){
        return super.getMessage();
    }

}
