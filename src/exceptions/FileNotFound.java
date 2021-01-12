/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author downt
 */
// essa classe já existe no java: https://docs.oracle.com/javase/7/docs/api/java/io/FileNotFoundException.html
// Geralmente se usa o nome da classe + Exception
public class FileNotFound extends Exception{

    public FileNotFound(String message) {
        super(message);
    }
    
}
