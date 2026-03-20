public class Autenticador {
    String[] LoginAdm = {"Admin01@"};
    String[] SenhaAdm = {"P@ssw0rd."};

    public boolean validarLogin(String login) {
        if (login.matches("^[a-zA-Z0-9@.\\-]{8,64}$")) {
             for (String loginAtual : LoginAdm) {
                 if (loginAtual.equals(login)) {
                     System.out.println("Login validado com sucesso");
                     return true;
                 }
             }
        }
        System.out.println("Login inválido!");
        return false;
    }

    public boolean validarSenha(String senha) {
        if (senha.matches("^[a-zA-Z0-9@.\\-]{8,64}$")) {
            for (String senhaAtual : SenhaAdm) {
                if (senhaAtual.equals(senha)) {
                    System.out.println("Senha validada com sucesso");
                    return true;
                }
            }
        }
        System.out.println("Senha inválida!");
        return false;
    }
}
