package exceptions;

/** Classe de exceções que ocorrem caso valor de retorno de uma funcao seja null **/
public class ObjectNotFoundException extends Exception{
    
    public ObjectNotFoundException(String message) {
        super("Impossivel encontrar objeto "+message);
    } 
    
}
