package exceptionsAll;

public class AccidentException extends RuntimeException {
    //public AccidentException() {System.exit(-1);}
    public AccidentException(String message){
        super(message);
    }

}
