// Arquivo: exceptions/IndiceInvalidoException.java
package exceptions;

// Exceção para índices inválidos (checked)
public class IndiceInvalidoException extends Exception {
    public IndiceInvalidoException(String mensagem) {
        super(mensagem);
    }
}