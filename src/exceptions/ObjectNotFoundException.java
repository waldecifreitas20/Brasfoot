package exceptions;

public class ObjectNotFoundException extends Exception{
    
    public ObjectNotFoundException(String message) {
        super("Impossivel encontrar objeto "+message);
    } 
    
}
