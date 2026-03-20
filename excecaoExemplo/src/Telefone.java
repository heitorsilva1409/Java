public class Telefone {
    private String telefone;

    public Telefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean validarTelefone(String telefone) throws TelefoneInvalidoException{
        if (telefone.matches("^\\([0-9]{2}\\)[0-9]{5}-[0-9]{4}")) {
            return true;
        }
        else {
            throw new TelefoneInvalidoException();
        }
    }
}