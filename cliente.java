public class cliente implements Autenticavel {

    private String nome;

    public cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void autenticar(String usuario, String senha) {
        if (usuario.equals("cliente") && senha.equals("abc")) {
            System.out.println("Cliente " + nome + " autenticado com sucesso.");
        } else {
            System.out.println("Cliente " + nome + " não autenticado.");
        }
    }
}
