public class AcessoLoginIncorretoException extends RuntimeException {
    public AcessoLoginIncorretoException(String message) {
        super("Login e/ou senha inválido(s)");
    }
}
