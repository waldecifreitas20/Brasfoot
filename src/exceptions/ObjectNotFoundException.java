package exceptions;

/** Classe de exce��es que ocorrem caso valor de retorno de uma funcao seja null **/
public class ObjectNotFoundException extends Exception{
    
    public ObjectNotFoundException(String message) {
        super("Impossivel encontrar objeto "+message);
    } 
    
}
